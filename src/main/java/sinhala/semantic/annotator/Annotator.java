package sinhala.semantic.annotator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Annotator {
    public static void main(String args[]) {
        final Logger logger = LoggerFactory.getLogger(Annotator.class);
        logger.error("Project is starting...");
        EnglishPipeline pipeline = new EnglishPipeline();
        Sentence parsedSL = pipeline.parse("I am going home");
        logger.info(parsedSL.toConllU());
    }
}
