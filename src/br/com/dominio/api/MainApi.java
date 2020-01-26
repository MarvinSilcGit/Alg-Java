/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.api;

/**
 *
 * @author belogo
 */

public final class MainApi
{
  
   public static final void main (String [] args)
   {  

      Endereco en = new Endereco (1,"",1,"","","asa");
      
      System.out.println(en.retornarEnderecoCompleto());
      
   }//Fim do método main;
   
}//Fim da classe MainApi;