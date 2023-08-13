package com.example;
public class appCliente {

    public static void main (String[] args) {
        Cliente cliente = new Cliente();
        cliente.setSexo('M'); 
        cliente.setAnoNascimento(1969);
        cliente.setRenda(1000); 

        System.out.println("Cliente renda: " + cliente.getRenda());
        System.out.println("Cliente anoNascimento: " + cliente.getAnoNascimento());
        System.out.println("Cliente sexo: " + cliente.getSexo());

    }
}