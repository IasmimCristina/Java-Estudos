package metodosEfuncoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numero1, numero2;
        int escolha;
        Scanner leitura = new Scanner(System.in);
        /*System.out.println("--------------");
        System.out.println("--Calculadora--");
        System.out.println("___1.Soma___");
        System.out.println("___2.Subtração___");
        System.out.println("___3.Multiplicação___");
        System.out.println("___4.Divisão___");

        System.out.println("Sua escolha:");
        escolha = leitura.nextInt();
        */


        //Calculadora
        Calculadora.soma(6,4); // Podemos chamar por conta da classe**5 static
        Calculadora.divisao(8,4);
        Calculadora.multiplicacao(5,4);
        Calculadora.subtracao(15,5);



        //Mensagem
        Mensagem.ObterMensagem(8);
        Mensagem.ObterMensagem(15);
        Mensagem.ObterMensagem(20);
        Mensagem.ObterMensagem(85);

        //Empréstimo
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1500,Emprestimo.getDuasParcelas());
        // Empréstimo sem passar um método como parâmetro
        Emprestimo.calcular(2000,2);
        Emprestimo.calcular(500,8);



    }
}
