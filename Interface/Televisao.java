public class Televisao implements Aparelho {
    private double preco;
    private double imposto;
    private String nome;
    private String descricao;

    public Televisao(String nome, String descricao, float preco, float imposto) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imposto = imposto;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getNome() {
        return this.nome;
    }
}