package edu.gslima.Collections.SetExerciciosPropostos01;

public class ArcIrisDetalhes implements Comparable<ArcIrisDetalhes>{

    private String cor;


    public ArcIrisDetalhes(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    @Override
    public String toString() {
        return "cor='" + cor + '\'';
    }

    @Override
    public int compareTo(ArcIrisDetalhes o) {
        return this.cor.compareToIgnoreCase(o.getCor());
    }
}
