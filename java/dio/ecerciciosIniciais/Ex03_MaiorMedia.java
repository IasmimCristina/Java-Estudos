import java.util.Scanner;

public class Ex03_MaiorMedia {
    public static void main(String[] args) {
        Scanner  leitura = new Scanner(System.in);
        int cont = 0;
        float maior = 0;
        float num;
        float soma = 0;
        float media;

        do {
            System.out.println("Digite um número:");
            num = leitura.nextFloat();
            cont++;
            soma = soma + num;

            if (num>= maior){
                maior = num;

            }

        } while (cont <=4);



        media = soma/5;
        System.out.println("O maior número digitado foi " + maior + ".");
        System.out.println("A média dos números inseridos foi " + media + ".");



    }
}
