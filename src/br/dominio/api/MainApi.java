/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.api;

/**
 *
 * @author belogo
 */

public final class MainApi 
{
  
   public static final void main (String [] args)
   {  
      
      Cidadao cid = new Cidadao();
      
      System.out.println(cid.retornarNome().isEmpty());
      
   }//Fim do método main;
   
}//Fim da classe MainApi;