package io.eddvance.practice.choice;

import io.eddvance.practice.exceptions.NumberAskedCantNotBeEmpty;
import io.eddvance.practice.exceptions.NumberAskedMustBe1to30;
import io.eddvance.practice.interaction.InputReader;

import java.util.Scanner;
import java.util.logging.Logger;

public class NumberToChoice {

    private InputReader inputReader;
    private final Logger logger = Logger.getLogger(getClass().getName());
    private Scanner scanner = new Scanner(System.in);
    private Scanner mockScanner;
    private int numberAskedInt;

    public NumberToChoice(InputReader inputReader, Scanner scanner) throws NumberAskedMustBe1to30 {
        this.inputReader = inputReader != null ? inputReader : new InputReader();
        this.scanner = scanner != null ? scanner : new Scanner(System.in);
    }

    public NumberToChoice() {
        this(new InputReader(), new Scanner(System.in));
    }

    public int getNumberAskedInt() {
        return numberAskedInt;
    }

    public void setNumberAskedInt(int numberAskedInt) {
        this.numberAskedInt = numberAskedInt;
    }


    public int numberChoice() {
        while (true) {
            try {
                logger.info("What is the number to translate?");
                String numberAskedAsString = inputReader.readLine();

                if (numberAskedAsString == null || numberAskedAsString.isEmpty()) {
                   logger.warning("Input cannot be empty. Please try again.");
                    continue;
                }

                numberAskedInt = Integer.parseInt(numberAskedAsString);

                if (numberAskedInt < 1 || numberAskedInt > 30) {
                    logger.warning("Please enter a number between 1 and 30.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                logger.warning("Invalid input. Please enter a valid number.");
            }
        }
        return numberAskedInt;
    }
}