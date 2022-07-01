public class ExemplosInterface {
    public static void main(String[] args) {
        Televisao samsung = new Televisao("a", "b", 10, 5);
        Celular c = new Celular(10, "a", 7000);

        System.out.println("Nome: " + samsung.getNome() + "\nPreco: " + samsung.getPreco());
        System.out.println("\nNome: " + c.getNome() + "\nPreco: " + c.getPreco() + "\nCreditos: " + c.calculaCredito());
    }
}