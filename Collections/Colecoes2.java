package Collections;

import java.util.*;

public class Colecoes2 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("Jose");

        Integer [] numerosArray = {9, 3, 2};
        List<Integer> numeros = Arrays.asList(numerosArray);

        System.out.println(nomes);
        System.out.println(numeros);

        Collections.sort(nomes/*, Collections.reverseOrder() - Inverte a ordem */);
        Collections.sort(numeros);
        /* Collections.reverse(numeros) - Mesma coisa que o reverseOrder, mas fora do sort */

        System.out.println(nomes);
        System.out.println(numeros);

        System.out.println("\n\n\n");

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa joao = new Pessoa("Joao", 57, 3789.89);
        Pessoa maria = new Pessoa("Maria", 77, 1456.70);
        Pessoa juca = new Pessoa("Juca", 14, 547.56);

        pessoas.add(joao);
        pessoas.add(maria);
        pessoas.add(juca);

        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        Collections.sort(pessoas);

        System.out.println("\nApos ordenacao por salario:\n");

        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        Collections.shuffle(pessoas);

        System.out.println("\n");

        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        Collections.reverse(pessoas);

        System.out.println("\nRevert: ");

        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        } 

        System.out.println("\n\nIterator:\n\n");

        Iterator<Pessoa> itPessoa = pessoas.iterator();

        while(itPessoa.hasNext()) {
            System.out.println(itPessoa.next().getNome());
        }

        System.out.println("\n\n\n");

        Carro corsa = new Carro("ABC-0123", "Corsa", 1998);
        Carro uno = new Carro("XYZ-9874", "Uno", 2009);

        Map<String, Carro> carros = new HashMap<>();

        carros.put("ABC-0123", corsa);
        carros.put("XYZ-9874", uno);

        Carro pesquisa = carros.get("XYZ-9874");

        System.out.println(pesquisa.getNome() + " " + pesquisa.getPlaca() + " " + pesquisa.getAno());
    }
}
