package edu.gslima.ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int qtdNum, par = 0, impar = 0;

        System.out.println("Digite a quantidade de numeros: ");
        qtdNum = in.nextInt();
        int[] num = new int[qtdNum];

        for(int contador = 0; contador < qtdNum; contador++){
            System.out.printf("Digite o numero %d: ", contador+1);
            num[contador] = in.nextInt();

            if(num[contador] % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }


        System.out.printf("\nA quantidade de numeros par é: %d", par);
        System.out.printf("\nA quantidade de numeros impar é: %d", impar);
    }
}
