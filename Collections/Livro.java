package Collections;

public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private String editora;
    private int nPags;
    private int ano;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getnPags() {
        return nPags;
    }

    public void setnPags(int nPags) {
        this.nPags = nPags;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Livro(String isbn, String titulo, String autor, String editora, int nPags, int ano) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.nPags = nPags;
        this.ano = ano;
    }
}
