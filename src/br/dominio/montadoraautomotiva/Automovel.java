/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.montadoraautomotiva;

/**
 *
 * @author belogo
 */

public abstract class Automovel 
{
   private double peso,
           altura,
           largura,
           comprimento;
   
   private String cor;  
   
   private double cavalosPotencia,
           torque,
           velocidadeMaximaEletronica;
   
   //Fim do campo de declaração de atributos;
   

   public enum QuantidadePneus
   {
      UM,
      DOIS,
      QUATRO,
      OITO,
      DEZESSEIS;
   }
   
   public enum QuantidadeParabrisa
   {
      UM;
   }   
   
   public enum QuantidadeBancos
   {
      UM,
      DOIS,
      TRES,
      CINCO;
   }
   
   public enum QuantidadeRetrovisor
   {
      DOIS,
      QUATRO;
   }
   
   
   public Automovel()
   {
      
   }//Fim do método construtor padrão;
   
   public Automovel(double peso, double altura, double largura, double comprimento, String cor, double cavalosPotencia, double torque, double velocidadeMaximaEletronica)
   {
      this.peso = peso;
      
      this.altura = altura;
      
      this.largura = largura;
      
      this.comprimento = comprimento;
      
      this.cor = cor;
      
      this.cavalosPotencia = cavalosPotencia;
      
      this.torque = torque;
      
      this.velocidadeMaximaEletronica = velocidadeMaximaEletronica;
   }//Fim do método construtor personalizado;
   
   public double retornarPeso()
   {
      return peso;
   }//Fim do método que retorna o peso do objeto do tipo Automovel;
   
   public double retornarAltura()
   {
      return altura;
   }//Fim do método que retorna a altura da objeto do tipo Automovel;
   
   public double retornarLargura()
   {
      return largura;
   }//Fim do método que retorna a largura do objeto do tipo Automovel;
   
   public double retornarComprimento()
   {
      return comprimento;
   }//Fim do método que retorna o comprimento do objeto do tipo Automovel;
   
   public String retornarCor()
   {
      return cor;
   }//Fim do método que retorna a cor do objeto do tipo Automovel;
   
}//Fim da classe Automovel;