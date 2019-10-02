/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.cadastro;

/**
 *
 * @author belogo
 */

public class Telefone 
{
   private int ddi, dddCurtaDistancia, dddLongaDistancia, numero;
   
   //Fim do campo de declaração de atributos;
   
   public Telefone()
   {
     
   }//Fim do método construtor padrão;
   
   public Telefone(int ddi, int dddCurtaDistancia, int dddLongaDistancia, int numero)
   {
      
      this.ddi=ddi;
      
      this.dddCurtaDistancia=dddCurtaDistancia;
      
      this.dddLongaDistancia=dddLongaDistancia;
      
      this.numero=numero;
   }//Fim do método construtor personalizado;
   
   public int retornarDdi()
   {
      return this.ddi;
   }
   
   public void alterarDdi(int novoDdi)
   {
      this.ddi=novoDdi;
   }
   
   public int retornarDddCurtaDistancia()
   {
      return this.dddCurtaDistancia;
   }
   
   public void alterarDddCurtaDistancia(int novoDdd)
   {
      this.dddCurtaDistancia=novoDdd;
   }
   
   public int retornarDddLongaDistancia()
   {
      return this.dddLongaDistancia;
   }
   
   public void alterarDddLongaDistancia(int novoDdd)
   {
      this.dddLongaDistancia=novoDdd;
   }
   
   public int retornarNumero()
   {
      return this.numero;
   }
   
   public void alterarNumero(int novoNumero)
   {
      this.numero=novoNumero;
   }
   
}//Fim da classe Telefone;