package edu.gslima.ExerciciosEstruturaRepeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num, res = 1;

        System.out.println("Digite o numero para ver o Fatorial: ");
        num = in.nextInt();
        int contador = num;

        do{
            res = res * contador;
            contador--;
        }while(contador >=1);

        System.out.printf("\nO fatorial de %d é: %d", num, res);

    }

}
