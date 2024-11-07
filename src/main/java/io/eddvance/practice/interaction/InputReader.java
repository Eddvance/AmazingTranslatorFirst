package io.eddvance.practice.interaction;

import java.util.Scanner;

public class InputReader {
    private final Scanner scanner;

    // Constructeur qui initialise le Scanner sur System.in
    public InputReader() {
        this.scanner = new Scanner(System.in);
    }

    // Méthode pour lire une ligne d'entrée utilisateur
    public String readLine() {
        return scanner.nextLine();  // Utilise Scanner à la place de System.console()
    }
}