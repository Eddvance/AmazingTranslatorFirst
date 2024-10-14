package io.eddvance.practice.choices;

import java.util.Scanner;
import java.util.logging.Logger;

public class Choices {

    private final Logger logger = Logger.getLogger(getClass().getName());
    private final Scanner scanner= new Scanner(System.in);

    public int getNumberAsked() {
        return numberAsked;
    }

    public void setNumberAsked(int numberAsked) {
        this.numberAsked = numberAsked;
    }

    public int getLanguageSelection() {
        return languageSelection;
    }

    public void setLanguageSelection(int languageSelection) {
        this.languageSelection = languageSelection;
    }

    private int numberAsked;
    private int languageSelection;

    public int numberChoice() {
        logger.info("What is the number to translate ?");
        String numberAsString = scanner.nextLine();

        try {
            numberAsked = Integer.parseInt(numberAsString);
            logger.info(""+numberAsked);
        } catch (NumberFormatException nfe) {
            logger.severe("The numberAsked had to be numeric");
            System.exit(0);
        }
        return numberAsked;
    }

    public int translationChoice() {
        logger.info("What is language (1-French, 2-German)?");
        String optionAsString = scanner.nextLine();

        try {
            languageSelection = Integer.parseInt(optionAsString);
            logger.info(""+languageSelection);
        } catch (NumberFormatException nfe) {
            logger.severe("The languageSelection had to be numeric");
        }
        return languageSelection;
    }
}