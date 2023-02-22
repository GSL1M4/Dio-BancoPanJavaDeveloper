package edu.gslima.ExerciciosArrays;

import java.util.Random;

public class ContagemConsoantes {
    public static void main(String[] args) {
        Random rand = new Random();

        char[] letras = new char[6];
        int vogais=0, consoantes=0;
        int i = 0;



        do{
            letras[i] = (char)(rand.nextInt(26)+'a');
            if((letras[i] != 'a') && (letras[i] != 'e') && (letras[i] != 'i') && (letras[i] != 'o') && (letras[i] != 'u')){
                consoantes++;
            }else{
                vogais++;
            }
            i++;
        }while(i < letras.length);


        for(char let : letras){
            System.out.print("\nFoi gerado:"+let);
        }

        System.out.println("\n\tO total de vogais é: "+vogais);
        System.out.println("\tO total de consoantes é: "+consoantes);

    }


}