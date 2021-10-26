package Exercicio9e10;

public class Main {

    public static void main(String[] args) {
        /* Faça uma classe Exercicio9e10.Calculadora que realize as 4 operações matemáticas básicas sobre dois
        valores (double) passados como parâmetros e retorne o resultado. Crie um programa
        que realize as 4 operações e imprima os resultados obtidos. */
        System.out.println("\nExercicio9e10.Calculadora: ");
        System.out.println( Calculadora.somar(1D,2D) );
        System.out.println( Calculadora.subtrair(1D,2D) );
        System.out.println( Calculadora.dividir(1D,2D) );
        System.out.println( Calculadora.multiplicar(1D,2D) );

        /* Faça uma classe Exercicio9e10.CalculadoraComercial, esta classe deve realizar, além das 4 operações
        básicas, o cálculo de porcentagens a partir de 2 parâmetros: o valor total (double) e a
        porcentagem a ser obtida (integer) retornando o resultado.  */
        System.out.println("\nExercicio9e10.CalculadoraComercial: ");
        System.out.println( CalculadoraComercial.porcentagem(1000D,10D) );
    }

}
