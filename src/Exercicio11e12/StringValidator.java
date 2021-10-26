package Exercicio11e12;

import java.security.InvalidParameterException;

public class StringValidator {

    public String validaString (String entrada) {
        if (entrada.length() < 8) {
            throw new IllegalArgumentException("Sua string possui menos de 8 caracteres.");
        }

        if (entrada.substring(0, 1).equals("A") == false) {
            throw new IllegalArgumentException("Sua string deve iniciar com a letra \"A\".");
        }

        return "Palavra digitada: " + entrada;
    }

}
