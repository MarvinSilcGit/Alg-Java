package br.dominio.banco;


import br.dominio.api.Endereco;

import br.dominio.conta.ContaCorrente;

import br.dominio.conta.ContaPoupanca;

import br.dominio.cartao.CartaoDebito;

import br.dominio.cartao.CartaoCredito;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class MainBanco
{

   public static void main(String[] args)
   {    
      CartaoDebito cd1 = new CartaoDebito(0,0,0,0,"a",null,"x"); 
      
      ContaPoupanca cp1 = new ContaPoupanca(0,50,cd1,6,10);
        
      CartaoCredito cc1 = new CartaoCredito(0,0,0,0,"a",null,0,null);     
       
      ContaCorrente ct1 = new ContaCorrente(0,100,cd1,1,cc1);    
   }//Fim do método main;
    
}//Fim da classe MainBanco;