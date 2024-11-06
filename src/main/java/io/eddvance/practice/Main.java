package io.eddvance.practice;

import io.eddvance.practice.applicatif.TranslationToChoice;
import io.eddvance.practice.applicatif.SearchAndReturn;
import io.eddvance.practice.translations.FrenchTranslation;
import io.eddvance.practice.translations.GermanTranslation;

import java.util.Scanner;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final Logger logger = Logger.getLogger(Main.class.getName());
        final Scanner scanner = new Scanner(System.in);
        String restart;

        do {
            FrenchTranslation frenchTranslation = new FrenchTranslation();
            frenchTranslation.frenchTranslation();
            GermanTranslation germanTranslation = new GermanTranslation();
            germanTranslation.germanTranslation();

            SearchAndReturn searchAndReturn = new SearchAndReturn();
            TranslationToChoice choices = new TranslationToChoice();

            int number = choices.numberChoice();
            int languageSelection = choices.translationChoice();

            String translation = searchAndReturn.getTranslation(number, languageSelection);
            logger.fine(() -> "Your translation is : " + translation);
            logger.info("Do you want to translate another number? (yes/no)");
            restart = scanner.nextLine();
        }
        while (restart.equalsIgnoreCase("yes"));
        logger.severe("Au revoir - Auf Wiedersehen");
    }
}