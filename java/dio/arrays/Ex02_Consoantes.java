package arrays;

import java.util.Scanner;

public class Ex02_Consoantes {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String[] consoantes = new String[6];
        String letra;
        int cont = 0, numC = 0;

         while (cont < consoantes.length) {
             System.out.println("Digite uma letra qualquer:");
             letra = leitura.next();

              if (!(letra.equalsIgnoreCase("a") |
                      letra.equalsIgnoreCase("e") |
                      letra.equalsIgnoreCase("i") |
                      letra.equalsIgnoreCase("o") |
                      letra.equalsIgnoreCase("u"))) {
                  consoantes[cont] = letra;
                  numC++;
                  System.out.println("É uma consoante!!");

              }
             cont++;

         }
        System.out.println("Total de consoantes:"+ numC);
        System.out.print("Consoantes:");

        for (String  consoante: consoantes ) { //Para cada elemento(nova variável) leia uma Array //
            if (consoante != null) {
                System.out.print(consoante+" ");
            }

        }
    }
}
