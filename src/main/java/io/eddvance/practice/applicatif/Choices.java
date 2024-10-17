package io.eddvance.practice.applicatif;

import java.util.Scanner;
import java.util.logging.Logger;

public class Choices {

    private InputReader inputReader;
    private final Logger logger = Logger.getLogger(getClass().getName());
    private final Scanner scanner = new Scanner(System.in);
    private Scanner mockScanner;
    private int numberAsked;
    private int languageSelection;

    public Choices(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    public Choices() {
        this.mockScanner = null;
    }

    public Choices(Scanner mockScanner) {
        this.mockScanner = mockScanner;
    }

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

    /////////////////////////////////
    public int numberChoice() {

        logger.info("What is the number to translate ?");
        String numberAsString = inputReader.readLine();

        try {
            numberAsked = Integer.parseInt(numberAsString);
        } catch (NumberFormatException nfe) {
            logger.severe("The numberAsked had to be numeric");
            System.exit(0);// a modifier
        }
        return numberAsked;
    }
/////////////////////////////////

    public int translationChoice() {

        boolean inputValid = false;
        while (!inputValid) {
            logger.info("What is language (1-French, 2-German)?");
            String optionAsString = scanner.nextLine();

            try {
                languageSelection = Integer.parseInt(optionAsString);
                if (languageSelection == 1 || languageSelection == 2) {
                    inputValid = true;
                } else {
                    logger.severe("Please enter a valid option: 1 for French, 2 for German.");
                }
            } catch (NumberFormatException nfe) {
                logger.severe("The languageSelection had to be numeric");
            }
        }
        return languageSelection;
    }
}