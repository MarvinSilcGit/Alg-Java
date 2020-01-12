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

import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class ProdutoComValidade extends Produto
{
   private Date dataValidade;
 
   //Fim do campo de declaração de atributos;
   
   
   public ProdutoComValidade()
   {
      
   }//Fim do método construtor padrão;
   
   public ProdutoComValidade (int codigo, int quantidade, String categoria, String nome, Date dataFabricacao, Date dataValidade)
   {
      super (codigo, quantidade, dataFabricacao, categoria, nome);
      
      //Fim do método super da classe mãe ou super classe Produto;
      
      this.dataValidade = dataValidade;
   }//Fim do método construtor personalizado;
   
   public final Date retornarDataValidade()
   {
      return dataValidade;
   }//Fim do método que retorna a dataValidade do objeto do tipo ProdutoComValidade;
   
}//Fim da classe ProdutoComValidade;