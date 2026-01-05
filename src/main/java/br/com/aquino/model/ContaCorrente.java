package br.com.aquino.model;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(int numero, double saldo, String titular) {
        super(numero, saldo, titular);
    }
    
    @Override
public boolean sacar(double valor) {
    double valorComTaxa = valor + 0.50; // Taxa de saque
    return super.sacar(valorComTaxa); 
}
    
}
