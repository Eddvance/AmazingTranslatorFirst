package io.eddvance.practice.repository;

import io.eddvance.practice.translations.FrenchTranslation;

public class SearchAndReturn {

    public static String getFrenchTranslation(int number) {
        for (Object[] frenchTranslations : frenchTranslation.getFrenchTranslations(number)) {
            if ((int)frenchTranslations[0] == number) {
                // Retourne la traduction (deuxième élément du tableau)
                return (String) frenchTranslations[1];
            }
        }
        return "Not found";
    }
}