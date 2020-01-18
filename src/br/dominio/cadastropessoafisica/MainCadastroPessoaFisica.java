/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.cadastropessoafisica;

/**
 *
 * @author belogo
 */

public final class MainCadastroPessoaFisica
{
   
   public static final void main (String [] args)
   {
    
      Identidade rg = new Identidade();
      
      System.out.println(rg.retornarDataEmissao());
      
      
   }//Fim do método main;
   
}//Fim da classe MainCadastroPessoaFisica;