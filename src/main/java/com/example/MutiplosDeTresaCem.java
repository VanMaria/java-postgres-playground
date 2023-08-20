package com.example;

public class MutiplosDeTresaCem {
    public static void main (String[] args) {
        int contador = 1;
        int qtdeMultiplos = 0;
        while (contador <=100) {
            if (contador % 3 == 0) {
                System.out.println ("Número é mutiplo de 3 : " + contador );
                qtdeMultiplos++;
            }
            contador++;
        }
        System.out.println("Quantidade de múltipos de 3 de 1 a 100 :" + qtdeMultiplos);
    }
    
}
