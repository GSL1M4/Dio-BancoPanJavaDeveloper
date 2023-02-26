package edu.gslima.Collections.ExercicPropostos02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList022 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Perguntas> tested = new ArrayList<>();

        tested.add(new Perguntas("Você telefonou para a Vítima?"));
        tested.add(new Perguntas("Você esteve no local do crime?"));
        tested.add(new Perguntas("Você mora perto da Vítima?"));
        tested.add(new Perguntas("Você devia para a Vítima?"));
        tested.add(new Perguntas("Você ja trabalhou com a Vítima?"));

        int resp = 0;
        int a = 0;
        int sim=0, nao=0;

        System.out.println("Digite sua resposta:");
        System.out.println("1: SIM");
        System.out.println("2:NAO");
        for (Perguntas i: tested) {

            System.out.printf("%d-%s\n Digite: ", a+1, i.getFrase());
            resp = in.nextInt();
            if(resp == 1) {
                    sim++;
            }else if(resp == 2){
                nao++;
            }else{
                System.out.println("OPÇAO INVÁLIDA");
            }

        }

        if(sim == 1){
            System.out.println("Inocente");
        }else if(sim == 2){
            System.out.println("Suspeito");
        }else if(sim == 3 | resp == 4){
            System.out.println("Cúmplice");
        } else if (sim == 5) {
            System.out.println("Assassino");
        }



    }

}
