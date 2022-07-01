public class Veiculo {
    private int ano;
    private int qtdPneus;
    private String modelo;
    private String placa;

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

    public void setQtdPneus(int qtdPneus) {
        this.qtdPneus = qtdPneus;
    }

    public int getQtdPneus() {
        return this.qtdPneus;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return this.placa;
    }

    public Veiculo(int ano, int qtdPneus, String modelo, String placa) {
        this.ano = ano;
        this.qtdPneus = qtdPneus;
        this.modelo = modelo;
        this.placa = placa;
    }
}