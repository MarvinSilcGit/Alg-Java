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

public abstract class AutomovelEletrico extends Automovel
{
   private double capacidadeBateria;
   
   //Fim do campo de declaração de atributos;
   
   
   public AutomovelEletrico()
   {
      
   }//Fim do método construtor padrão;
   
   public AutomovelEletrico(double peso, double largura, double altura, double comprimento, String cor, double cavalosPotencia, double torque, double velocidadeMaximaEletronica, double autonomiaMedia, double capacidadeBateria)
   {
      super(peso, largura, altura, comprimento, cor, cavalosPotencia, torque, velocidadeMaximaEletronica, autonomiaMedia);
      
      //Fim do método super da classe mãe ou super classe Automovel;
      
      this.capacidadeBateria = capacidadeBateria;
   }//Fim do método construtor personalizado;
   
   public double retornarCapacidadeBateria()
   {
      return capacidadeBateria;
   }//Fim do método que retorna a capacidade de bateria do objeto do tipo AutomovelEletrico;
   
}//Fim da classe AutomovelEletrico;