package com.example;

public class AppArrays {

    public static void main (String[] args)   {
        int x = 10;
        System.out.println("x:" + x);

        double vetor[] = {10,20,99,6};
        System.out.println("vetor: " + vetor.toString());

        System.out.println("vetor 0: " + vetor[0]);
        System.out.println("vetor 1: "+ vetor[1]);
        System.out.println("vetor 2: "+ vetor[2]);
        System.out.println("vetor 3: "+ vetor[3]);

        vetor[2] = 100;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i*10;
            System.out.println( vetor[i]);
        }

        double matriz[][] = new double[2][3];
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i*matriz[i].length + 1 )* 10 + j;
            }
        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(" "+ matriz[i][j] );
            }
            System.err.println();
        }


    } 
}
