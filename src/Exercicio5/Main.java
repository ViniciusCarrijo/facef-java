package Exercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Escreva um programa que calcule o salário de um profissional a partir do valor hora e
        da quantidade de horas trabalhadas. O resultado deve ser um número ponto-flutuante. */
        System.out.print("\nInforme o salário do funcionário p/hora: ");
        Double valorHora = scanner.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        Double qntHoras = scanner.nextDouble();
        Double salarioFinal = valorHora * qntHoras;
        System.out.println("O salário a pagar é de: " + salarioFinal);
    }

}
