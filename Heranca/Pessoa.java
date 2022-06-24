package Heranca;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;
    protected int faltas;
    protected boolean bolsista;

    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Pessoa(String nome, int idade, char sexo, int faltas, boolean bolsista) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.faltas = faltas;
        this.bolsista = bolsista;
    }
}