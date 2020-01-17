package br.dominio.conta;


import br.dominio.cartao.CartaoDebito;

import br.dominio.api.ContaBancaria;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ContaPoupanca extends ContaBancaria
{    
   private float taxaDividendosAno;
   
   private byte limiteSaquesMensais;
    
   //Fim do campo de declaração de atributos;
   
   
   public ContaPoupanca()
   {
   
   }//Fim do método construtor Padrão;
    
   public ContaPoupanca (float saldo, float valorInicial, CartaoDebito cartaoDebito, float taxaDividendosAno, byte limiteSaquesMensais)
   {        
      super (saldo, valorInicial, cartaoDebito);
      
      //Fim do método super da classe mãe ou super classe Conta;

      this.taxaDividendosAno = taxaDividendosAno; 

      this.limiteSaquesMensais = limiteSaquesMensais;
   }//Fim do campo de declaração de atributos;
    
   public final float retornarTaxaDividendos()
   {
      return taxaDividendosAno;
   }//Fim do método que retorna a taxa do objeto do tipo ContaPoupanca;

   public final void alterarTaxaDividendos (float alterar)
   {
      taxaDividendosAno = alterar;
   }//Fim do método que altera a taxa do objeto do tipo ContaPoupanca;

   public final byte retornarLimiteSaquesMensais()
   {
      return limiteSaquesMensais;
   }//Fim do método que retorna limite saques do objeto do tipo ContaPoupanca;
   
}//Fim da classe ContaPoupanca;