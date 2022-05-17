package _01Listas;


import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        String[] listaCores = {"Verde", "Azul", "Amarela", "Vermelha", "Preta", "Branca"};

        ArrayList<String> minhaLista = new ArrayList<>();

        for (int i = 0; i < listaCores.length; i++) {
            minhaLista.add(listaCores[i]);

        }
        minhaLista.add("Cor roxa");
        minhaLista.add("Cor magenta");




    }
}
