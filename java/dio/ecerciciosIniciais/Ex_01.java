import java.util.Scanner;
public class Ex_01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome;
        int idade;

        while (true){
            System.out.println("Por favor, digite o seu  primeiro nome:");
            nome = leitura.next();
            if (nome.equals("0")) break; /*Para o bloco e não todo o programa!*/
            System.out.println("Por favor, digite a sua idade:");
            idade = leitura.nextInt();

        }
        System.out.println("O 'break' parou o loop!");

    }

}
