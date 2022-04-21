package arrays;

import java.util.Random;


public class Ex03_NumerosAleatorios {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int[] numeros = new int[20];
        int sucessor;
        System.out.println("---Números aleatórios---");
        System.out.println("------------------------");

        for (int cont = 0; cont < numeros.length; cont++) {
            int num = aleatorio.nextInt(100); //Bound significa limite. //
            numeros[cont] = num;
            sucessor = numeros[cont] + 1;
            System.out.println("------------------------");
            System.out.println("Posição do número:"+ cont);
            System.out.println("Número gerado:"+ numeros[cont]);
            System.out.println("Sucessor:"+ sucessor);
            System.out.println("------------------------");

        }

        /*for ( int numGerado : numeros) {
            //int contador = 0;//
            //contador ++;  Contador parece não funcionar.//
            System.out.println("------------------------");
            //System.out.println("Posição do número:"+ contador);//
            System.out.println("Número gerado:"+numGerado);
            System.out.println("Sucessor:"+(numGerado + 1));
            System.out.println("------------------------");


        }*/
    }

}
