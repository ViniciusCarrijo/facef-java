package Exercicio11e12;

public class Main {

    public static void main(String[] args) {
         /* Elabore um programa em Java que possua um método que recebe uma String como
        parâmetro e caso esta String tenha menos que 8 caracteres, lance uma Exception*/
        System.out.println("\nLançando exception: ");
        StringValidator stringvalidator = new StringValidator();
        try{
            //Wrong
            stringvalidator.validaString("Carrijo");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try{
            //Wrong
            stringvalidator.validaString("BCarrijo");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try{
            //Correct
            stringvalidator.validaString("ACarrijo");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
