package Exercicio7;

public class Main {

    public static void main(String[] args) {
        /* Crie um programa que percorra um array de 5 posições e imprima o seu conteúdo. */
        System.out.println("\nArray 5 posições");
        int[] arrayNumerico = new int[5];
        for (int i=0; i<arrayNumerico.length; i++) {
            arrayNumerico[i] = i+1;
            System.out.println(arrayNumerico[i]);
        }
    }

}
