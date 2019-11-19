package br.dominio.api;


import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Produto
{  
   private int codigoBarras,
           quantidade;

   private Date dataFabricacao;
   
   private String categoria,
           nome;
  
   //Fim do campo de declaração de atributos;
   

   public Produto()
   {
        
   }//Fim do método construtor padrão;

   public Produto(int codigoBarras, int quantidade, String categoria, String nome, Date dataFabricacao)   
   {        
      this.codigoBarras = codigoBarras;
       
      this.quantidade = quantidade;
      
      this.categoria = categoria;
      
      this.dataFabricacao = dataFabricacao;
   }//Fim do primeiro método construtor personalizado;
    
   public int retornarCodigoBarras() 
   {
      return codigoBarras;
   }//Fim do método que retorna o codigo do objeto do tipo Produto;
    
   public int retornarQuantidade()
   {
      return quantidade;
   }//Fim do método que retorna a quantidade do objeto do tipo Produto;
    
   public String retornarCategoria()
   {       
      return categoria;
   }//Fim do método que retorna a categoria do objeto do tipo Produto; 
   
   public String retornarNome()
   {
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Produto;
   
   public Date retornarDataFabricacao()
   {
      return dataFabricacao;
   }//Fim do método que retorna a data de fabricação do objeto do tipo Produto;
   
}//Fim da classe Produto;