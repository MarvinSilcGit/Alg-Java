/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.republicafederativa;

/**
 *
 * @author belogo
 */

import java.util.Date;

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Moeda 
{
   private String nome;
   
   private Date dataCriacao;
   
   private ArrayList representaçãoMonetária = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public Moeda()
   {
      
   }//Fim do método construtor padrão;

   public Moeda (String nome, Date dataCriacao)
   {
      this.nome = nome;
      
      this.dataCriacao = dataCriacao;
   }//Fim do método construtor personalizado;
   
   public final String retornarNome()
   {
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Moeda;
   
   public final Date retornarDataCriacao()
   {
      return dataCriacao;
   }//Fim do método que retorna a data de criação do objeto do tipo Moeda;
   
}//Fim da classe Moeda;