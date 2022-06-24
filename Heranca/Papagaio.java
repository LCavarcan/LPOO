//package Heranca;

public class Papagaio extends Animal {
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Papagaio(int idade, boolean terrestre, String cor) {
        super(idade, terrestre);
        this.cor = cor;
    }

    public void falar() {
        System.out.println("\nO papagaio esta falando");
    }
}
