package io.eddvance.practice.choices;

import io.eddvance.practice.translations.FrenchTranslation;
import io.eddvance.practice.translations.GermanTranslation;

import java.util.logging.Logger;

import static io.eddvance.practice.translations.FrenchTranslation.frenchTranslations;
import static io.eddvance.practice.translations.GermanTranslation.germanTranslations;

public class SearchAndReturn {

    public static void getTranslation(Integer number) {

        Logger logger = Logger.getLogger(SearchAndReturn.class.getName());
        FrenchTranslation frenchTranslation = new FrenchTranslation();
        GermanTranslation germanTranslation = new GermanTranslation();
        Choices choices = new Choices();
        number = choices.numberAsked;
        int choix = choices.translationChoice();
        String translation = null;

        if (choix == 1) {
            if (number > 0 && number <= frenchTranslations.size()) {
                translation = frenchTranslations.get(number - 1);
                logger.info("Le nombre " + number + " en français est : " + translation);
            }

        } else if
        (choix == 2) {
            if (number > 0 && number <= germanTranslations.size()) {
                translation = germanTranslation.get(number - 1);
                logger.info("Le nombre " + number + " en allemand est : " + translation);
            }

        }
    }
}

/*
logger.info("Numéro invalide, entrez un nombre entre 1 et " + frenchTranslations.size());
            return null;
 */

/*
else {
                logger.info("Numéro invalide, entrez un nombre entre 1 et " + frenchTranslations.size());
                //return null;
            }
 */