package com.example;

public class Cliente {
    private double renda;
    private char sexo;
    private int anoNascimento;

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