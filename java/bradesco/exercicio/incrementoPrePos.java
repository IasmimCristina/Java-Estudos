/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author yellowred
 */
public class incrementoPrePos {

    /**
     * @param args the command line arguments
     * Aula 29 no Youtube.
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int a = 10;
        // Qual a diferença?
        int b = a++;
        // Qual será o resultado?
        System.out.println(a); // B recebe A sem o incremento, e ele é feito após B for modificado. 
        System.out.println(b);
        int c = 10;
        int d = ++c;
        System.out.println(c);
        System.out.println(d); // O incremento é feito primeiro!
                
        
    }
}
