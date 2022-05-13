import java.util.Scanner;

public class Calculo {
    public int soma(int a, int b) {
        return a+b;
    }
    
    public double soma(double a, double b) {
        return a+b;
    }

    public int multiplicacao(int a, int b) {
        return a*b;
    }

    public double multiplicacao(double a, double b) {
        return a*b;
    }

    public int subtracao(int a, int b) {
        return a-b;
    }

    public double subtracao(double a, double b) {
        return a-b;
    }

    public int divisao(int a, int b) {
        return a/b;
    }

    public double divisao(double a, double b) {
        return a/b;
    }

    public int resto(int a, int b) {
        return a%b;
    }

    public double resto(double a, double b) {
        return a%b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);        
        Calculo calcular = new Calculo();
        double a, b;
        char operador;

        System.out.println("Digite dois valores: ");
        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.println("Digite um operador: ");
        operador = sc.next().charAt(0);

        if(operador == '+') {
            System.out.println(calcular.soma(a, b));
        }
        else if(operador == '-') {
            System.out.println(calcular.subtracao(a, b));
        }
        else if(operador == '/') {
            System.out.println(calcular.divisao(a, b));
        }
        else if(operador == '*') {
            System.out.println(calcular.multiplicacao(a, b));
        }
        else if(operador == '%') {
            System.out.println(calcular.resto(a, b));
        }
    }
}