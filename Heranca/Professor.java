package Heranca;

import java.util.Scanner;

public class Professor extends Pessoa {
    private double salario;
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Professor(String nome, int idade, char sexo, int faltas, boolean bolsista, double salario, int matricula) {
        super(nome, idade, sexo, faltas, bolsista);
        this.salario = salario;
        this.matricula = matricula;
    }

    public void aumentarSalario() {
        Scanner sc = new Scanner(System.in);
        int p;

        System.out.println("Qual e a porcentagem de aumento do salario? ");
        p = sc.nextInt();
        sc.nextLine();

        this.salario += this.salario * p/100;

        System.out.println("O novo salario e de " + this.salario);
    }
}
