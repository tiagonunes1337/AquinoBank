
package br.com.aquino.model;


public abstract class Conta {

    private int numero;
    private double saldo;
    private String titular; 

    public Conta(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;

    }
    
    public boolean depositar(double valor) {
    if (valor > 0) {
        this.saldo += valor; // Você soma ao saldo atual
        return true;
    }
    return false;
}

}
