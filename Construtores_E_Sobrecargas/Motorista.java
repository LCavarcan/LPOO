public class Motorista {
    private String nome;
    private int numeroCNH;
    private String cidadeOrigem;
    private String tipo;
    private int validade;
    private boolean definitiva;
    
    public Motorista(String nome) {
        this.nome = nome;
    }

    public Motorista(String nome, int numeroCNH) {
        this.nome = nome;
        this.numeroCNH = numeroCNH;
    }

    public Motorista(String nome, int numeroCNH, String cidadeOrigem) {
        this.nome = nome;
        this.numeroCNH = numeroCNH;
        this.cidadeOrigem = cidadeOrigem;
    }

    public Motorista(String nome, int numeroCNH, String cidadeOrigem, String tipo) {
        this.nome = nome;
        this.numeroCNH = numeroCNH;
        this.cidadeOrigem = cidadeOrigem;
        this.tipo = tipo;
    }

    public Motorista(String nome, int numeroCNH, String cidadeOrigem, String tipo, int validade) {
        this.nome = nome;
        this.numeroCNH = numeroCNH;
        this.cidadeOrigem = cidadeOrigem;
        this.tipo = tipo;
        this.validade = validade;
    }

    public Motorista(String nome, int numeroCNH, String cidadeOrigem, String tipo, int validade, boolean definitiva) {
        this.nome = nome;
        this.numeroCNH = numeroCNH;
        this.cidadeOrigem = cidadeOrigem;
        this.tipo = tipo;
        this.validade = validade;
        this.definitiva = definitiva;
    }
}