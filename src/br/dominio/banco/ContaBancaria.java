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

   public ContaBancaria(double saldo, double valorInicial, CartaoDebito cartaoDebito)
   {
      this.saldo=saldo;
      
      this.valorInicial=valorInicial;
      
      this.cartaoDebito=cartaoDebito;
      
   }
   
}//Fim da classe ContaBancaria;