import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "carros.txt";
        
        Carro fusca = new Carro("Volkswagem", "Fusca", 1966);
        Carro onix = new Carro("Chevrolet", "Onix", 2015);

        //Escrita em arquivo
        try {
            File arq = new File(fileName);
            FileWriter escritor = new FileWriter(arq, true); //true - continua a escrever debaixo do que já tá escrito - false - reescreve

            escritor.write(fusca.getMarca() + "; " + fusca.getNome() + "; " + fusca.getAno() + "\n");
            escritor.write(onix.getMarca() + "; " + onix.getNome() + "; " + onix.getAno() + "\n");

            escritor.close();
        }
        catch(IOException e) {
            System.out.println("Erro: " + e);
        }

        //Leitura do arquivo
        try {
            FileReader arq = new FileReader(fileName);
            BufferedReader leitor = new BufferedReader(arq);

            while(leitor.ready()) {
                /*System.out.println(leitor.readLine()); Printa linha por linha*/
                String linhaLida = leitor.readLine();
                String tempMarca, tempNome;
                int tempAno;
                String[] linhaSplit = linhaLida.split(";");

                tempMarca = linhaSplit[0];
                tempNome = linhaSplit[1];
                tempAno = Integer.parseInt(linhaSplit[2].trim()); //Transforma String em int

                Carro tempCarro = new Carro(tempMarca, tempNome, tempAno);

                System.out.println("Nome com get: " + tempCarro.getNome());
            }

            leitor.close();
        }
        catch(IOException e) {
            System.out.println("Erro: " + e);
        }
    }
}
