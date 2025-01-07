package io.eddvance.practice.exceptions;

public class NumberAskedMustBeNumeric extends RuntimeException{
    public NumberAskedMustBeNumeric(String message) {
        super(message);
    }
}
