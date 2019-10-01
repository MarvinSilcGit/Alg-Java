/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.universidade;

/**
 *
 * @author belogo
 */
public class Telefone 
{
   private int DDI, DDDCurtaDistancia, DDDLongaDistancia, numero;
   
   //Fim do campo de declaração de atributos;
   
   public Telefone()
   {
      
   }
   
   public Telefone(int DDI, int DDDCurtaDistancia, int DDDLongaDistancia, int numero)
   {
      
      this.DDI=DDI;
      
      this.DDDCurtaDistancia=DDDCurtaDistancia;
      
      this.DDDLongaDistancia=DDDLongaDistancia;
      
      this.numero=numero;
   }//Fim do método construtor personalizado;
   
}//Fim da classe Telefone;