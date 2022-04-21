package exemplos;

import java.util.ArrayList;
import java.util.List;


public class arrayLista {
    public static void main(String[] args) {
        // Aprendendo a utilizar ArrayList!!!
        // __________________________________
        // __________________________________


        // String[] => Array fixo.
        // new ArrayList<String>() => Dinâmico.
        // names.size => ArrayList é um objeto.

        List<String> names = new ArrayList<>();


        // Adicionando elementos.
        names.add("Nome 1");
        names.add("Nome 2");
        names.add("Nome 3");
        names.add("Nome 4");

        // "get" busca elementos em uma ArrayList.
        for ( int cont = 0; cont < names.size() ; cont++) {
            System.out.println(names.get(cont));
        }

        System.out.println("_______");

        // Pode-se usar um enhanced for para o mesmo objetivo.
        for (String name : names) {
            System.out.println(name);
        }

        // Exibição da posição -também chamada de index- de um ArrayList.
        int index = names.indexOf("Nome 3");
        System.out.println("A posição do nome 3 no ArrayList é "+index+".");

        // O mesmo bjetivo em uma linha sem a criação de outra variável.
        System.out.println("A posição do nome 3 no ArrayList será exibida sem a criação de outra variável é "+names.indexOf("Nome 3")+".");

        // Verificação: vazia ou não?
        System.out.println(names.isEmpty());

        // Verificação: contém um elemento específico  ou não?
        System.out.println(names.contains("Nome 14"));
        // Normalmente usado em filtros de pesquisa.

        // Tamanho da lista
        System.out.println(names.size());

        // Remoção todos os valores do ArrayList
        names.clear();
        System.out.println(names.isEmpty());

    }
}
