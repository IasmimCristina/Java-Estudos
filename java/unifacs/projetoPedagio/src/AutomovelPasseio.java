public class AutomovelPasseio extends Automovel{
    private int passageirosMax;
    private final double taxa = 5;
    //Pode ser feito com uma variável, ou um método. É uma má prática fazer a operação aqui?
    private double pedagio = passouPedagio*taxa; //Ainda não fiz os setters e getters dele.


    // Ou seria melhor fazer aqui?
    public double mostrarPedagio() {
        double taxa = this.taxa;
        int passageirosMax = this.passageirosMax;
        double valor =passouPedagio*taxa;

        return valor;
    }
    //Outra dúvida: é mais comum deixar os 'setters' e 'getters' após, ou antes dos métodos?
    //Nota: ainda não fiz o valor do pedagio das outras categorias automóvel.
    //Languagetool é aplicável aqui.

    public int getPassageirosMax() {
        return passageirosMax;
    }

    public void setPassageirosMax(int passageirosMax) {
        this.passageirosMax = passageirosMax;
    }
}
