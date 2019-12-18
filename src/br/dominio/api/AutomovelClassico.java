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

public abstract class AutomovelClassico extends Automovel
{
   private double capacidadeTanque;
  
   //Fim do campo de declaração de atributos;
   
   
   public enum QuantidadeDescarga
   {
      UM,
      DOIS,
      QUATRO;
   }
   
   
   public AutomovelClassico()
   {
      
   }//Fim do método construtor padrão;
   
   public AutomovelClassico(double peso, double altura, double largura, double comprimento, String cor, double cavalosPotencia, double torque, double velocidadeMaximaEletronica, double autonomiaMedia, double capacidadeTanque)
   {
      super(peso, altura, largura, comprimento, cor, cavalosPotencia, torque, velocidadeMaximaEletronica, autonomiaMedia);
      
      //Fim do método super da classe mãe ou super classe Automovel;
      
      this.capacidadeTanque = capacidadeTanque;
   }//Fim do método construtor personalizado;
   
   public double retornarCapacidadeTanque()
   {
      return capacidadeTanque;
   }//Fim do método que retorna a capacidade do tanque do objeto do tipo AutomovelClassico;
   
}//Fim da classe AutomovelClassico;