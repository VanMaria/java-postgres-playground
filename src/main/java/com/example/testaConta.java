package com.example;
 
public class testaConta {
    public static void main (String[] args) {
        conta c1Conta = new conta();
        conta c2Conta = new conta();

        c1Conta.titular = "Maria Lucia";
        c1Conta.numero = 1;
        c1Conta.agencia = "2793-0";
        c1Conta.saldo = 50;
        c1Conta.dataDeAbertura = "05/01/2023";

        c2Conta.titular = "Maria Lucia";
        c2Conta.numero = 1;
        c2Conta.agencia = "2793-0";
        c2Conta.saldo = 50;
        c2Conta.dataDeAbertura = "05/01/2023";

        if (c1Conta == c2Conta) {
            System.out.println("Contas iguais");
        } else System.out.println(" contas diferentes");

        c1Conta.deposita(1000);
        System.out.println("saldo	atual:"	+	c1Conta.saldo);
        System.out.println("rendimento	mensal:"	+	c1Conta.calculaRendimento(1, 1.10));

        System.out.println(c1Conta.recuperaDadosParaImpressao());



    }
}
