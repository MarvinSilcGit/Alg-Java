package br.dominio.conta;


import br.dominio.cartao.CartaoDebito;

import br.dominio.cartao.CartaoCredito;


public class ContaCorrente extends Conta{
    
    private double taxaMensal;
    
    private CartaoCredito cartaoCredito;
    
    
    public ContaCorrente(){
        
    }
    
    public ContaCorrente(double saldo, double valorInicial, CartaoDebito cartaoDebito, double taxaMensal, CartaoCredito cartaoCredito){
        
        super(saldo, valorInicial, cartaoDebito);
    
        this.taxaMensal=taxaMensal;
        
        this.cartaoCredito=cartaoCredito;
    }
    
    public double retornarTaxaMensal(){
        
        return this.taxaMensal;
    }
    
    public void alterarTaxaMensal(double novaTaxaMensal){
    
        this.taxaMensal=novaTaxaMensal;
    }
    
    public CartaoCredito acessarCartaoCredito(){
    
        return this.cartaoCredito;
    }
}