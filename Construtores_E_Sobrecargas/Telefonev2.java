public class Telefonev2 {
    private String modelo;
    private double creditoInicial;
    private int armazenamento;
    private int qtdCameras;

    public Telefonev2() {
        this("", 0.0, 0, 0);
    }

    public Telefonev2(String modelo, double creditoInicial) {
        this(modelo, creditoInicial, 0, 0);
    }

    public Telefonev2(String modelo, double creditoInicial, int armazenamento, int qtdCameras) {
        this.modelo = modelo;
        this.creditoInicial = creditoInicial;
        this.armazenamento = armazenamento;
        this.qtdCameras = qtdCameras;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getCreditoInicial() {
        return this.creditoInicial;
    }

    public int getArmazenamento() {
        return this.armazenamento;
    }

    public void setCreditoInicial(double n) {
        creditoInicial = n;
    }

    public static void main(String args[]) {
        Telefonev2 telefone = new Telefonev2("T-800", 35.00);
        Telefonev2 nokia = new Telefonev2();
        Telefonev2 samsung = new Telefonev2("S 32", 750.00, 512, 37);

        System.out.println("Modelo: " + telefone.getModelo());
        System.out.println("Credito inicial: " + telefone.getCreditoInicial());
        telefone.setCreditoInicial(25.00);
        System.out.println("Valor apos a ligacao: " + telefone.getCreditoInicial());

        System.out.println("Nokia");
        System.out.println("Modelo: " + nokia.getModelo());

        System.out.println("Samsung");
        System.out.println("Modelo: " + samsung.getModelo());
        System.out.println("Armazenamento: " + samsung.getArmazenamento());
    }
}