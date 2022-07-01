public abstract class Peca {
    private String nome;
    public abstract void mover();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}