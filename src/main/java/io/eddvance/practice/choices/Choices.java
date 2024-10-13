package io.eddvance.practice.choices;

import java.util.Scanner;
import java.util.logging.Logger;

public class Choices {

    private final Logger logger = Logger.getLogger(getClass().getName());
    private Scanner scanner= new Scanner(System.in);

    public Integer getNumberAsked() {
        return numberAsked;
    }

    private Integer numberAsked;

    public int numberChoice() {
        logger.info("What is the number to translate ?");
        String numberAsString = scanner.nextLine();

        try {
            numberAsked = Integer.parseInt(numberAsString);
            logger.info(""+numberAsked);
        } catch (NumberFormatException nfe) {
            logger.severe("The numberAsked had to be numeric");
            System.exit(0);//a suivre
        }
        return numberAsked;
    }

    public int translationChoice() {
        logger.info("What is language (1-French, 2-German)?");
        String optionAsString = scanner.nextLine();
        Integer option = null;

        try {
            option = Integer.parseInt(optionAsString);
            logger.info(""+option);
        } catch (NumberFormatException nfe) {
            logger.severe("The option had to be numeric");
        }
        return option;
    }
}