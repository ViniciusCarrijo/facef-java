package Exercicio6;

public class Main {

    public static void main(String[] args) {
        /* Faça um programa que imprima os quadrados dos números inteiros pares entre 5 e 20. */
        System.out.println("\nRaiz entre 5 e 20");
        for (int i=5; i<=20; i++) {
            if ( i % 2 == 0 ) {
                System.out.println(i + "*" + i + "=" + i*i);
            }
        }
    }

}
