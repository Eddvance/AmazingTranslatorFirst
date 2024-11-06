package io.eddvance.practice.applicatif;

import java.util.Scanner;
import java.util.logging.Logger;

public class TranslationToChoice {

    private final InputReader inputReader;
    private final Logger logger = Logger.getLogger(getClass().getName());
    private Scanner scanner = new Scanner(System.in);
    private Scanner mockScanner;
    private int languageSelection;

    public TranslationToChoice(InputReader inputReader, Scanner scanner) {
        this.inputReader = inputReader != null ? inputReader : new InputReader();
        this.scanner = scanner != null ? scanner : new Scanner(System.in);
    }

    public TranslationToChoice() {
        this(new InputReader(), new Scanner(System.in));
    }

    public int getLanguageSelection() {
        return languageSelection;
    }

    public void setLanguageSelection(int languageSelection) {
        this.languageSelection = languageSelection;
    }

    public int translationChoice() {

        boolean inputValid = false;
        while (!inputValid) {
            logger.info("What is language (1-French, 2-German)?");
            String optionAsString = inputReader.readLine();

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