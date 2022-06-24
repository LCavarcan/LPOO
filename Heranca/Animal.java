//package Heranca;

public class Animal {
    protected int idade;
    protected boolean terreste;

    public boolean isTerreste() {
        return terreste;
    }

    public void setTerreste(boolean terreste) {
        this.terreste = terreste;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Animal(int idade, boolean terreste) {
        this.idade = idade;
        this.terreste = terreste;
    }

    public void beberAgua() {
        System.out.println("\nO animal esta bebendo agua");
    }
}