package io.eddvance.practice.choices;

import java.util.Scanner;

public class Choices {

    //private final Logger logger = Logger.getLogger(getClass().getName());
    private final Scanner scanner = new Scanner(System.in);

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

        //logger.info("What is the number to translate ?");
        System.out.println("What is the number to translate ?");
        String numberAsString = scanner.nextLine();

        try {
            numberAsked = Integer.parseInt(numberAsString);
            //logger.info(""+numberAsked);
            System.out.println(numberAsked);
        } catch (NumberFormatException nfe) {
            //logger.severe("The numberAsked had to be numeric");
            System.out.println("The numberAsked had to be numeric");
            System.exit(0);
        }
        return numberAsked;
    }


    public int translationChoice() {

        boolean inputValid = false;
        while (!inputValid) {
            System.out.println("What is language (1-French, 2-German)?");
            String optionAsString = scanner.nextLine();
            //logger.info("What is language (1-French, 2-German)?");

            try {
                languageSelection = Integer.parseInt(optionAsString);
                if (languageSelection == 1 || languageSelection == 2) {
                    inputValid = true;  // Sort de la boucle si la saisie est correcte
                } else {
                    System.out.println("Please enter a valid option: 1 for French, 2 for German.");
                    //logger.info(""+languageSelection);
                    System.out.println(languageSelection);
                }
            } catch (NumberFormatException nfe) {
                // logger.severe("The languageSelection had to be numeric");
                System.out.println("The languageSelection had to be numeric");
                return translationChoice();
            }
        }
        return languageSelection;
    }
}