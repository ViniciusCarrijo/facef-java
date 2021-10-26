package Exercicio18;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        /* Faça um HashSet e insira as Strings “String A”, “String B” e “String C” cada uma duas
        vezes, percorra todos os elementos e imprima-os. Observe o resultado. Quantos
        elementos têm a coleção? */
        System.out.println("\nExercicio HashSet: ");
        HashSet<String> setString = new HashSet<>();

        setString.add("String A");
        setString.add("String A");
        setString.add("String B");
        setString.add("String B");
        setString.add("String C");
        setString.add("String C");

        setString.forEach( item -> System.out.println(item) );
        System.out.println("Quantidade de item (HashSet): " + setString.size());
    }

}
