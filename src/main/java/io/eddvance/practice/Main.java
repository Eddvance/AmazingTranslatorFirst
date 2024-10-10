package io.eddvance.practice;

import io.eddvance.practice.repository.SearchAndReturn;
import io.eddvance.practice.choices.Choices;

import static io.eddvance.practice.choices.Choices.numberAsked;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Choices choices = new Choices();
        choices.numberChoice();
        choices.translationChoice();
        //SearchAndReturn.getFrenchTranslation(numberAsked);
    }
}