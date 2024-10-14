package io.eddvance.practice;

import io.eddvance.practice.choices.Choices;
import io.eddvance.practice.choices.SearchAndReturn;
import io.eddvance.practice.translations.FrenchTranslation;
import io.eddvance.practice.translations.GermanTranslation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        FrenchTranslation frenchTranslation = new FrenchTranslation();
        frenchTranslation.frenchTranslation();
        GermanTranslation germanTranslation =new GermanTranslation();
        germanTranslation.germanTranslation();

        SearchAndReturn searchAndReturn = new SearchAndReturn();
        Choices choices = new Choices();

        choices.numberChoice();
        choices.translationChoice();
        searchAndReturn.getTranslation(choices.translationChoice());
    }
}