package com.example.model;

public class Cliente {
    private String cpf;
    private String nome;
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;
    private String cidade;
    

     public Cliente(){
        System.out.println("criando um cliente sem parametros!");
        double aleatorio = Math.random();
        if (aleatorio >= 0.5)
            especial = true;
    }


    public Cliente (double renda, char sexo){
        this();
        System.out.println("criando um cliente com parametros!");
        setRenda(renda);
        this.sexo = sexo;
       
    }
    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome.isBlank()) {
            System.out.println("nome não pode ser vazio!");
        }
        else this.nome = nome.toUpperCase().trim();
    }
    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f')
            this.sexo = sexo;
        else System.out.println("sexo inválido");
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    
    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        if (renda >= 0 )
            this.renda = renda;
        else System.out.println("A renda não pode ser menor que zero!");
    }
}