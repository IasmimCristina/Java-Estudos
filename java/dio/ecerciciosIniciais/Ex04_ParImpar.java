import java.util.Scanner;

public class Ex04_ParImpar {
    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            int quanti, num, par = 0, impar = 0;

            do {
                System.out.println("Digite quantos números serão enviados:");
                quanti = leitura.nextInt();
            } while (quanti <= 0);
            //Cuidado com a variável 'cont'. Ela pode começar a contar por 0 se  somente "<" ou ">" for usado.    //
            int cont = 0; //Neste caso, deve ser menor que 'quanti'.//
            while (cont < quanti) {
                System.out.println("Digite um número:");
                num = leitura.nextInt();
                cont++;
                if (num % 2 == 0) {
                    par++;

                } else{
                    impar++;
                }


            }
            System.out.println("Quantidade de números pares:"+ par+".");
            System.out.println("Quantidade de números ímpares:"+ impar+".");
        }


    }
}
