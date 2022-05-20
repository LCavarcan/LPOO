public class Alunos {
    private String nome;
    private int id;

    public Alunos(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public Alunos(String nome) {
        this.nome = nome;
    }

    public Alunos() {
        this("", 0);
    }

    public String getNome() {
        return this.nome;
    }

    public int getId() {
        return this.id;
    }
}