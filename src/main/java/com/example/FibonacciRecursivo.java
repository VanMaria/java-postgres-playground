package com.example;

public class FibonacciRecursivo {

    static long Fibo (int Numero) {
        return (Numero < 2) ? Numero : Fibo(Numero - 1) + Fibo(Numero - 2);
    }
  
      public static void main(String[] args) {
        int myNum;
        myNum = 10;
        for ( int i=0; i < myNum; ++i)  {
           System.out.println("(" + i + "):" + FibonacciRecursivo.Fibo(i));
        }
    }
      
}
