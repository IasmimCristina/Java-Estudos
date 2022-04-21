package arrays;

import java.util.Random;

public class Ex04_ArraysMultidimensionais {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int [][]  matriz = new int[4/*linhas*/][4/*colunas*/];

        // Usamos o símbolo '<' pois inicializamos as variáveis contadoras com 0


        System.out.println("-----------Elementos da matriz-----------");
        for (int linha = 0 ;  linha < matriz.length ;linha++)//Percorrendo a linha.// )
         {
            for (int coluna = 0 ; coluna < matriz[linha].length;coluna++) {
                matriz[linha][coluna] = aleatorio.nextInt(9);

                System.out.println("Número na posição da linha "+linha+" na coluna "+coluna+": "+ +matriz[linha][coluna]+".");

            }

        }
        System.out.println("---Matriz---");
        for ( int[] linhaa /*Variável fica aqui. Ela é criada. */ : matriz /*A matriz fica aqui para ser percorrida.*/) {
            for ( int elementoColuna : linhaa  ) {
                System.out.print(" "+elementoColuna+" ");

            }
            System.out.println(); //Para que outra linha seja pulada.

        }

    }
}
