/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.banco;

import br.dominio.cartao.CartaoDebito;

/**
 *
 * @author belogo
 */

public class ContaBancaria
{
   private double saldo,
           valorInicial; 
   
   private CartaoDebito cartaoDebito;
       
   //Fim do campo de declaração dea atributos;
   
   
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
   }
   
   public void alterarSaldo(double novoValor)
   {
      this.saldo+=novoValor;
   }
   
}//Fim da classe ContaBancaria;