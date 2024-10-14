package io.eddvance.practice.choices;

import java.util.logging.Logger;

import static io.eddvance.practice.translations.FrenchTranslation.getFrenchTranslations;
import static io.eddvance.practice.translations.GermanTranslation.getGermanTranslations;

public class SearchAndReturn {

    public void getTranslation(Integer number) {

        Logger logger = Logger.getLogger(getClass().getName());
        Choices choices = new Choices();

        if (number == null) {
            logger.severe("Le numéro fourni est nul !");
            return;
        }
        int choix = choices.translationChoice();
        String translation = null;

        if (choix == 1) {
            System.out.println(getFrenchTranslations().size());
            if (number > 0 && number <= getFrenchTranslations().size()) {
                translation = getFrenchTranslations().get(number - 1);
                logger.severe("Le nombre " + number + " en français est : " + getFrenchTranslations().size());
            } else {
                logger.info("Numero invalide, entrez un nombre entre 1 et 30");
            }

        } else if
        (choix == 2) {
            if (number > 0 && number <= getGermanTranslations().size()) {
                translation = getGermanTranslations().get(number - 1);
                logger.info("Le nombre " + number + " en allemand est : " + translation);
            } else {
                logger.info("Numéro invalide, entrez un nombre entre 1 et " + getGermanTranslations().size());
            }
        }
    }
}