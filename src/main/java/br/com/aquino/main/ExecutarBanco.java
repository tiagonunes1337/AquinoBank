package br.com.aquino.main;

import br.com.aquino.model.ContaCorrente;


public class ExecutarBanco {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100, 1000.0, "Tiago");
        
      
        cc.depositar(500);
        if(cc.sacar(100)) {
            System.out.println("Saque realizado! Saldo atual: " + cc.getSaldo());
        } else {
            System.out.println("Saldo insuficiente!");
        }  
    }
    
}
