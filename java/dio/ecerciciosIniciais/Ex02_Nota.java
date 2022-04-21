import java.util.Scanner;

public class Ex02_Nota {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float nota;

        do {
            System.out.println("Digite uma nota entre 0 a 10:");
            nota = leitura.nextInt();
            if (nota>10 || nota<0) {
                System.out.println("Nota inválida!");
            }

        } while(nota>10 || nota<0);

        System.out.println("Você digitou uma nota válida!");

    }
}
