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

public class AutomovelEletrico extends Automovel
{
   
   public AutomovelEletrico()
   {
      
   }//Fim do método construtor padrão;
   
   public AutomovelEletrico(double peso, double largura, double altura, double comprimento, String cor)
   {
      super(peso, largura, altura, comprimento, cor);
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe AutomovelEletrico;