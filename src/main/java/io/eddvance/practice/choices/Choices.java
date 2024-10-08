package io.eddvance.practice.choices;

import java.util.Scanner;

public class Choices {

    static Scanner scanner;
    public static Integer numberAsked = null;
    public int numberChoice() {
        System.out.println("What is the numberAsked to translate ?");
        scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();
        
        try {
            numberAsked = Integer.parseInt(numberAsString);
            System.out.println(numberAsked);
        } catch (NumberFormatException nfe) {
            System.out.println("The numberAsked had to be numeric");
            System.exit(0);//a suivre
        }
        return numberAsked;
    }

    public int translationChoice() {
        System.out.println("What is language (1-French, 2-German)?");
        String optionAsString = scanner.nextLine();
        Integer option = null;

        try {
            option = Integer.parseInt(optionAsString);
            System.out.println(option);
        } catch (NumberFormatException nfe) {
            System.out.println("The option had to be numeric");
            System.exit(0);
                    /*public void //...Check that the option is 1 or 2
        if (option == 1) {
            //String translated = frenchTranslations.get(number - 1);
            //System.out.println(translated);
        }
     */
        }
        return option;
    }
}