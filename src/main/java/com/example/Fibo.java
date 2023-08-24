package com.example;

public class Fibo {
    public	static	int	calculaFibonacci(int	n) {
        //System.out.println(n);
        return	(n	<=	2)	?	1	:	calculaFibonacci(n-1)	+	calculaFibonacci(n-2);
}
    public static void main(String[] args) {
         System.out.println(calculaFibonacci(4));
    }
}
