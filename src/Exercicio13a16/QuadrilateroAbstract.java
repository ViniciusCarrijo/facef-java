package Exercicio13a16;

public abstract class QuadrilateroAbstract {
    private Integer ladoA;
    private Integer ladoB;
    private Integer ladoC;
    private Integer ladoD;

    public QuadrilateroAbstract(final Integer ladoA, final Integer ladoB, final Integer ladoC, final Integer ladoD) {
        if( ladoA <= 0 || ladoB <= 0 || ladoC <=0 || ladoD <= 0 ) {
            throw new IllegalArgumentException("Valor inválido, o valor deve ser maior que 0");
        }

        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

}
