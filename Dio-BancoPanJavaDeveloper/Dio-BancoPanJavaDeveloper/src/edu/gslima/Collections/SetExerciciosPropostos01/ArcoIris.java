package edu.gslima.Collections.SetExerciciosPropostos01;

import java.util.*;

public class ArcoIris {

    public static void main(String[] args) {

        Set<ArcIrisDetalhes> arco = new HashSet<>(){{

           add(new ArcIrisDetalhes("Vermelho"));
           add(new ArcIrisDetalhes("Laranja"));
           add(new ArcIrisDetalhes("Amarelo"));
           add(new ArcIrisDetalhes("Verde"));
           add(new ArcIrisDetalhes("Azul"));
           add(new ArcIrisDetalhes("Anil"));
           add(new ArcIrisDetalhes("Violeta"));


        }};

        System.out.println("Exibindo os elementos: \n");

        //Exibindo elementos:
        for (ArcIrisDetalhes m: arco) {

            System.out.println(m.toString());
        }
        //tamanho do arco-iris
        System.out.println("\nO tamanho total do arco-iris é: "+arco.size()+" cores\n");

        System.out.println("-------------------------------------------------");


        //Exibindo em ordem alfabetica:


        Set<ArcIrisDetalhes> arco1 = new TreeSet<>(arco);
        System.out.println("Ordem Alfabética: \n");
        for (ArcIrisDetalhes n: arco1) {
            System.out.println(n.toString());
        }
        System.out.println("-------------------------------------------------");



        //exibindo na ordem inversa:

        LinkedList<String> arco3 = new LinkedList<>();
        arco3.add("Vermelho");
        arco3.add("Laranja");
        arco3.add("Amarelo");
        arco3.add("Verde");
        arco3.add("Azul");
        arco3.add("Anil");
        arco3.add("Violeta");


        System.out.println("Ordem inversa: \n");
        Iterator<String> ordemRev = arco3.descendingIterator();
        while(ordemRev.hasNext()){
            String next = ordemRev.next();
            System.out.println(next);
        }

        System.out.println("-------------------------------------------------");

        //exibir todas as cores que começam com V:

        System.out.println("Cores que começam com V: exibindo e removendo \n");
        for (ArcIrisDetalhes h: arco) {
            if(h.getCor().startsWith("V")){
                System.out.println(h);
            }else{
                arco.remove(h.getCor());
            }

        }


        System.out.println("-------------------------------------------------");


        arco3.clear();
        System.out.println("Conferindo se esta Vazio: \n");
        System.out.println(arco3.isEmpty()?"Sim esta Vazio":"Não esta Vazio");




    }



}

