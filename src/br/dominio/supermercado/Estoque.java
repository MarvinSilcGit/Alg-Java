package br.dominio.supermercado;


import java.util.ArrayList;

import br.dominio.api.Produto;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

//Fazer uma maneira de que se possa inserir e remover categorias do estoque;

public final class Estoque
{
   private int numeroCategorias;
   
   private ArrayList listaProdutos = new ArrayList(); 
   
   //Fim do campo de declaração de atributos;

   
   public Estoque()
   {     
   
   }//Fim do método construtor padrão;
    
   public Estoque (int numeroCategorias)
   {     
      this.numeroCategorias = numeroCategorias;
 
   }//Fim do método construtor personalizado; 
   
   public final int retornarNumeroCategorias()
   {
      return numeroCategorias;
   }//Fim do método que retorna a quantidade de categorias do objeto do tipo Estoque;

   public final ArrayList retornarListaProdutos()
   {
      return listaProdutos;
   }//Fim do método que retorna a lista do objeto do tipo Estoque;

   public final void inserirProdutoListaEstoque (Produto novoCodigo)
   {
      listaProdutos.add (novoCodigo);
   }//Fim do método que insere um objeto do tipo Produto na lista do objeto do tipo Estoque;

   public final void removerProdutoListaEstoque (Produto removerCodigo)
   {
      listaProdutos.remove (removerCodigo);
   }//Fim do método que remove um objeto do tipo Produto da lista do objeto do tipo Estoque;
   
}//Fim da classe Estoque;