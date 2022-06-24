package Heranca;

public class Aluno extends Pessoa {
    private double media;
    private int ra;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Aluno(String nome, int idade, char sexo, int faltas, boolean bolsista, double media, int ra) {
        super(nome, idade, sexo, faltas, bolsista);
        this.media = media;
        this.ra = ra;
    }

    public void alterarMedia() {

    }
}
