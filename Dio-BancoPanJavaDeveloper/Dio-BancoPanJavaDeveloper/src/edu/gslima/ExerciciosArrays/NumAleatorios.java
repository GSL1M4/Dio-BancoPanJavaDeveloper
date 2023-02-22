package edu.gslima.ExerciciosArrays;

import java.util.Random;

public class NumAleatorios {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numeros = new int[20];

        System.out.println("Os numeros gerados foram\n");
        for(int num : numeros){
            num = rand.nextInt(0,100);
            System.out.printf("Gerado: %d - Sucessor: %d \n", num, num+1);
        }

    }

}
