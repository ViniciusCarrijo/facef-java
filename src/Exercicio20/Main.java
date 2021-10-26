package Exercicio20;

import Exercicio9e10.Calculadora;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* Calcule a média de 10 números presentes num List */
        System.out.println("\nExercicio média de um arraylist de 10 posições: ");
        List<Integer> arrayListMedia = new ArrayList<>();
        for ( int i=1; i<=10; i++ ) {
            arrayListMedia.add(i);
        }
        // [1,2,3,4,5,6,7,8,9,10]

        int arraySum = Calculadora.somaMultipla(arrayListMedia);
        int arrayMedia = arraySum / arrayListMedia.size();

        System.out.println("Array: " + arrayListMedia);
        System.out.println("Soma: " + arraySum);
        System.out.println("Média: " + arrayMedia);
    }

}
