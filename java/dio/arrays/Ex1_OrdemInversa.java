package arrays;

import java.util.Scanner;

public class Ex1_OrdemInversa
{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int[] vetor = {45, -45, -78, 95, -4, -70};
        // Posição 0, 1, 2 e etc. Length mostra 6 posições, mas não existe a posição 6.//


        // Ordem inversa //
        // Não há posição 6! Por isso usamos o -1. Isso funciona para <=.//
        /*for(int cont =5; cont >= 0; cont--) {
            System.out.println(vetor[cont]);
        }*/
        //Ordem natural //

        /*int[] vetor = {45, -45, -78, 95, -4, -70};
        for (int cont = 0; cont <=(vetor.length -1) ;cont++) {
            System.out.println(vetor[cont]);

        }
        System.out.println("--------");

        for (int cont = 0; cont < (vetor.length); cont++) {
            System.out.println(vetor[cont]);

        }*/
    }
}
