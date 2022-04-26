package heranca;

public class Produto {

        protected String nome;
        protected int preco;
        protected String fornecedor;
        protected String codigo;

    public Produto() {
        this.nome = "Produto Generico";
    }

    public Produto(String nome, int preco) {

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
