import java.text.DecimalFormat;
import java.util.Scanner;


public class media_1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");

        double A = leitura.nextDouble();
        double B = leitura.nextDouble();

        double media = ((A * 3.5) + (B * 7.5)) / 2;
        System.out.println("MEDIA = "+ media);


    }
}
