/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.supermercado;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.dominio.api.ProdutoComValidade;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class ProdutoNaoPerecivel extends ProdutoComValidade
{   
   
   public ProdutoNaoPerecivel()
   {
      
   }//Fim do méodo construtor padrão;
   
   public ProdutoNaoPerecivel(int codigo, int quantidade, String categoria, String nome, Date dataFabricacao, Date dataValidade)
   {
      super(codigo, quantidade, categoria, nome, dataFabricacao, dataValidade);
      
      //Fim do método super da classe mãe ou super classe Produto;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe ProdutoNaoPerecivel;