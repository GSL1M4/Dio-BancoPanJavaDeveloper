package edu.gslima.Collections.ExercicPropostos01;

import java.util.List;
import java.util.ArrayList;

public class Main{


    public static void main(String[] args) {


        List<Meses> mes1 = new ArrayList<>(){{

           add(new Meses("Janeiro", 17));
           add(new Meses("Fevereiro", 21));
           add(new Meses("Março", 19));
           add(new Meses("Abril", 16));
           add(new Meses("Maio", 14));
           add(new Meses("Junho", 11));


        }};

        double aux;
        double aux1 = 0d;


        for (Meses m: mes1) {
            aux = m.getTemp();
            aux1 +=aux;
            if(aux > (aux1/ mes1.size())){
                System.out.printf("\nMes: %s - temperatura: %.0f", m.getNome(), m.getTemp());
            }
        }

        aux1 /= mes1.size();

        System.out.println("\n------------------------------------------------------------\n");
        System.out.printf("A media de temperatura é: %.0f  \n", aux1);


    }

}
