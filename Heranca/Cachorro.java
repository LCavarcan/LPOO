//package Heranca;

public class Cachorro extends Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cachorro(int idade, boolean terrestre, String nome) {
        super(idade, terrestre);
        this.nome = nome;
    }

    public void brincar() {
        System.out.println("\nO cachorro esta brincando");
    }
}
