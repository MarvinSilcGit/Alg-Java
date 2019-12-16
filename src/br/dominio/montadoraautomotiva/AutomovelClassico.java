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

public class AutomovelClassico extends Automovel
{
   
   public enum QuantidadeDescarga
   {
      UM,
      DOIS,
      QUATRO;
   }
   
   
   public AutomovelClassico()
   {
      
   }//Fim do método construtor padrão;
   
   public AutomovelClassico(double peso, double altura, double largura, double comprimento, String cor)
   {
      super(peso, altura, largura, comprimento, cor);
      
      //Fim do método super da classe mãe ou super classe Automovel;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe AutomovelClassico;