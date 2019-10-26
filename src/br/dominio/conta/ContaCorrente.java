package br.dominio.conta;


import br.dominio.banco.ContaBancaria;

import br.dominio.cartao.CartaoDebito;

import br.dominio.cartao.CartaoCredito;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class ContaCorrente extends ContaBancaria
{   
   private double taxaMensal;
    
   private CartaoCredito cartaoCredito;
   
   //Fim do campo de declaração de atributos;
    
    
   /*public ContaCorrente()
   {        
   
   }//Fim do método construtor padrão;
    */
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
    
}//Fim da classe ContaCorrente;