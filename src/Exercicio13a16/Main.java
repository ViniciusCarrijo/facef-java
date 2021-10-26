package Exercicio13a16;

public class Main {

    public static void main(String[] args) {
        /* Crie uma classe abstrata que represente um quadrilátero e receba como parâmetros do
        construtor os quatro valores referentes a cada lado.

        Estenda a classe criada no exercício anterior, a subclasse deve representar um quadrado
        e, portanto, receber como parâmetro um único valor referente aos seus lados.
        */

        try{
            QuadrilateroAbstract q = new Quadrado(0);
        } catch ( IllegalArgumentException e ) {
            System.out.println(e.getMessage());
        }
    }

}
