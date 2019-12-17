/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.montadoraautomotiva.tipoc;

/**
 *
 * @author belogo
 */

import br.dominio.api.AutomovelClassico;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class CaminhaoClassico extends AutomovelClassico
{
   
   public CaminhaoClassico()
   {
      
   }//Fim do método construtor padrão;
   
   public CaminhaoClassico(double peso, double largura, double altura, double comprimento, String cor, double cavalosPotencia, double torque, double velocidadeMaximaEletronica)
   {
      super(peso, largura, altura, comprimento, cor, cavalosPotencia, torque, velocidadeMaximaEletronica);
         
      //Fim do método super da classe mãe ou super classe AutomovelClassico;
      
   }//Fim do método construtor padrão;
   
}//Fim da classe CaminhaoClassico;