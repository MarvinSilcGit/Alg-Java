/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.montadoraautomotiva.tipoe;

/**
 *
 * @author belogo
 */

import br.dominio.api.AutomovelClassico;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class CarretaClassica extends AutomovelClassico
{
   
   public CarretaClassica()
   {
      
   }//Fim do método construtor padrão;
   
   public CarretaClassica(double peso, double altura, double largura, double comprimento, String cor, double cavalosPotencia, double torque, double velocidadeMaximaEletronica, double autonomiaMedia, double capacidadeTanque)
   {
      super(peso, altura, largura, comprimento, cor, cavalosPotencia, torque, velocidadeMaximaEletronica, autonomiaMedia, capacidadeTanque);
      
      //Fim do método super da classe mãe ou super classe AutomovelClassico;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe CarretaClassica;