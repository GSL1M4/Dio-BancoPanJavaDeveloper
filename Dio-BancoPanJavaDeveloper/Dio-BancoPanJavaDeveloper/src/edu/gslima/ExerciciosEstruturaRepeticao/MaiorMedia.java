package edu.gslima.ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int i = 0;
        int[] valor = new int[5];
        int contador = 0;
        int media = 0;

        do{

            System.out.printf("Digite o valor %d: ", i+1);
            valor[i] = in.nextInt();
            media += valor[i];
            if(valor[i] > contador){
                contador = valor[i];
            }
            i++;
        }while(i<5);

        media /= 5;

        System.out.printf("O maior numero é %d ", contador);
        System.out.printf("A média dos valores é %d", media);


    }
}