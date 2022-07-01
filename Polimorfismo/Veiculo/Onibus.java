public class Onibus extends Veiculo {
    int qtdAssentos;

    public Onibus(int ano, int quantPneus, String modelo, String placa, int qtdAssentos) {
        super(ano, quantPneus, modelo, placa);
        this.qtdAssentos = qtdAssentos;
    }
}