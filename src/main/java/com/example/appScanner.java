package com.example;

import java.util.Scanner;

public class appScanner {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();  

        System.out.println("Digite o nome do Cliente:");
        cliente.setNome(scanner.nextLine());

        System.out.println("Digite o Sexo do Cliente:");
        String sexo = scanner.nextLine();
        cliente.setSexo(sexo.charAt(0));

        System.out.println("Digite o CPF do Cliente:");
        cliente.setCpf(scanner.nextLine());

        System.out.println("Digite a cidade do Cliente:");
        cliente.setCidade(scanner.nextLine());

        System.out.println("Digite a renda do Cliente:");
        cliente.setRenda(scanner.nextDouble());

        System.out.println("Digite o Ano Nascimento do Cliente:");
        cliente.setAnoNascimento(scanner.nextInt());

       
        System.out.println("Cliente nome: "+ cliente.getNome());
        System.out.println("Cliente CPF: " + cliente.getCpf());
        System.out.println("Cliente Cidade: " + cliente.getCidade());
        System.out.println("Cliente renda: " + cliente.getRenda());
        System.out.println("Cliente anoNascimento: " + cliente.getAnoNascimento());
        System.out.println("Cliente sexo: " + cliente.getSexo());
        System.out.println("Cliente Especial: " + cliente.isEspecial());
       

      
    }
}