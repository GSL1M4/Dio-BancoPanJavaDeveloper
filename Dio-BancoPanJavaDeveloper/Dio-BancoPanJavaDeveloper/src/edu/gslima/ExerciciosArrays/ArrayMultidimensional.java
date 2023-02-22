package edu.gslima.ExerciciosArrays;

import java.util.Random;

public class ArrayMultidimensional {

    public static void main(String[] args) {
        Random rand = new Random();

        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0;j<matriz[i].length;j++){
                matriz[i][j] = rand.nextInt(0,9);
                System.out.print(matriz[i][j]+" ");

            }

            System.out.println();

        }

    }

}
