package br.dominio.conta;


import br.dominio.api.ContaBancaria;

import br.dominio.cartao.CartaoDebito;

import br.dominio.cartao.CartaoCredito;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ContaCorrente extends ContaBancaria
{   
   private float taxaMensal;
    
   private CartaoCredito cartaoCredito;
   
   //Fim do campo de declaração de atributos;
    
    
   public ContaCorrente()
   {        
   
   }//Fim do método construtor padrão;
    
   public ContaCorrente (float saldo, float valorInicial, CartaoDebito cartaoDebito, float taxaMensal, CartaoCredito cartaoCredito)
   {     
      super (saldo, valorInicial, cartaoDebito);
    
      //Fim do método super da classe mãe ou super classe ContaBancaria;
      
      this.taxaMensal = taxaMensal;  
      
      this.cartaoCredito = cartaoCredito;
    }//Fim do método construtor padrão;
    
   public final float retornarTaxaMensal()
   {     
      return this.taxaMensal;
   }//Fim do método que retorna a taxa mensal do objeto do tipo ContaCorrente;
    
   public final void alterarTaxaMensal (float novaTaxaMensal)
   { 
      taxaMensal = novaTaxaMensal;
   }//Fim do método que altera a taxa mensal do objeto do tipo ContaCorrente;
    
   public final CartaoCredito acessarCartaoCredito()
   { 
      return this.cartaoCredito;
   }//Fim do método que da acesso o objeto do tipo CartaoCredito no objeto do tipo ContaCorrente;
    
}//Fim da classe ContaCorrente;