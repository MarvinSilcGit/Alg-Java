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

public abstract class Automovel 
{
   private double peso,
           altura,
           largura,
           comprimento;
   
   private String cor;  
   
   private double cavalosPotencia,
           torque,
           velocidadeMaximaEletronica,
           autonomiaMedia;
   
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
   
   public enum QuantidadeMarchas
   {
      UM,
      QUATRO,
      CINCO,
      SEIS,
      SETE,
      OITO;
   }
   
   
   public Automovel()
   {
      
   }//Fim do método construtor padrão;
   
   public Automovel (double peso, double altura, double largura, double comprimento, String cor, double cavalosPotencia, double torque, double velocidadeMaximaEletronica, double autonomiaMedia)
   {
      this.peso = peso;
      
      this.altura = altura;
      
      this.largura = largura;
      
      this.comprimento = comprimento;
      
      this.cor = cor;
      
      this.cavalosPotencia = cavalosPotencia;
      
      this.torque = torque;
      
      this.velocidadeMaximaEletronica = velocidadeMaximaEletronica;
      
      this.autonomiaMedia = autonomiaMedia;
   }//Fim do método construtor personalizado;
   
   public final double retornarPeso()
   {
      return peso;
   }//Fim do método que retorna o peso do objeto do tipo Automovel;
   
   public final double retornarAltura()
   {
      return altura;
   }//Fim do método que retorna a altura da objeto do tipo Automovel;
   
   public final double retornarLargura()
   {
      return largura;
   }//Fim do método que retorna a largura do objeto do tipo Automovel;
   
   public final double retornarComprimento()
   {
      return comprimento;
   }//Fim do método que retorna o comprimento do objeto do tipo Automovel;
   
   public final String retornarCor()
   {
      return cor;
   }//Fim do método que retorna a cor do objeto do tipo Automovel;
   
   public final double retornarCavalosPotencia()
   {
      return cavalosPotencia;
   }//Fim do método que retorna os cavalos de potência do objeto do tipo Automovel;
   
   public final double retornarTorque()
   {
      return torque;
   }//Fim do método que retorna o torque do do objeto do tipo Automovel;
   
   public final double retornarVelocidadeMaximaEletronica()
   {
      return velocidadeMaximaEletronica;
   }//Fim do método que retorna a velocidade máxima eletrônica do objeto do tipo Automovel;
   
   public final double retornarAutonomiaMedia()
   {
      return autonomiaMedia;
   }//Fim do método que retorna a autonomia média do objeto do tipo Automovel;
   
}//Fim da classe Automovel;