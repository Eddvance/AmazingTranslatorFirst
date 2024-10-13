package io.eddvance.practice.choices;

import io.eddvance.practice.translations.FrenchTranslation;
import io.eddvance.practice.translations.GermanTranslation;

import java.util.logging.Logger;

import static io.eddvance.practice.translations.FrenchTranslation.frenchTranslations;
import static io.eddvance.practice.translations.GermanTranslation.germanTranslations;

public class SearchAndReturn {

    public static String getTranslation(Integer number) {

        Logger logger = Logger.getLogger(SearchAndReturn.class.getName());
        FrenchTranslation frenchTranslation = new FrenchTranslation();
        GermanTranslation germanTranslation = new GermanTranslation();
        Choices choices = new Choices();
        number = choices.numberAsked;

        if (number == 1) {
            if (number > 0 && number <= frenchTranslations.size()) {
                String translation = frenchTranslations.get(number - 1);
                logger.info("Le nombre " + number + " en français est : " + translation);
                return translation;
            }
            logger.info("Numéro invalide, entrez un nombre entre 1 et " + frenchTranslations.size());
            return null;
        } else if (number == 2) {
            if (number > 0 && number <= germanTranslations.size()) {
                String translation = frenchTranslations.get(number - 1);
                logger.info("Le nombre " + number + " en allemand est : " + translation);
                return translation;

            } else {
                logger.info("Numéro invalide, entrez un nombre entre 1 et " + frenchTranslations.size());
                return null;
            }
        }
        return null;
    }
}