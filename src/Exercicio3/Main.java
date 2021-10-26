package Exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Desenvolva um programa que solicita ao usuário uma String. Inverta essa String. */
        System.out.print("\nDigite uma palavra/frase: ");
        String frase = scanner.nextLine();
        String fraseInvertida = "";
        for (int i=frase.length(); i>0; i--) {
            fraseInvertida += frase.substring(i-1, i);
        }
        System.out.println(fraseInvertida);
    }

}
