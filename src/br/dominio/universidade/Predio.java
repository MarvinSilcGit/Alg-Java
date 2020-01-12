/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.universidade;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Predio 
{
   private String nome;
   
   private double area;
   
   private ArrayList listaSalas = new ArrayList(10);
   
   //Fim do campo de declaração de atributos;
   
   
   public Predio()
   {
      
   }//Fim do método construtor padrão;
   
   public Predio (String nome, double area)
   {
      this.nome = nome;
      
      this.area = area;
   }//Fim do método construtor personalizado;
   
   public final String retornarNomePredio()
   {
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Predio;
   
   public final void alterarNome (String novoNome)
   {
      nome = novoNome;
   }//Fim do método que altera o nome do objeto do tipo Predio;
   
   public final double retornarArea()
   {
      return area;
   }//Fim do método que retorna a área do objeto do tipo Predio;
   
   public final void alterarArea (double novaArea)
   {
      area = novaArea;
   }//Fim do método que altera a área do objeto do tipo Predio;
   
}//Fim da classe Predio;