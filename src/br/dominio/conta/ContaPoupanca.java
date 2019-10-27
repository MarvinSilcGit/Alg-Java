package br.dominio.conta;


import br.dominio.cartao.CartaoDebito;

import br.dominio.banco.ContaBancaria;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class ContaPoupanca extends ContaBancaria
{    
   private double taxaDividendosAno;
   
   private int limiteSaquesMensais;
    
   //Fim do campo de declaração de atributos;
   
   
   public ContaPoupanca()
   {
   
   }//Fim do método construtor Padrão;
    
   public ContaPoupanca(double saldo, double valorInicial, CartaoDebito cartaoDebito, double taxaDividendosAno, int limiteSaquesMensais)
   {        
      super(saldo, valorInicial, cartaoDebito);

      this.taxaDividendosAno=taxaDividendosAno; 

      this.limiteSaquesMensais=limiteSaquesMensais;
   }
    
   public double retornarTaxaDividendos()
   {
      return this.taxaDividendosAno;
   }

   public void alterarTaxaDividendos(double alterar)
   {
      this.taxaDividendosAno=alterar;
   }

   public int retornarLimiteSaquesMensais()
   {
      return this.limiteSaquesMensais;
   }
   
}//Fim da classe ContaPoupanca;