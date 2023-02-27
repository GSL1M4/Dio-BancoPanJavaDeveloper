package edu.gslima.Collections.SetExerciciosPropostos02;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{

    private String nome;
    private int anoCriacao;
    private String ide;


    public LinguagemFavorita(String nome, int anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", anoCriacao=" + anoCriacao +
                ", ide='" + ide + '\'';
    }


    @Override
    public int compareTo(LinguagemFavorita o) {
        return this.nome.compareToIgnoreCase(o.getNome());

    }

}
