package com.example;
 
public class testaConta {
    public static void main (String[] args) {
        conta c1Conta = new conta();

        c1Conta.titular = "Maria Lucia";
        c1Conta.numero = 1;
        c1Conta.agencia = "2793-0";
        c1Conta.saldo = 50;
        c1Conta.dataDeAbertura = "05/01/2023";

        c1Conta.deposita(1000);
        System.out.println("saldo	atual:"	+	c1Conta.saldo);
        System.out.println("rendimento	mensal:"	+	c1Conta.calculaRendimento(1, 1.10));



    }
}
