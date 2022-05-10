package _01_AbstracaoPOO;

public class Main {

    public static void main(String[] args) {
        // Os métodos abstratos são apenas uma assinatura na classe mãe. As classes filhas têm essa responsabilidade.
        //O polimorfismo permite que classes abstratas consigam receber comportamentos através de classes concretas.
        ControleRemoto c1 = new ControleRemoto();
        c1.ligar();

    }
}
