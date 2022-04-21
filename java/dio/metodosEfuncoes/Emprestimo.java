package metodosEfuncoes;

public class Emprestimo {


    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuas());
            System.out.println("Para duas parcelas: R$"+valorFinal);

        } else if (parcelas==3){

            double valorFinal = valor + (valor * getTaxaTres());
            System.out.println("Para três parcelas: R$"+ valorFinal);

        } else{
            System.out.println("Número inválido.");
        }



    }

    private static double getTaxaDuas() {
        return 0.3;
    }
    private static double getTaxaTres() {
        return 0.45;
    }

    //Métodos extras
    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }


}
