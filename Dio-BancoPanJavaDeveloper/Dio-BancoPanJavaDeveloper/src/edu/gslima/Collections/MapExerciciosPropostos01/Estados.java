package edu.gslima.Collections.MapExerciciosPropostos01;

import java.util.*;

public class Estados {

    public static void main(String[] args) {
        var aux = "";
        Map<String, Integer> estados1;
        Map<String, Integer> estados2;
        // Criando e relacionando um Map:
        estados1 = new HashMap<String, Integer>(){{

            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);

        }};

        //Substituindo a população de RN por um novo valor;
        System.out.println("Substituindo a população de RN: "+ estados1.put("RN", 3534165));

        System.out.println("-------------------------------------------------------------------------");

        //Conferindo se o estado PB esta no Dicionário, caso não, adicionando o mesmo:
        System.out.println("Conferindo estado PB: "+ (estados1.containsKey("PB")?"SIM está":"NAO está"));

        estados1.put("PB", 4039277);
        System.out.println("-------------------------------------------------------------------------");
        //Exibindo a população de PE:

        System.out.println("A população de PE é:"+estados1.get("PE"));

        System.out.println("-------------------------------------------------------------------------");

        //Exibindo os estados na ordem de Inserção:

        System.out.println("Ordem de Inserção: "+estados1);

        System.out.println("-------------------------------------------------------------------------");

        //Exibindo em ordem alfabética:

        estados2 = new TreeMap<>(estados1);
        System.out.println("Ordem Alfabética: "+estados2.toString());

        System.out.println("-------------------------------------------------------------------------");

        //Exibindo o estado com MENOR população:


        var min = Collections.min(estados2.values());

        Set<Map.Entry<String, Integer>> entries = estados1.entrySet();

        for (Map.Entry<String, Integer> e: entries) {
            if(e.getValue().equals(min)){
                aux = e.getKey();
                System.out.println("O estado com a MENOR população é: "+aux+" Que possui "+min+" Pessoas");
            }
        }

        System.out.println("-------------------------------------------------------------------------");

        //Exibindo o estado com MAIOR população:
        var max = Collections.max(estados2.values());

        for (Map.Entry<String, Integer> e: entries) {
            if(e.getValue().equals(max)){
                aux = e.getKey();
                System.out.println("O estado com a MAIOR população é: "+aux+" Que possui "+max+" Pessoas");
            }
        }

        System.out.println("-------------------------------------------------------------------------");

        //Exibindo a SOMA da população dos estados:
        var iterator = entries.iterator();
        var somAux = 0;
        for (Map.Entry<String, Integer> e: entries) {
            if(iterator.hasNext()){
                var next = iterator.next().getValue();
                somAux += next;

            }
        }
        System.out.println("A soma da população de todos os ESTADOS é: "+ somAux);

        System.out.println("-------------------------------------------------------------------------");

        //Exibindo a média:

        System.out.println("A média é: "+somAux/estados2.size());


        System.out.println("-------------------------------------------------------------------------");

        // removendo estados com população menor que 4.000.000:

        // Não consegui! Faltou conhecimento ^^

        System.out.println("-------------------------------------------------------------------------");

        //Apague o dicionario:

        estados1.clear();
        System.out.println("Dicionario apagado");

        System.out.println("-------------------------------------------------------------------------");

        //Confira se esta vazio:


        System.out.println("Esta vazio? "+(estados1.isEmpty() ? "sim":"nao"));



    }


}
