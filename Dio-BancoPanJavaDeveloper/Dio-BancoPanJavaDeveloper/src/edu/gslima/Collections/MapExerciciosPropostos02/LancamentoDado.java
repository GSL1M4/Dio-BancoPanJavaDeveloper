package edu.gslima.Collections.MapExerciciosPropostos02;

import java.util.Random;
import java.util.Scanner;

public class LancamentoDado {

    public static void main(String[] args) {

        Random rand = new Random();
        int um=0, dois=0, tres=0, quatro=0, cinco=0, seis=0;
        int vezes;


        for(int i =0; i<100;i++){
            vezes = rand.nextInt(6)+1;


            if(vezes == 1){
                um++;
            }else if(vezes == 2){
                dois++;
            }else if(vezes == 3){
                tres++;
            }else if(vezes == 4){
                quatro++;
            }else if(vezes == 5){
                cinco++;
            }else if(vezes == 6){
                seis++;
            }
        }

        System.out.println("Quantidade de jogadas de cada DADO:");

        System.out.println("Numero 1:"+um);
        System.out.println("Numero 2:"+dois);
        System.out.println("Numero 3:"+tres);
        System.out.println("Numero 4:"+quatro);
        System.out.println("Numero 5:"+cinco);
        System.out.println("Numero 6:"+seis);



    }



}
