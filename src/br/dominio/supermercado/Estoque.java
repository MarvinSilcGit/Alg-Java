package br.dominio.supermercado;


import br.dominio.cadastro.Produto;

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

//Fazer uma maneira de que se possa inserir e remover categorias do estoque;

public class Estoque
{
   private int numeroCategorias;
   
   private ArrayList listaProdutos = new ArrayList(); 
   
   //Fim do campo de declaração de atributos;

   
   public Estoque()
   {     
   
   }//Fim do método construtor padrão;
    
    
   public Estoque(int numeroCategorias)
   {     
      this.numeroCategorias=numeroCategorias;
 
   }//Fim do método construtor personalizado;
    
   
   public int retornarNumeroCategorias()
   {
      return this.numeroCategorias;
   }//Fim do método que retorna a quantidade de categorias do objeto do tipo Estoque;

   public ArrayList retornarListaProdutos()
   {
      return this.listaProdutos;
   }//Fim do método que retorna a lista do objeto do tipo Estoque;

   public void inserirProdutoListaEstoque(Produto novoCodigo)
   {
      this.listaProdutos.add(novoCodigo);
   }//Fim do método que insere um objeto do tipo Produto na lista do objeto do tipo Estoque;

   public void removerProdutoListaEstoque(Produto removerCodigo)
   {
      this.listaProdutos.remove(removerCodigo);
   }//Fim do método que remove um objeto do tipo Produto da lista do objeto do tipo Estoque;
   
}//Fim da classe Estoque;