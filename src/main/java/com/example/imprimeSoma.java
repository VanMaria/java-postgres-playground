package com.example;

public class imprimeSoma {
    public static void main(String[] args) {
        int contador = 1;
        int somatorio = 0;
        while (contador < 1000) {
            somatorio = somatorio + contador;
             contador++;
        }
        System.out.println("Somatório de 1 a 1000:" + somatorio);
    }    
}
