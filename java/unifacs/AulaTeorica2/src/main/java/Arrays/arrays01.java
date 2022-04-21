package Arrays;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class arrays01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random aleatorio = new Random(5);
        String[] lista = {"Carne","Cebola","Frango","Vegetais","Pimenta", "Alho"};
        int comt = lista.length;


        System.out.println("----Lista de compras----");
        System.out.println("------------------------");

        /*for () {

        }*/
        for ( String comida: lista ) {
            System.out.println("--------- "+comida+" -----------");

        }
    }
}
