package lista2;

public class numerosPares {
    public static void main(String[] args) {
        // Números pares de 1 até 100, incluindo esses dois.
        int cont = 1;

        while (cont<=100) {
            if (cont%2 == 0) {

                System.out.println(cont);

            }
            cont++;

        }
    }
}
