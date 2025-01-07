package io.eddvance.practice.exceptions;

public class NumberAskedMustBe1to30 extends RuntimeException {
    public NumberAskedMustBe1to30(String message) {
        super(message);
    }
}
