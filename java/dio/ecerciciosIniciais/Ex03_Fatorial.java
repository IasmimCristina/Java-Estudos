import java.util.Scanner;

public class Ex03_Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int fatorial;
        int multi = 1;


        System.out.println("Você deseja o fatorial de:");
        fatorial = leitura.nextInt();



        for (int cont = fatorial; cont>=1; cont --){

            multi = multi*cont;
            System.out.print(" 5"+"x"+cont+" ");



        }

        System.out.println(":"+ multi+".");


    }


}
