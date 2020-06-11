package sinhala.semantic.annotator;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Annotator {
    private static final Logger logger = LogManager.getLogger(Annotator.class);
    private static LanguageDAO languageDAO = LanguageDAO.getInstance();

    public static void main(String args[]) {



        logger.info("Project is starting...");
        PipelineWrapper slPipeline = languageDAO.getPipeline(Language.ENGLISH);
        PipelineWrapper tlPipeline = languageDAO.getPipeline(Language.SINHALA);

        // Initiate scanner
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter English Sentence: ");
            String sourceSentence = sc.nextLine();
            System.out.println("Enter Sinhala Sentence: ");
            String targetSentence = sc.nextLine();

            if (sourceSentence.equals("e") || targetSentence.equals("e")){
                break;
            }else{
                Sentence parsedSL = slPipeline.parse(sourceSentence.trim());
//                logger.info(parsedSL.toConllU());

                Sentence parsedTL = tlPipeline.parse(targetSentence.trim());
//                logger.info(parsedTL.toConllU());

                ProcessedSentence processedSentence = alignAndProject(parsedSL, parsedTL, Language.SINHALA);
//                String json = new Gson().toJson(processedSentence);
//                logger.info("json = " + json);
            }

        }





    }

    /**
     * Internal method that executes annotation projection for a sentence pair and target language
     *
     * @param parsedSL Parsed English source sentence
     * @param parsedTL Parsed target language sentence
     * @param targetLanguage Target language
     * @return Object containing all information on the annotation transfer for display in UI
     */
    private static  ProcessedSentence alignAndProject(Sentence parsedSL, Sentence parsedTL, Language targetLanguage) {

        logger.debug(parsedSL);
        logger.debug(parsedTL);

        AnnotationTransfer transfer = new AnnotationTransfer();

        BiSentence parallelSentence_srlonly = new BiSentence(parsedSL, parsedTL);
        parallelSentence_srlonly.align(languageDAO.getAligner(targetLanguage));
        transfer.transferShallowSemantics(parallelSentence_srlonly);

        logger.debug(parallelSentence_srlonly.toString());
        logger.debug(parsedTL);

        BiSentence parallelSentence_projected = new BiSentence(parsedSL, Sentence.fromTokenized(parsedTL.toSentence()));
        parallelSentence_projected.copyAlignments(parallelSentence_srlonly);
        transfer.transfer(parallelSentence_projected);

        logger.debug(parallelSentence_projected.toString());
        logger.debug(parallelSentence_projected.getSentenceTL());

        return getProcessedSentence(parallelSentence_projected, parsedTL);
    }


    /**
     * Internal method that prepares all information for the JSON object that is passed to the UI. This method is messy
     * and may be removed in the future if we find a better UI solution.
     *
     * @param projection BiSentence with source and target sentences
     * @param parsedTL_predicted Predicted target sentence
     * @return Object containing all information on the annotation transfer for display in UI
     */
    private static ProcessedSentence getProcessedSentence(BiSentence projection, Sentence parsedTL_predicted) {

        ProcessedSentence processedSentence = new ProcessedSentence();

        processedSentence.sourceSentence = projection.getSentenceSL().toSentence().replaceAll(" ", "   ");
        processedSentence.targetSentence = parsedTL_predicted.toSentence().replaceAll(" ", "   ");
        processedSentence.tokensSL = Lists.newArrayList();
        processedSentence.tokensTL_predicted = Lists.newArrayList();
        processedSentence.tokensTL_projected = Lists.newArrayList();
        processedSentence.framesSL = Lists.newArrayList();
        processedSentence.framesTL_predicted = Lists.newArrayList();
        processedSentence.framesTL_projected = Lists.newArrayList();
        processedSentence.nerSL = Lists.newArrayList();
        processedSentence.nerTL_projected = Lists.newArrayList();

        Map<Token, Integer> tokenOffsetMapSL = Maps.newHashMap();
        int offs = 0;
        for (Token token : projection.getSentenceSL().getTokens()) {
            tokenOffsetMapSL.put(token, offs);
            offs += token.getText().length() + 3;
        }

        Map<Integer, Integer> tokenOffsetMapTL_offset = Maps.newHashMap();
        offs = 0;
        for (Token token : parsedTL_predicted.getTokens()) {
            tokenOffsetMapTL_offset.put(token.getId(), offs);
            offs += token.getText().length() + 3;
        }

        for (Token token : projection.getSentenceSL().getTokens()) {
            Integer start = tokenOffsetMapSL.get(token);
            ArrayList<Object> entry = Lists.newArrayList();
            entry.add("SL" + token.getId());
            entry.add(Lists.newArrayList(start, start + token.getText().length()));
            entry.add(token.getPosUniversal().replaceAll("PUNCT", "P"));
            processedSentence.tokensSL.add(entry);
        }

        int level = 0;

        for (Constituent ner : projection.getSentenceSL().getNER()) {
            String description = ner.getType();
            Integer start = tokenOffsetMapSL.get(ner.getTokens().get(0));
            ArrayList<Object> con = Lists.newArrayList();
            con.add(description);
            con.add(Lists.newArrayList(start, start + ner.toStringFull().replaceAll(" ", "   ").length()));
            con.add(level);
            processedSentence.nerSL.add(con);
        }

        level = 1;
        for (Token token : projection.getSentenceSL().getTokens()) {

            if (token.evokesFrame() && !token.getFrame().getLabel().equals("be.03")) {
                Integer start = tokenOffsetMapSL.get(token);
                ArrayList<Object> entry = Lists.newArrayList();
                Frame frame = token.getFrame();
                entry.add(frame.getLabel());
                entry.add(Lists.newArrayList(start, start + token.getText().length()));
                entry.add(level);
                processedSentence.framesSL.add(entry);

                for (Role role : frame.getRoles()) {

                    Constituent constituent = role.getRoleHead().getConstituent(token);
                    String description = role.getRoleLabel().replaceAll("AM-", "");

                    start = tokenOffsetMapSL.get(constituent.getTokens().get(0));
                    ArrayList<Object> con = Lists.newArrayList();
                    con.add(description);
                    con.add(Lists.newArrayList(start, start + constituent.toStringFull().replaceAll(" ", "   ").length()));
                    con.add(level);
                    processedSentence.framesSL.add(con);
                }
                level++;
            }
        }

        level = 0;
        for (Constituent ner : parsedTL_predicted.getNER()) {
            String description = ner.getType();
            Integer start = tokenOffsetMapTL_offset.get(ner.getTokens().get(0).getId());
            ArrayList<Object> con = Lists.newArrayList();
            con.add(description);
            con.add(Lists.newArrayList(start, start + ner.toStringFull().replaceAll(" ", "   ").length()));
            con.add(level);
            processedSentence.nerTL_projected.add(con);
        }
        level = 1;
        for (Token token : parsedTL_predicted.getTokens()) {
            if (token.evokesFrame() && !token.getFrame().getLabel().equals("be.03")) {
                Integer start = tokenOffsetMapTL_offset.get(token.getId());
                ArrayList<Object> entry = Lists.newArrayList();
                Frame frame = token.getFrame();
                entry.add(frame.getLabel());
                entry.add(Lists.newArrayList(start, start + token.getText().length()));
                entry.add(level);
                processedSentence.framesTL_predicted.add(entry);

                for (Role role : frame.getRoles()) {

                    Constituent constituent = role.getRoleHead().getConstituent(token);
                    String description = role.getRoleLabel().replaceAll("AM-", "");
                    start = tokenOffsetMapTL_offset.get(constituent.getTokens().get(0).getId());
                    ArrayList<Object> con = Lists.newArrayList();
                    con.add(description);
                    con.add(Lists.newArrayList(start, start + constituent.toStringFull().replaceAll(" ", "   ").length()));
                    con.add(level);
                    processedSentence.framesTL_predicted.add(con);
                }
                level++;
            }
        }

        level = 0;
        for (Constituent ner : projection.getSentenceTL().getNER()) {
            String description = ner.getType();
            Integer start = tokenOffsetMapTL_offset.get(ner.getTokens().get(0).getId());
            ArrayList<Object> con = Lists.newArrayList();
            con.add(description);
            con.add(Lists.newArrayList(start, start + ner.toStringFull().replaceAll(" ", "   ").length()));
            con.add(level);
            processedSentence.nerTL_projected.add(con);
        }


        level = 1;
        for (Token token : projection.getSentenceTL().getTokens()) {
            if (token.evokesFrame() && !token.getFrame().getLabel().equals("be.03")) {
                Integer start = tokenOffsetMapTL_offset.get(token.getId());
                ArrayList<Object> entry = Lists.newArrayList();
                Frame frame = token.getFrame();
                entry.add(frame.getLabel());
                entry.add(Lists.newArrayList(start, start + token.getText().length()));
                entry.add(level);
                processedSentence.framesTL_projected.add(entry);

                for (Role role : frame.getRoles()) {

                    Constituent constituent = role.getRoleHead().getConstituent(token);
                    String description = role.getRoleLabel().replaceAll("AM-", "");
                    start = tokenOffsetMapTL_offset.get(constituent.getTokens().get(0).getId());
                    ArrayList<Object> con = Lists.newArrayList();
                    con.add(description);
                    con.add(Lists.newArrayList(start, start + constituent.toStringFull().replaceAll(" ", "   ").length()));
                    con.add(level);
                    processedSentence.framesTL_projected.add(con);
                }
                level++;
            }
        }

        for (Token token : parsedTL_predicted.getTokens()) {
            Integer start = tokenOffsetMapTL_offset.get(token.getId());
            ArrayList<Object> entry = Lists.newArrayList();
            entry.add("TL" + token.getId());
            entry.add(Lists.newArrayList(start, start + token.getText().length()));
            entry.add(token.getPosUniversal().replaceAll("PUNCT", "P"));
            processedSentence.tokensTL_predicted.add(entry);
        }

        for (Token token : projection.getSentenceTL().getTokens()) {
            Integer start = tokenOffsetMapTL_offset.get(token.getId());
            ArrayList<Object> entry = Lists.newArrayList();
            entry.add("TL" + token.getId());
            entry.add(Lists.newArrayList(start, start + token.getText().length()));
            entry.add(token.getPosUniversal().replaceAll("PUNCT", "P"));
            processedSentence.tokensTL_projected.add(entry);
        }

        processedSentence.alignments = Lists.newArrayList();

        int count = 1;
        for (Table.Cell<Token, Token, Double> alignment : projection.aligments.cellSet()) {
            processedSentence.alignments.add(Lists.newArrayList("A" + count++, "SL" + alignment.getRowKey().getId(), "TL" + alignment.getColumnKey().getId()));
        }

        processedSentence.arcsSL = Lists.newArrayList();
        count = 1;
        for (Token token : projection.getSentenceSL().getTokens()) {
            if (token.getHeadId() > 0) {
                if (token.getId() < token.getHeadId())
                    processedSentence.arcsSL.add(Lists.newArrayList("ASL" + count++, "SL" + token.getId(), "SL" + token.getHeadId(), token.getDeprel()));
                else
                    processedSentence.arcsSL.add(Lists.newArrayList("ASL" + count++, "SL" + token.getHeadId(), "SL" + token.getId(), token.getDeprel()));
            }
        }

        processedSentence.arcsTL_predicted = Lists.newArrayList();
        for (Token token : parsedTL_predicted.getTokens()) {
            if (token.getHeadId() > 0) {
                if (token.getId() < token.getHeadId())
                    processedSentence.arcsTL_predicted.add(Lists.newArrayList(token.getDeprel(), "TL" + token.getId(), "TL" + token.getHeadId(), token.getDeprel()));
                else
                    processedSentence.arcsTL_predicted.add(Lists.newArrayList(token.getDeprel(), "TL" + token.getHeadId(), "TL" + token.getId(), token.getDeprel()));
            }
        }

        processedSentence.arcsTL_projected = Lists.newArrayList();
        for (Token token : projection.getSentenceTL().getTokens()) {
            if (token.getHeadId() > 0 && !token.getDeprel().equals("?")) {
                if (token.getId() < token.getHeadId())
                    processedSentence.arcsTL_projected.add(Lists.newArrayList(token.getDeprel(), "TL" + token.getId(), "TL" + token.getHeadId(), token.getDeprel()));
                else
                    processedSentence.arcsTL_projected.add(Lists.newArrayList(token.getDeprel(), "TL" + token.getHeadId(), "TL" + token.getId(), token.getDeprel()));
            }
        }

        return processedSentence;
    }
}
