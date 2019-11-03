package br.dominio.conta;


import br.dominio.cartao.CartaoDebito;

import br.dominio.api.ContaBancaria;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ContaPoupanca extends ContaBancaria
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
      
      //Fim do método super da classe mãe ou super classe Conta;

      this.taxaDividendosAno=taxaDividendosAno; 

      this.limiteSaquesMensais=limiteSaquesMensais;
   }//Fim do campo de declaração de atributos;
    
   public double retornarTaxaDividendos()
   {
      return this.taxaDividendosAno;
   }//Fim do método que retorna a taxa do objeto do tipo ContaPoupanca;

   public void alterarTaxaDividendos(double alterar)
   {
      this.taxaDividendosAno=alterar;
   }//Fim do método que altera a taxa do objeto do tipo ContaPoupanca;

   public int retornarLimiteSaquesMensais()
   {
      return this.limiteSaquesMensais;
   }//Fim do método que retorna limite saques do objeto do tipo ContaPoupanca;
   
}//Fim da classe ContaPoupanca;