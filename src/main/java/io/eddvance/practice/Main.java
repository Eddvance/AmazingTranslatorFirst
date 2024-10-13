package io.eddvance.practice;

import io.eddvance.practice.choices.Choices;
import io.eddvance.practice.choices.SearchAndReturn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SearchAndReturn searchAndReturn = new SearchAndReturn();
        Choices choices = new Choices();
        choices.translationChoice();
        choices.numberChoice();
        searchAndReturn.getTranslation(choices.translationChoice());
    }
}