package io.eddvance.practice.choices;

import io.eddvance.practice.translations.FrenchTranslation;

import java.util.Scanner;
import java.util.logging.Logger;


public class Choices {

    Logger logger = Logger.getLogger(getClass().getName());
    Scanner scanner;

    public Choices() {
        FrenchTranslation frenchTranslation = new FrenchTranslation();
    }

    private int numberChoice() {
        logger.info("What is the numberAsked to translate ?");
        scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();
        Integer numberAsked = null;

        try {
            numberAsked = Integer.parseInt(numberAsString);
            logger.info(numberAsked);
        } catch (NumberFormatException nfe) {
            System.out.println("The numberAsked had to be numeric");
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
            logger.info(option);
        } catch (NumberFormatException nfe) {
            logger.info("The option had to be numeric");
            System.exit(0);
        }
        return option;
    }

    private String getFrenchTranslation(Integer integer) {
        String translated=frenchTranslations.get(n-1);
        logger.info(translated);
        return translated;
    }

}
 /*public void //...Check that the option is 1 or 2
        if (option == 1) {
            //String translated = frenchTranslations.get(number - 1);
            //System.out.println(translated);