import java.util.Scanner;

public class exemploqualquer {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float[] exemplo = new float[4];

        for (int cont = 0;cont<4 ;cont++) {
            System.out.println("Digite um número float/double:");
            exemplo[cont] = leitura.nextFloat();
        }

        for ( float exibicao:exemplo ) {
            System.out.println(exibicao);

        }


    }
}
