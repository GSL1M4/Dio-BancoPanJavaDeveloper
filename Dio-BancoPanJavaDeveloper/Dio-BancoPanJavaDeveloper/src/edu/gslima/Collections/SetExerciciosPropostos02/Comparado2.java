package edu.gslima.Collections.SetExerciciosPropostos02;

import java.util.Comparator;

public class Comparado2 extends LinguagemFavorita{


    public Comparado2(String nome, int anoCriacao, String ide) {
        super(nome, anoCriacao, ide);
    }

    @Override
    public int compareTo(LinguagemFavorita o) {
        return super.getIde().compareToIgnoreCase(o.getIde());

    }



}
