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


public class Predio 
{
   private String nome;
   
   private double area;
   
   private ArrayList listaSalas = new ArrayList(10);
   
   //Fim do campo de declaração de atributos;
   
   
   public Predio()
   {
      
   }//Fim do método construtor padrão;
   
   public Predio(String nome, double area)
   {
      this.nome=nome;
      
      this.area=area;
   }//Fim do método construtor personalizado;
   
   public String retornarNomePredio()
   {
      return this.nome;
   }
   
   public void alterarNome(String novoNome)
   {
      this.nome=novoNome;
   }
   
}//Fim da classe Predio;