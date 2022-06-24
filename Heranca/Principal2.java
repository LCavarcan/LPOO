//package Heranca;

public class Principal2 {
    public static void main(String[] args) {
        Animal pomba = new Animal(2, false);
        Cachorro simba = new Cachorro(2, true, "Simba");
        Papagaio paraguaio = new Papagaio(1, false, "verde");
        Gato gatinho = new Gato(7, true, 'F');

        System.out.println("\nIdade: " + pomba.getIdade() + " E terrestre: " + pomba.isTerreste());
        System.out.println("\nIdade: " + simba.getIdade() + " E terrestre: " + simba.isTerreste() + " Nome: " + simba.getNome());
        System.out.println("\nIdade: " + paraguaio.getIdade() + " E terrestre: " + paraguaio.isTerreste() + " Cor: " + paraguaio.getCor());
        System.out.println("\nIdade: " + gatinho.getIdade() + " E terrestre: " + gatinho.isTerreste() + " Sexo: " + gatinho.getSexo());
    }
}
