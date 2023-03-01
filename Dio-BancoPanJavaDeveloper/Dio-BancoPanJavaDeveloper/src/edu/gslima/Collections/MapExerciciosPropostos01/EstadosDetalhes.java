package edu.gslima.Collections.MapExerciciosPropostos01;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class EstadosDetalhes {
    private String nome;
    private int populacao;

    public EstadosDetalhes(String nome, int populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadosDetalhes that = (EstadosDetalhes) o;
        return Objects.equals(nome, that.nome) && Objects.equals(populacao, that.populacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, populacao);
    }

    @Override
    public String toString() {
        return
                "nome= " + nome + ", populacao=" + populacao;
    }


}
