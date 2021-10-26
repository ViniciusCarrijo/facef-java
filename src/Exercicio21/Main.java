package Exercicio21;

public class Main {

    public static void main(String[] args) {
        /* Crie uma classe Exercicio21.Aluno com os atributos Nome, RG e Idade. Sobreescreva o método
        equals() de forma que dois alunos sejam considerados iguais apenas se possuírem o
        mesmo RG. */
        System.out.println("\nExercicio alunos: ");
        Aluno alunoA = new Aluno("Vinicius Manso Carrijo", "44807185837", 23);
        Aluno alunoB = new Aluno("Vinicius Manso Carrijo", "11111111111", 24);
        Aluno alunoC = new Aluno("Um cara qualquer", "44807185837", 25);

        System.out.println( "alunoA.equals(alunoB): " + alunoA.equals( (Object)alunoB ) );
        System.out.println( "alunoB.equals(alunoC): " + alunoB.equals( (Object)alunoC ) );
        System.out.println( "alunoC.equals(alunoA): " + alunoA.equals( (Object)alunoA ) );
    }

}
