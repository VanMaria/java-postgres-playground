package com.example;

import com.example.model.Cliente;

public class appCliente {

    public static void main (String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("José Antonio");
        cliente1.setCpf("99999999999");
        cliente1.setSexo('M'); 
        cliente1.setAnoNascimento(1969);
        cliente1.setRenda(1000); 
        cliente1.setCidade("Palmas");

        var vetorNome = cliente1.getNome().split(" ");
        System.out.println(vetorNome[0] + "-" +  vetorNome[1]);

        System.out.println("Cliente nome: "+ cliente1.getNome());
        System.out.println("Cliente renda: " + cliente1.getRenda());
        System.out.println("Cliente anoNascimento: " + cliente1.getAnoNascimento());
        System.out.println("Cliente sexo: " + cliente1.getSexo());
        System.out.println("Cliente Especial: " + cliente1.isEspecial());
       

        

        Cliente cliente2 = new Cliente(1500,'F');
    //    cliente2.setSexo('F'); 
     //   cliente2.setAnoNascimento(1974);
        cliente2.setNome("Maria");
        cliente2.setCpf("99999999999");
        cliente2.setRenda(1500); 
        cliente2.setCidade("PALMAS");
        System.out.println("  " );
        System.out.println("Cliente nome: "+ cliente2.getNome());
        System.out.println("Cliente renda: " + cliente2.getRenda());
        System.out.println("Cliente anoNascimento: " + cliente2.getAnoNascimento());
        System.out.println("Cliente sexo: " + cliente2.getSexo());
        System.out.println("Cliente Especial: " + cliente2.isEspecial());
        


        if (cliente1.getCpf().equals(cliente2.getCpf())) {
            System.out.println("Cpf cliente 1 e cliente 2 iguais");
        }
        else System.out.println("cpf diferentes!");

        if (cliente1.getCidade().equalsIgnoreCase(cliente2.getCidade())) {
            System.out.println("Cidade cliente 1 e cliente 2 iguais");
        }
        else System.out.println("Cidade diferentes!");

    }
}