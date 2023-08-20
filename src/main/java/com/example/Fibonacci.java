package com.example;

public class Fibonacci {
    public static void main (String[] args) {
        int atual = 1;
        int anterior = 0;
        System.out.println("iniciando Fibonacci ...");
        while (atual <=100) {
           // System.out.println("Atual: " + atual );
            atual = anterior + atual;
            if (atual < 100) {
                System.out.print(atual + ",");
            } else System.out.println(atual);
            anterior = atual - anterior;
        }
        //System.out.println(atual);
    }
}
