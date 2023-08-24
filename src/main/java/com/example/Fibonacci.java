package com.example;

public class Fibonacci {
    public static void main (String[] args) {
        int atual = 1;
        int anterior = 0;
        int n = 10;
        System.out.println("iniciando Fibonacci ...");
        while (atual <=n) {
           // System.out.println("Atual: " + atual );
            atual = anterior + atual;
            if (atual < n) {
                System.out.print(atual + ",");
            } else System.out.println(atual);
            anterior = atual - anterior;
        }
        //System.out.println(atual);
    }
}
