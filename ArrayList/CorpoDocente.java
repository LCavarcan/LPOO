public class CorpoDocente {
    private String nome;

    public CorpoDocente(String nome) {
        this.nome = nome;
    }

    public CorpoDocente() {
        this("");
    }

    public String getNome() {
        return this.nome;
    }
}