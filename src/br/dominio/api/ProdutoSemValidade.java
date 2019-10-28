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


public abstract class ProdutoSemValidade extends Produto
{
 
   public ProdutoSemValidade()
   {
      
   }//Fim do método construtor padrão;
   
   public ProdutoSemValidade(int codigo, int quantidade, Date dataEntrada, Date dataSaida, String categoria, String nome)
   {
      super(codigo, quantidade, dataEntrada, dataSaida, categoria, nome);
      
      //Fim do método super da classe mãe ou superclasse Produto;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe ProdutoSemValidade;