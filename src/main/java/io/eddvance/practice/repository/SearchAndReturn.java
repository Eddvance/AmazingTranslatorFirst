package io.eddvance.practice.repository;

import io.eddvance.practice.translations.FrenchTranslation;
import io.eddvance.practice.translations.GermanTranslation;

import java.util.List;
import java.util.logging.Logger;

public class SearchAndReturn {

    public String getTranslation(Integer number) {

        Logger logger = Logger.getLogger(getClass().getName());
        FrenchTranslation frenchTranslation = new FrenchTranslation();
        GermanTranslation germanTranslation = new GermanTranslation();
        List<String> frenchTranslations = frenchTranslation.getFrenchTranslations();
        List<String> germanTranslations = germanTranslation.getGermanTranslations();

        //redefinir la methode pour, en fonction du choix, faire une recherche dans 1 des deux tableaux et afficher le resultat
        if (number > 0 && number <= frenchTranslations.size()) {
            String translation = frenchTranslations.get(number - 1); // -1 car les listes commencent à l'index 0

            logger.info("Le nombre " + number + " en français est : " + translation);
            return translation;
        } else {
           logger.info("Numéro invalide, entrez un nombre entre 1 et " + frenchTranslations.size());
            return null;
        }
    }
}