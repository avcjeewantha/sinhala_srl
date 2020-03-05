package sinhala.semantic.annotator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Annotator {
    public static void main(String args[]) {
        final Logger logger = LoggerFactory.getLogger(Annotator.class);
        logger.error("Project is starting...");
        EnglishPipeline pipeline = new EnglishPipeline();
        // Initiate scanner
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter a string");
            String userInput = sc.nextLine();
            if (userInput.equals("e")){
                break;
            }else{
                Sentence parsedSL = pipeline.parse(userInput);
                logger.info(parsedSL.toConllU());
            }

        }


    }
}
