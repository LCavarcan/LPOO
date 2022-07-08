package Collections;

import java.util.*;
import java.lang.Comparable;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public int compareTo(Pessoa outraPessoa) {
        if(this.salario < outraPessoa.salario) {
            return -1;
        }
        if(this.salario > outraPessoa.salario) {
            return 1;
        }

        return 0;
    }
}