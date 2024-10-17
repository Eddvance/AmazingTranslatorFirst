package io.eddvance.practice.applicatif;

import java.util.logging.Logger;

import static io.eddvance.practice.translations.FrenchTranslation.getFrenchTranslations;
import static io.eddvance.practice.translations.GermanTranslation.getGermanTranslations;

public class SearchAndReturn {

    public String getTranslation(Integer number, int languageSelection) {

        String translation = null;
        Logger logger = Logger.getLogger(getClass().getName());

        if (languageSelection == 1) {
            if (number > 0 && number <= getFrenchTranslations().size()) {
                translation = getFrenchTranslations().get(number - 1);
                logger.info("The number " + number + " in french is : " + translation);//not easy using .fine
            } else {
                logger.severe("Numero invalide, entrez un nombre entre 1 et 30");
            }

        } else if (languageSelection == 2) {
            if (number > 0 && number <= getGermanTranslations().size()) {
                translation = getGermanTranslations().get(number - 1);
                logger.info("The number " + number + " in German is : " + translation);//not easy using .fine
            } else {
                logger.severe("Numéro invalide, entrez un nombre entre 1 et ");
            }
        }
        return translation;
    }
}