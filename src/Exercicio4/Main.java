package Exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Desenvolva um programa que identifique se um dado número é primo. */
        System.out.print("\nDigite um número para validarmos se ele é primo ou não: ");
        int isImpar = scanner.nextInt();
        scanner.nextLine();

        if( isImpar % 2 == 0 ) {
            System.out.println("O número "+ isImpar + " é par");
        } else {
            System.out.println("O número "+ isImpar + " é impar");
        }

    }

}
