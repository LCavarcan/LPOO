import java.util.ArrayList;

public class Lista {
    public static void main(String args[]) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Clark");
        nomes.add("Diana");
        nomes.add("Tony");
        nomes.add("Steve");
        nomes.add("Natasha");

        System.out.println(nomes);
        System.out.println("Tamanho da lista: " + nomes.size()); 

        nomes.remove(3);

        System.out.println(nomes);

        nomes.remove("Clark");

        System.out.println(nomes);
        System.out.println("Tamanho da lista: " + nomes.size()); 
        System.out.println("Lista esta vazia? " + nomes.isEmpty()); 
    }
}