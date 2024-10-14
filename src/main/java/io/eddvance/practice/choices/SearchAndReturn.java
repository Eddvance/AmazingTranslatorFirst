package io.eddvance.practice.choices;

import java.util.logging.Logger;

import static io.eddvance.practice.translations.FrenchTranslation.frenchTranslations;
import static io.eddvance.practice.translations.GermanTranslation.germanTranslations;

public class SearchAndReturn {

    public String getTranslation(Integer number, int languageSelection) {

        String translation=null;
        Logger logger = Logger.getLogger(getClass().getName());

        if (languageSelection == 1) {
            if (number > 0 && number <= frenchTranslations.size()) {
                translation = frenchTranslations.get(number - 1);
                logger.severe("The number " + number + " in french is : " + translation);
            } else {
                logger.info("Numero invalide, entrez un nombre entre 1 et 30");
            }

        } else if (languageSelection == 2) {
            if (number > 0 && number <= germanTranslations.size()) {
                translation = germanTranslations.get(number - 1);
                logger.info("The number " + number + " in German is : " + translation);
            } else {
                logger.info("Numéro invalide, entrez un nombre entre 1 et ");
            }
        }
        return translation;
    }
}