import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double n = 3.14159;
        double raio, area;

        raio = leitura.nextInt();
        area =  n * (Math.pow(raio,raio));
        System.out.printf("A=%.4f", area);





    }
    // Com printf use ',' para concatenar os termos.
}
