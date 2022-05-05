package Parte03String;

public class SequenciaString {
    public static void main(String[] args) {
        String name = "Iasmim Cristina";
        //Comprimento:
        System.out.println(name.length());

        //Posições específicas:
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(7));

        String primeiro = name.substring(0,6); //Somente o meu primeiro nome.
        String segundo = name.substring(7); //Segundo nome.

        System.out.println(primeiro);
        System.out.println(segundo);


        //Substituição:
        String newName = name.replace("i","I");
        System.out.println(newName);

    }
}
