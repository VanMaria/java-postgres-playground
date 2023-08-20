package com.example;

import com.example.model.Cliente;

public class AppOperadoreslogicos {

    public static void main(String[] args) 
    {

    var cliente1 = new Cliente();

    cliente1.setAnoNascimento(1980);

    var cliente2 = new Cliente();
    cliente2.setAnoNascimento(2003);

    if (cliente1.getAnoNascimento() < cliente2.getAnoNascimento()) {
        System.out.println("Cliente1 é mais velho que Cliente2 ");
    } else if (cliente1.getAnoNascimento() > cliente2.getAnoNascimento()) {
            System.out.println("Cliente 1 é mais novo que Cliente 2");
    } else System.out.println("Cliente 1 tem a idade do cliente 2");



    }
}