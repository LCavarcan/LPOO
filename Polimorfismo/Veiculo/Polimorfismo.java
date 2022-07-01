public class Polimorfismo {
    public static void main(String[] args) {
        Veiculo moto = new Veiculo(2012, 2, "Nice", "ELE6B54");
        Carro tracker = new Carro(2015, 4, "Tracker", "EZZ2G52", "Claudia", 2021);
        Onibus busao = new Onibus(2018, 6, "Busao", "ABC1234", 42);

        System.out.println("Pedagio veiculo: " + calculaPedagio(moto));
        System.out.println("\nPedagio Carro: " + calculaPedagio(tracker));
        System.out.println("\nPedagio Onibus: " + calculaPedagio(busao));
    }

    public static double calculaPedagio(Veiculo v) {
        double pedagio;

        if(v instanceof Carro) {
            pedagio = 1.5 * v.getQtdPneus();
        }
        else if(v instanceof Onibus) {
            pedagio = 3.0 * v.getQtdPneus();
        }
        else {
            pedagio = 11.87;
        }

        return pedagio;
    }
}