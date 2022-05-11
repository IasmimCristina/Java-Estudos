package aula03Collections.estudandoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List: mantém a ordem inserida. Aceitam elementos duplicados.
        //ArrayList: muitas pesquisas. Estrutura: array.
        //LinkedList: muita alteração de inserção e exclusão. Estrutura: lista duplamente ligada.
        //Crie uma lista com 7 notas.
        List<Double> notas = new ArrayList<>();
        notas.add(7d);//Porque é double.
        notas.add(8.5d);
        notas.add(9.3d);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6d);
        System.out.println(notas);

        //Posição
        System.out.println("Nota da posição da nota 5.0: "+ notas.indexOf(5d));

        //Adição
        notas.add(4,8d);
        System.out.println(notas);


        //Substituição
        notas.set(notas.indexOf(5d), 7d);
        System.out.println(notas);

        System.out.println(" A nota 5.0 está na lista? "+ notas.contains(5d));

        System.out.println("-Notas-");
        for ( Double nota: notas )
            System.out.println("| "+ nota+" |");


        //Exibição de uma nota
        System.out.println(notas.get(2));

        //Pegue a menor nota
        System.out.println("Menor nota: "+ Collections.min(notas));
        //Double, String e Integer implementam Comparable.

        System.out.println("Maior nota: "+ Collections.max(notas));


        Iterator<Double> iterator = notas.iterator(); //Ctrl + alt + v
        Double soma = 0d;
        while (iterator.hasNext()) { //Se há algo após o "cursor"
            Double next = iterator.next();
            soma += next;

        }
        System.out.println("Soma das notas: "+ soma  );

        System.out.println("Média: "+ (soma/notas.size()));

        notas.remove(0d);
        notas.remove(0);

        /*
        An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping. To use an Iterator, you must import it from the java.
         */

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) { //Esse while percorre a lista.
            Double next = iterator1.next();
            if (next<7)
                iterator1.remove();

        }

        System.out.println(notas);

        notas.clear();
        System.out.println(notas);

        System.out.println("A lista está vazia? "+ notas.isEmpty());


    }
}
