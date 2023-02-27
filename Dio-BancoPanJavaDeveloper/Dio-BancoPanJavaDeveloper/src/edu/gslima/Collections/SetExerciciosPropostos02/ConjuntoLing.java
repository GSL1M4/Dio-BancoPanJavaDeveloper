package edu.gslima.Collections.SetExerciciosPropostos02;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoLing {

    public static void main(String[] args) {


        Set<LinguagemFavorita> ling = new LinkedHashSet<>(){{

           add(new LinguagemFavorita("JAVA", 1991, "Intellij"));
           add(new LinguagemFavorita("PHP", 1994, "NetBeans"));
           add(new LinguagemFavorita("C", 1969, "Dev C++"));

        }};


        System.out.println("Ordem de Inserção: ");
        for (LinguagemFavorita l: ling) {
            System.out.println(l.toString());
        }

        System.out.println("-------------------------------------------------");

        System.out.println("Ordem de Natural: ");

        Set<LinguagemFavorita> ling1 = new TreeSet<>(ling);

        for (LinguagemFavorita k: ling1) {
            System.out.println(k.getNome().toString());
        }

        System.out.println("-------------------------------------------------");

        System.out.println("Ordenando por IDE: ");

        Set<LinguagemFavorita> ling2 = new TreeSet<>(){{

            add(new LinguagemFavorita("JAVA", 1991, "Intellij"));
            add(new LinguagemFavorita("PHP", 1994, "NetBeans"));
            add(new LinguagemFavorita("C", 1969, "Dev C++"));

        }};

        for (LinguagemFavorita k: ling2) {
            System.out.println(k.getIde().toString());
        }

        System.out.println("-------------------------------------------------");

        System.out.println("Por ano de criação e nome: ");
        Set<LinguagemFavorita> ling3 = new TreeSet<>(){{

            add(new LinguagemFavorita("JAVA", 1991, "Intellij"));
            add(new LinguagemFavorita("PHP", 1994, "NetBeans"));
            add(new LinguagemFavorita("C", 1969, "Dev C++"));

        }};

        for (LinguagemFavorita h: ling3) {
            System.out.println(h.getAnoCriacao()+"-"+h.getNome());

        }

        System.out.println("-------------------------------------------------");

        System.out.println("Por Nome/ano criaçãoo/IDE: ");
        Set<LinguagemFavorita> ling4 = new TreeSet<>(){{

            add(new LinguagemFavorita("JAVA", 1991, "Intellij"));
            add(new LinguagemFavorita("PHP", 1994, "NetBeans"));
            add(new LinguagemFavorita("C", 1969, "Dev C++"));

        }};

        for (LinguagemFavorita g: ling4) {
            System.out.println(g.getNome()+"-"+g.getAnoCriacao()+"-"+g.getIde());

        }












    }


}
