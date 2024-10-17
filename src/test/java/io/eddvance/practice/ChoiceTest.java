package io.eddvance.practice;

import io.eddvance.practice.applicatif.Choices;
import io.eddvance.practice.applicatif.InputReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChoiceTest {

    private Choices choices;  // Classe qui contient la méthode translationChoice()
    //private Scanner mockScanner;
    private InputReader mockInputReader;

    @BeforeEach
    public void setup() {
        // Mock du Scanner
        //mockScanner = Mockito.mock(Scanner.class);
        mockInputReader = Mockito.mock(InputReader.class);

        // Initialisation de la classe principale avec un mock du scanner
        choices = new Choices(mockInputReader);
    }

    @Test
    void testValidInput1() {
        // Simuler l'entrée utilisateur "1"
        //Mockito.when(mockScanner.nextLine()).thenReturn("1");
        Mockito.when(mockInputReader.readLine()).thenReturn("1");
        // Tester que l'utilisateur choisit bien la langue 1 (French)
        int result = choices.translationChoice();
        assertEquals(1, result);  // Vérifie que la sélection est 1 (French)
    }

    @Test
    void testValidInput2() {
        // Simuler l'entrée utilisateur "2"
        Mockito.when(mockInputReader.readLine()).thenReturn("2");

        // Tester que l'utilisateur choisit bien la langue 2 (German)
        int result = choices.translationChoice();
        assertEquals(2, result);  // Vérifie que la sélection est 2 (German)
    }

    @Test
    void testInvalidInputThenValid() {
        // Simuler une entrée invalide puis une entrée valide "2"
        Mockito.when(mockInputReader.readLine())
                .thenReturn("abc")  // Entrée invalide
                .thenReturn("2");   // Entrée valide

        // Tester que la méthode finit par choisir "2" après une entrée invalide
        int result = choices.translationChoice();
        assertEquals(2, result);  // Vérifie que la sélection est 2 (German) après correction
    }
}