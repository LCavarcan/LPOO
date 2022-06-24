//package Heranca;

public class Gato extends Animal {
    private char sexo;

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Gato(int idade, boolean terrestre, char sexo) {
        super(idade, terrestre);
        this.sexo = sexo;
    }

    public void arranhar() {
        System.out.println("\nO gato esta arranhando");
    }
}
