package heranca;

public class ProdutoNaoPerecivel  extends Produto{
    private String substancia;

    public ProdutoNaoPerecivel(String nome, int preco) {
        //Erro!!! --> Consertado.
        super(nome, preco);
        this.nome = nome;

    }
}
