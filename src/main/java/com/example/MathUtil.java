package com.example;

public class MathUtil {
    static int mdc(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int maior = Math.max(a,b);
        b = Math.min(a,b);
        a = maior;
        if (b >0  && a%b ==0 ) {
            return b;
        }
        if ( b ==0 ) {
            return Math.abs(a);
        }
        //return 0;
        throw new UnsupportedOperationException("Não foi possivel calcular o mdc dos números");
    }
}