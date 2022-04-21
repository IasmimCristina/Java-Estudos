package Arrays;

import java.util.Scanner;

public class arraysNum {
    public static void main(String[] args) {
        //10 numeros e a soma deles.
        Scanner leitura = new Scanner(System.in);
        int[] lista = new int[10];
        int soma = 0;

        for (int cont = 0; cont < lista.length ; cont++) {
            System.out.println("Digite um número qualquer:");
            lista[cont] = leitura.nextInt();
            soma = soma + lista[cont];
        }
        System.out.println("A soma dos 10 números inseridos foi "+soma+".");



    }
}
