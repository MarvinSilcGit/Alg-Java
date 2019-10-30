/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.republicafederativa.republica;

/**
 *
 * @author belogo
 */

import java.util.Date;

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Moeda 
{
   private String nome;
   
   private Date dataCriacao;
   
   private ArrayList representaçãoMonetária = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public Moeda()
   {
      
   }//Fim do método construtor padrão;

   public Moeda(String nome, Date dataCriacao)
   {
      this.nome=nome;
      
      this.dataCriacao=dataCriacao;
   }//Fim do método construtor personalizado;
   
}//Fim da classe Moeda;