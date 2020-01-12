/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.api;

/**
 *
 * @author belogo
 */

import br.dominio.cartao.CartaoDebito;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class ContaBancaria
{
   private double saldo,
           valorInicial; 
   
   private CartaoDebito cartaoDebito;
       
   //Fim do campo de declaração de atributos;
   
   
   public ContaBancaria()
   {
      
   }//Fim do método construtor padrão;

   public ContaBancaria (double saldo, double valorInicial, CartaoDebito cartaoDebito)
   {
      this.saldo = saldo;
      
      this.valorInicial = valorInicial;
      
      this.cartaoDebito = cartaoDebito;    
   }//Fim do método construtor personalizado;
   
   public final double retornarSaldo()
   {
      if (valorInicial != 0)
      {
         return valorInicial;
      }
      else
      {
         return saldo;
      }
   }//Fim do método que retorna o saldo do objeto do tipo ContaBancaria;
   
   public final CartaoDebito retornarCartaoDebito()
   {
      return cartaoDebito;
   }//Fim do método que dá acesso ao objeto do tipo CartaoDebito no objeto do tipo ContaBancaria;
   
}//Fim da classe ContaBancaria;