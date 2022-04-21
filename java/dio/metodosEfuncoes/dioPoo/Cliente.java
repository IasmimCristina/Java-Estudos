package metodosEfuncoes.dioPoo;

import java.util.List;

public class Cliente {
    //Tudo está público para que haja uma melhor visualização!
    public int codigo;
    public String nome;
    public String cpf;

    public List<Endereco> enderecos;

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }
}
