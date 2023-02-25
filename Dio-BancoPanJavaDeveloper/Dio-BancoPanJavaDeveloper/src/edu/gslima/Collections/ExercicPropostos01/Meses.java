package edu.gslima.Collections.ExercicPropostos01;

import java.util.Comparator;

public class Meses implements Comparator<Meses> {

    private String nome;
    private double temp;

    public Meses() {
    }

    public Meses(String nome, double temp) {
        this.nome = nome;
        this.temp = temp;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Meses{" +
                "nome='" + nome + '\'' +
                ", temp=" + temp +
                '}';
    }


    @Override
    public int compare(Meses o1, Meses o2) {
        return Integer.compare((int) o1.getTemp(), (int)o2.getTemp());
    }
}
