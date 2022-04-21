/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author yellowred
 */
public class operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double x = 7 + 8;
        double y = 18 - 5;
        double z = 9 * 9;
        double a = 40 % 3;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    // Operadores e seus sinais:
        double negativo = -5;
        System.out.println(negativo);
        int num = 18;
        int pre = ++num;
        System.out.println("Pré-incremento:"+pre+".");
        
        int num2 = 20;
        int pos = num2++;
        System.out.println("Segundo número:" + num2);
        System.out.println("Pós-incremento:" + pos);
        System.out.println("Pós-incremento:" + pos);
        // Explicação sobre os incrementos no arquivo incrementoPrePos.java!
        boolean ba = true;
        boolean bb = false;
        boolean bc = true;
        System.out.println( ba && bb);
        System.out.println(ba && bc); // É só modificar o && pelo || ou ! antes de cada termo.
                
    }
}
