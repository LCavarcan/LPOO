public class Celular implements Aparelho, Movel {
    private double preco;
    private String nome;
    private double credito;

    public Celular(double preco, String nome, double credito) {
        this.preco = preco;
        this.nome = nome;
        this.credito = credito;
    }

    public double calculaCredito() {
        return this.credito;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getNome() {
        return this.nome;
    }
}