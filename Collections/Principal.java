package Collections;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String isbn;
        Livro l1 = new Livro("978-65-5560-150-3", "A lista de convidados", "Lucy Foley", "Intrinseca", 301, 2021);

        Map<String, Livro> livros = new HashMap<>();

        livros.put("978-65-5560-150-3", l1);

        System.out.println("Digite o codigo isbn do livro: ");
        isbn = sc.nextLine();

        Livro pesquisa = livros.get(isbn);

        System.out.println(pesquisa.getTitulo());
    }
}
