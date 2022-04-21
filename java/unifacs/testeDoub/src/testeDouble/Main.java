package testeDouble;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitura = new Scanner(System.in);
        int numALunos = 5;
        float[] notaAlunos = new float[numALunos];

        for ( int cont = 0;cont < numALunos;++cont) {
            System.out.println("Insira a nota do "+ (cont+1)+ "° aluno:");
            notaAlunos[cont] = leitura.nextFloat();
            //PROBLEMA!! Não funciona por algum motivo com double ou float... Aida mnão funcionA.


        }
    }
}
