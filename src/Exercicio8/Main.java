package Exercicio8;

public class Main {

    public static void main(String[] args) {
        /* Escreva um programa que calcule a média de um array de 5 posições. */
        int[] arrayNumerico = new int[5];
        int media = 0;
        for (int i=0; i<arrayNumerico.length; i++) {
            arrayNumerico[i] = i+1;
            media += arrayNumerico[i];
        }
        media = media / arrayNumerico.length;
        System.out.println("Média: " + media);
    }

}
