package edu.gslima.Collections.SetExerciciosPropostos02;

public class Comparador3 extends LinguagemFavorita{
    public Comparador3(String nome, int anoCriacao, String ide) {
        super(nome, anoCriacao, ide);
    }


    @Override
    public int compareTo(LinguagemFavorita o) {
        return Integer.compare(super.getAnoCriacao(), o.getAnoCriacao());

    }

}
