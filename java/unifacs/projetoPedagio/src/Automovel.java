public abstract class Automovel {
    protected String placa;
    protected String dataFabricacao;
    protected Cliente cliente = new Cliente(); // Todos os automóveis têm clientes.
    protected int passouPedagio; //Quantas vezes o automóvel passou pelo pedágio.



    public int getPassouPedagio() {
        return passouPedagio;
    }

    public void setPassouPedagio(int passouPedagio) {
        this.passouPedagio = passouPedagio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
