package br.dominio.api;


import java.util.Date;

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Produto
{  
   private int codigoBarras,
           quantidade;

   private Date dataFabricacao;
   
   private String categoria,
           nome;
   
   private ArrayList listaSubstancias = new ArrayList();
  
   //Fim do campo de declaração de atributos;
   

   public Produto()
   {
        
   }//Fim do método construtor padrão;

   public Produto(int codigoBarras, int quantidade, Date dataFabricacao, String categoria, String nome)   
   {        
      this.codigoBarras = codigoBarras;
       
      this.quantidade = quantidade;
      
      this.categoria = categoria;
      
      this.dataFabricacao = dataFabricacao;
      
      this.nome = nome;
   }//Fim do primeiro método construtor personalizado;
    
   
   public Produto(int codigoBarras, int quantidade, Date dataFabricacao, String categoria)   
   {        
      this.codigoBarras = codigoBarras;
       
      this.quantidade = quantidade;
      
      this.categoria = categoria;
      
      this.dataFabricacao = dataFabricacao;
   }//Fim do segundo método construtor personalizado;
   
   public int retornarCodigoBarras() 
   {
      return codigoBarras;
   }//Fim do método que retorna o codigo do objeto do tipo Produto;
    
   public int retornarQuantidade()
   {
      return quantidade;
   }//Fim do método que retorna a quantidade do objeto do tipo Produto;
       
   public Date retornarDataFabricacao()
   {
      return dataFabricacao;
   }//Fim do método que retorna a data de fabricação do objeto do tipo Produto;
   
   public String retornarCategoria()
   {       
      return categoria;
   }//Fim do método que retorna a categoria do objeto do tipo Produto; 
   
   public String retornarNome()
   {
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Produto;
   
   public ArrayList retornarListaSubstancias()
   {
      return this.listaSubstancias;
   }//Fim do método que retorna a lista do objeto do tipo Produto;
   
}//Fim da classe Produto;