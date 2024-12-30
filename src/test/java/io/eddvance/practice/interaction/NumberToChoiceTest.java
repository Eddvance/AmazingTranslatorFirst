package io.eddvance.practice.interaction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class NumberToChoiceTest {

    @Mock
    private InputReader mockInputReader;

    @InjectMocks
    private NumberToChoice numberToChoice;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testNumberChoiceWithValidInput() {
        // Simule une entrée utilisateur valide
        when(mockInputReader.readLine()).thenReturn("15");

        int result = numberToChoice.numberChoice();

        assertEquals(15, result, "Le nombre attendu est 15");
        assertEquals(15, numberToChoice.getNumberAsked(), "Le champ numberAsked devrait être mis à jour à 15");
    }

    @Test
    public void testNumberChoiceWithInvalidInput_NonNumeric() {
        // Simule une entrée non numérique
        when(mockInputReader.readLine()).thenReturn("abc");

        // Vérifie que la méthode `numberChoice` lance une exception pour une entrée non numérique
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            numberToChoice.numberChoice();
        });
        assertTrue(exception.getMessage().contains("numeric value is required"));
    }

    @Test
    public void testNumberChoiceWithInvalidInput_OutOfRange() {
        // Simule une entrée numérique hors de la plage
        when(mockInputReader.readLine()).thenReturn("50");

        // Vérifie que la méthode `numberChoice` lance une exception pour une valeur hors de la plage
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            numberToChoice.numberChoice();
        });
        assertTrue(exception.getMessage().contains("must be between 1 and 30"));
    }

    @Test
    public void testSetNumberAsked() {
        // Vérifie la mise à jour de numberAsked via le setter
        numberToChoice.setNumberAsked(10);
        assertEquals(10, numberToChoice.getNumberAsked(), "Le champ numberAsked doit être 10 après l'appel de setNumberAsked");
    }
}