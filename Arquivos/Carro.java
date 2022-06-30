public class Carro {
    private String marca;
    private String nome;
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro(String marca, String nome, int ano) {
        this.ano = ano;
        this.nome = nome;
        this.marca = marca;
    }
}