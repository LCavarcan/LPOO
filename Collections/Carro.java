package Collections;

public class Carro {
    private String placa;
    private String nome;
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public Carro(String placa, String nome, int ano) {
        this.placa = placa;
        this.nome = nome;
        this.ano = ano;
    }
}
