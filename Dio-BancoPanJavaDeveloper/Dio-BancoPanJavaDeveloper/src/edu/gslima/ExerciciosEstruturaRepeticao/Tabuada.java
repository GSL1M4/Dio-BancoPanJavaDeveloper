package edu.gslima.ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numSelect, res;

        System.out.println("Digite qual numero voce quer ver a tabuada: ");
        numSelect = in.nextInt();

        for(int i = 1; i<11;i++){
            res = numSelect * i;
            System.out.printf("\n%d X %d = %d", numSelect, i, res);
        }



    }


}
