package Exercicio17;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* Faça um ArrayList e insira as Strings “String A”, “String B” e “String C” cada uma duas
        vezes, percorra todos os elementos e imprima-os. Observe o resultado. Quantos
        elementos têm a coleção? */
        System.out.println("\nExercicio ArrayList: ");
        List<String> arrayString = new ArrayList<>();

        arrayString.add("String A");
        arrayString.add("String A");
        arrayString.add("String B");
        arrayString.add("String B");
        arrayString.add("String C");
        arrayString.add("String C");

        arrayString.forEach( item -> System.out.println(item) );
        System.out.println("Quantidade de itens (ArrayList): " + arrayString.size());
    }

}
