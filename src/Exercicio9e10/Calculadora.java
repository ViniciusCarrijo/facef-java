package Exercicio9e10;

import java.util.List;

public class Calculadora {

    public static Double somar(Double valor1, Double valor2) {
        return valor1 + valor2;
    }

    public static Double subtrair(Double valor1, Double valor2) {
        return valor1 - valor2;
    }

    public static Double dividir(Double valor1, Double valor2) {
        return valor1 / valor2;
    }

    public static Double multiplicar(Double valor1, Double valor2) {
        return valor1 * valor2;
    }

    public static Integer somaMultipla(List<Integer> valores) {
        Integer soma = 0;
        for ( int i=0; i<valores.size(); i++ ) {
            soma += valores.get(i);
        }
        return soma;
    }
}
