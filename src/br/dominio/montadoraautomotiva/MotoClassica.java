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

public class MotoClassica extends AutomovelClassico
{
   
   public MotoClassica()
   {
      
   }//Fim do método construtor padrão;
   
   public MotoClassica(double peso, double altura, double largura, double comprimento, String cor)
   {
      super(peso, altura, largura, comprimento, cor);
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe MotoClassica;