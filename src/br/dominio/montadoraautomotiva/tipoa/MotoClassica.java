/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.montadoraautomotiva.tipoa;

import br.dominio.api.AutomovelClassico;

/**
 *
 * @author belogo
 */

public class MotoClassica extends AutomovelClassico
{
   
   public MotoClassica()
   {
      
   }//Fim do método construtor padrão;
   
   public MotoClassica(double peso, double altura, double largura, double comprimento, String cor, double cavalosPotencia, double torque, double velocidadeMaximaEletronica)
   {
      super(peso, altura, largura, comprimento, cor, cavalosPotencia, torque, velocidadeMaximaEletronica);
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe MotoClassica;