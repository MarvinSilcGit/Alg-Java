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

   public ContaBancaria(double saldo, double valorInicial, CartaoDebito cartaoDebito)
   {
      this.saldo=saldo;
      
      this.valorInicial=valorInicial;
      
      this.cartaoDebito=cartaoDebito;    
   }//Fim do método construtor personalizado;
   
   public double retornarSaldo()
   {
      if (this.valorInicial != 0)
      {
         return this.valorInicial;
      }
      else
      {
         return this.saldo;
      }
   }//Fim do método que retorna o saldo do objeto do tipo ContaBancaria;
   
   public void aumentarSaldo(double novoValor)
   {
      this.saldo+=novoValor;
   }//Fim do método que aumenta o saldo do objeto do tipo ContaBancaria;
   
   public void diminuirSaldo(double novoValor)
   {
      this.saldo-=novoValor;
   }//Fim do método que diminui o saldo do objeto do tipo ContaBancaria
   
   public CartaoDebito retornarCartaoDebito()
   {
      return this.cartaoDebito;
   }//Fim do método que dá acesso ao objeto do tipo CartaoDebito no objeto do tipo ContaBancaria;
   
}//Fim da classe ContaBancaria;