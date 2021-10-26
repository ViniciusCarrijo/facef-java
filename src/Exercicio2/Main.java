package Exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Implemente um programa que recebe um número de 1 a 12 e imprime o mês correspondente. */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do mês que deseja: ");
        int mesEntrada = scanner.nextInt();
        scanner.nextLine();
        String mes = "";
        switch (mesEntrada) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                mes = "Nenhum mês corresponde ao valor informado!";
                break;
        }
        System.out.println("Numero informado " + mesEntrada + "; " + mes);
    }

}
