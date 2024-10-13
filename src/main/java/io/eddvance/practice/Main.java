package io.eddvance.practice;

import io.eddvance.practice.choices.Choices;
import io.eddvance.practice.choices.SearchAndReturn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Choices choices = new Choices();
        SearchAndReturn searchAndReturn = new SearchAndReturn();
        choices.numberChoice();
        choices.translationChoice();
        searchAndReturn.getTranslation(choices.numberChoice());
    }
}