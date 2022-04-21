import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int tabuada, result;

        System.out.println("Tabuada de:");
        tabuada = leitura.nextInt();

        for (int cont = 0; cont <11; cont++){
            result = tabuada*cont;

            System.out.println(tabuada+"x"+cont+"="+result+".");

        }
        System.out.println("Fim da tabuada de "+tabuada+"!");
    }



}
