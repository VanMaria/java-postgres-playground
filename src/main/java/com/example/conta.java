package com.example;

public class conta {
    String titular;
    int numero;
    String	agencia;
    double	saldo;
    String	dataDeAbertura;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getDataDeAbertura() {
        return dataDeAbertura;
    }
    public void setDatadeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void saca(double valor) {
        if (this.saldo > valor) {
            this.saldo = this.saldo - valor;
        } else {System.out.println("conta sem saldo suficiente para saque!");}
    }
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }
    public double saldo(int numero) {
        return this.saldo;
    }
    public double calculaRendimento (int numero, double taxa) {
        return this.saldo = this.saldo * 1.10;
    }
    
}
