package Exercicio19;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        /* Faça um HashMap e insira as Strings “String A”, “String B” e “String C” cada uma duas
        vezes, utilize o numeral como chave, percorra todos os elementos e imprima-os.
        Observe o resultado. Quantos elementos têm a coleção? */
        System.out.println("\nExercicio HashMap: ");
        HashMap<Integer, String> mapString = new HashMap<>();

        mapString.put(1, "String A");
        mapString.put(2, "String A");
        mapString.put(3, "String B");
        mapString.put(4, "String B");
        mapString.put(5, "String C");
        mapString.put(6, "String C");

        mapString.forEach( (chave, valor) -> System.out.println("Chave: " + chave + " Valor: "+ valor) );
        System.out.println("Quantidade de item (HashMap): " + mapString.size());
    }

}
