package edu.gslima.ExerciciosArrays;

public class Consoantes {

    public static void main(String[] args) {


        char[] letras = {'a', 'c', 'd', 'j', 'i', 'p'};
        int vogais=0, consoantes=0;
        int i = 0;

        do{

            if((letras[i] != 'a') && (letras[i] != 'e') && (letras[i] != 'i') && (letras[i] != 'o') && (letras[i] != 'u')){
                consoantes++;
            }else{
                vogais++;
            }
            i++;
        }while(i < letras.length);

        System.out.println("O total de vogais é: "+vogais);
        System.out.println("O total de consoantes é: "+consoantes);

    }

}
