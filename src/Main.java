import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        /*
        Escreva um programa que declare, inicialize e imprima as seguintes variáveis:
            Inteiro i de 32 bits com valor 1;
            Inteiro j de 64 bits com valor 2;
            Ponto flutuante p de 32 bits com valor 20.0;
            Ponto flutuante q de 64 bits com valor 30.0;
            Booleano b com valor verdadeiro;
            Caractere c com valor ‘k’;
        */
        short Inteiro32bits = 1;
        int Inteiro64bits = 2;
        float Flutuante32bits = 20.0f;
        float Flutuante64bits = 30.0f;
        boolean BooleanoB = true;
        char CaracterC = 'k';

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

        /* Desenvolva um programa que solicita ao usuário uma String. Inverta essa String. */
        System.out.print("\nDigite uma palavra/frase: ");
        String frase = scanner.nextLine();
        String fraseInvertida = "";
        for (int i=frase.length(); i>0; i--) {
            fraseInvertida += frase.substring(i-1, i);
        }
        System.out.println(fraseInvertida);


        /* Desenvolva um programa que identifique se um dado número é primo. */
        System.out.print("\nDigite um número para validarmos se ele é primo ou não: ");
        int isImpar = scanner.nextInt();
        scanner.nextLine();

        if( isImpar % 2 == 0 ) {
            System.out.println("O número "+ isImpar + " é par");
        } else {
            System.out.println("O número "+ isImpar + " é impar");
        }

        /* Escreva um programa que calcule o salário de um profissional a partir do valor hora e
        da quantidade de horas trabalhadas. O resultado deve ser um número ponto-flutuante. */
        System.out.print("\nInforme o salário do funcionário p/hora: ");
        Double valorHora = scanner.nextDouble();
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        Double qntHoras = scanner.nextDouble();
        Double salarioFinal = valorHora * qntHoras;
        System.out.println("O salário a pagar é de: " + salarioFinal);

        /* Faça um programa que imprima os quadrados dos números inteiros pares entre 5 e 20. */
        System.out.println("\nRaiz entre 5 e 20");
        for (int i=5; i<=20; i++) {
            if ( i % 2 == 0 ) {
                System.out.println(i + "*" + i + "=" + i*i);
            }
        }

        /* Crie um programa que percorra um array de 5 posições e imprima o seu conteúdo. */
        System.out.println("\nArray 5 posições");
        int[] arrayNumerico = new int[5];
        for (int i=0; i<arrayNumerico.length; i++) {
            arrayNumerico[i] = i+1;
            System.out.println(arrayNumerico[i]);
        }

        /* Escreva um programa que calcule a média de um array de 5 posições. */
        int media = 0;
        for (int i=0; i<arrayNumerico.length; i++) {
            media += arrayNumerico[i];
        }
        media = media / arrayNumerico.length;
        System.out.println("Média: " + media);

        /* Faça uma classe Calculadora que realize as 4 operações matemáticas básicas sobre dois
        valores (double) passados como parâmetros e retorne o resultado. Crie um programa
        que realize as 4 operações e imprima os resultados obtidos. */
        System.out.println("\nCalculadora: ");
        System.out.println( Calculadora.somar(1D,2D) );
        System.out.println( Calculadora.subtrair(1D,2D) );
        System.out.println( Calculadora.dividir(1D,2D) );
        System.out.println( Calculadora.multiplicar(1D,2D) );

        /* Faça uma classe CalculadoraComercial, esta classe deve realizar, além das 4 operações
        básicas, o cálculo de porcentagens a partir de 2 parâmetros: o valor total (double) e a
        porcentagem a ser obtida (integer) retornando o resultado.  */
        System.out.println("\nCalculadoraComercial: ");
        System.out.println( CalculadoraComercial.porcentagem(1000D,10D) );
    }

}
