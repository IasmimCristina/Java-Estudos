/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author yellowred
 */
import java.util.Arrays;
public class array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] paises = {"BRASIL", "RÚSSIA", "ÍNDIA", "CHINA"};
        System.out.println(paises[0]);
        System.out.println(Arrays.toString(paises));
        int posicao = Arrays.binarySearch (paises, "BRASIL");
        System.out.println(posicao);
        Arrays.sort (paises,0,paises.length);
        System.out.println(Arrays.toString (paises));
        
    }
}
