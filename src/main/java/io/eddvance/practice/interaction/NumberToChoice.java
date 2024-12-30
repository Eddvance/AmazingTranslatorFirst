package io.eddvance.practice.interaction;

import java.util.Scanner;
import java.util.logging.Logger;

public class NumberToChoice {

    private InputReader inputReader;
    private final Logger logger = Logger.getLogger(getClass().getName());
    private Scanner scanner = new Scanner(System.in);
    private Scanner mockScanner;
    private int numberAsked;

    public NumberToChoice(InputReader inputReader, Scanner scanner) throws NumberAskedMustBe1to30 {
        this.inputReader = inputReader != null ? inputReader : new InputReader();
        this.scanner = scanner != null ? scanner : new Scanner(System.in);
    }

    public NumberToChoice() {
        this(new InputReader(), new Scanner(System.in));
    }
    public int getNumberAsked() {
        return numberAsked;
    }
    public void setNumberAsked(int numberAsked) {
        this.numberAsked = numberAsked;
    }


    public int numberChoice() {
        logger.info("What is the number to translate ?");
        String numberAsString = inputReader.readLine();
        if (numberAsked < 1 || numberAsked > 30) {
            throw new NumberAskedMustBe1to30("The number must be between 1 and 30.");
        }
        //if (numberAsked.isEmpty()) {
        //throw new NumberAskedMustBe1to30("The number must be between 1 and 30.");
        // }
        //if(numberAsString.length() > 1)
        try {
            numberAsked = Integer.parseInt(numberAsString);
        } catch (NumberFormatException nfe) {
            logger.severe("The numberAsked had to be numeric");
            System.exit(0);// a modifier
        }
        return numberAsked;
    }
}