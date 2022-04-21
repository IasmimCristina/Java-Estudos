package metodosEfuncoes.dioPoo;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        // Dados

        Cliente cliente = new Cliente();
        //Dados

        cliente.enderecos.add(endereco);
        System.out.println("Adicionado!");
    }
}
