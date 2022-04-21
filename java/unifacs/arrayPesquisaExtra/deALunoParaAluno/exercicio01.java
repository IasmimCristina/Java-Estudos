import java.util.Scanner;


public class exercicio01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numALunos = 5;
        float media = 0;
        float[] notaAlunos = new float[numALunos];

        for ( int cont = 0;cont <= (notaAlunos.length - 1);++cont) {
            System.out.println("Insira a nota do "+ (cont+1)+ "° aluno:");
            notaAlunos[cont] = leitura.nextFloat();
            //PROBLEMA!! Não funciona por algum motivo quando eu insiro um número double ou float...
            media += notaAlunos[cont];


        }

        media /= notaAlunos.length;
        System.out.println("A média das notas inseridas foi: "+ media );



    }
}
