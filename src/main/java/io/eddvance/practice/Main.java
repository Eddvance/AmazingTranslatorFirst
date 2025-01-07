package io.eddvance.practice;

import io.eddvance.practice.choice.NumberToChoice;
import io.eddvance.practice.exceptions.AuRevoirException;
import io.eddvance.practice.search.SearchAndReturn;
import io.eddvance.practice.translation_directory.FrenchTranslation;
import io.eddvance.practice.translation_directory.GermanTranslation;
import io.eddvance.practice.translator.TranslationToChoice;

import java.util.Scanner;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {

        final Logger logger = Logger.getLogger(Main.class.getName());
        final Scanner scanner = new Scanner(System.in);
        String restart;

        do {
            String translation = getString();
            logger.fine(() -> STR."Your translation is : \{translation}");
            logger.info("Do you want to translate another number? (y)");
            restart = scanner.nextLine();
        }
        while (restart.equalsIgnoreCase("y"));
        throw new AuRevoirException("Au revoir - Auf Wiedersehen");
    }

    private static String getString() {
        FrenchTranslation frenchTranslation = new FrenchTranslation();
        frenchTranslation.frenchTranslation();
        GermanTranslation germanTranslation = new GermanTranslation();
        germanTranslation.germanTranslation();

        SearchAndReturn searchAndReturn = new SearchAndReturn();
        TranslationToChoice translationToChoice = new TranslationToChoice();
        NumberToChoice numberToChoice = new NumberToChoice();

        int number = numberToChoice.numberChoice();
        int languageSelection = translationToChoice.translationChoice();

        return searchAndReturn.getTranslation(number, languageSelection);
    }
}