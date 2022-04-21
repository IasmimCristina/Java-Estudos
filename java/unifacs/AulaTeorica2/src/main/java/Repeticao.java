/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yellowred
 */
import java.util.Scanner;
public class Repeticao {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        int  resposta = 2;
        
        while (resposta%2  == 0 ) {
            
            System.out.println("Insira um número:");
            resposta = leitura.nextInt();
        }
        System.out.println("Parece que o número que você inseriu não é par!");
 
        
        
        
                
        
        
    }
    
}
