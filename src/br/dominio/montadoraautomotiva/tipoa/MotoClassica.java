/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.montadoraautomotiva.tipoa;


/**
 *
 * @author belogo
 */

import br.dominio.api.AutomovelClassico;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class MotoClassica extends AutomovelClassico
{
   private double cilindradas;
   
   //Fim do campo de declaração de atributos;
   
   
   public MotoClassica()
   {
      
   }//Fim do método construtor padrão;
   
   public MotoClassica(double peso, double altura, double largura, double comprimento, String cor, double cavalosPotencia, double torque, double velocidadeMaximaEletronica, double autonomiaMedia, double capacidadeTanque, double cilindradas)
   {
      super(peso, altura, largura, comprimento, cor, cavalosPotencia, torque, velocidadeMaximaEletronica, autonomiaMedia, capacidadeTanque);
      
      //Fim do método super da classe mãe ou super classe AutomovelClassico;
      
      this.cilindradas = cilindradas;   
   }//Fim do método construtor personalizado;
   
   public double retornarCilindradas()
   {
      return cilindradas;
   }//Fim do método que retorna as cilindradas do objeto do tipo MotoClassica;
   
}//Fim da classe MotoClassica;