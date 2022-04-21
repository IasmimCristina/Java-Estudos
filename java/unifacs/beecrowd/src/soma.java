import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int A, B, PROD;
        A = leitura.nextInt();
        B = leitura.nextInt();
        PROD = A * B;
        System.out.println("PROD = "+ PROD);
    }
}
