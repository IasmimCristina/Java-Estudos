package lista2;

import java.util.Scanner;

public class numerosImpares {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int X = 0;
        while (!(1<= X && X <= 1000)) {
            X = leitura.nextInt();

        }

        for (int cont = 1; cont <= X;cont++) {
            if (!(cont%2 == 0)) {
                System.out.println(cont);

            }


        }

    }
}
