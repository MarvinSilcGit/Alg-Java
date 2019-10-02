package br.dominio.supermercado;


import java.util.Date;

import br.dominio.empresa.Funcionario;

public class Produto
{    
   private String nome;
   
   private int codigo, quantidade;

   private Date dataEntrada, dataSaida, dataValidade;
  

   public Produto()
   {
        
   }//Fim do método construtor padrão;

   public Produto(String nome, int codigo, int quantidade, Date dataEntrada, Date dataSaida, Date dataValidade)   
   {    
       
      this.nome=nome;
       
      this.codigo=codigo;
       
      this.quantidade=quantidade;
       
      this.dataEntrada=dataEntrada;
       
      this.dataSaida=dataSaida;

      this.dataValidade=dataValidade;
    }//Fim do primeiro método construtor personalizado;
    
    
   public Produto(String nome, int codigo, int quantidade, Date dataEntrada, Date dataSaida)
   {
      
      this.nome=nome;
      
      this.codigo=codigo;
      
      this.quantidade=quantidade;
      
      this.dataEntrada=dataEntrada;
      
      this.dataSaida=dataSaida; 
   }//Fim do segundo método construtor personalizado;
    
   public String retornarNomeProduto()
   { 
      return this.nome;
   }
    
   public int retornarCodigo() 
   {
      return this.codigo;
   }
    
   public int retornarQuantidade()
   {
      return this.quantidade;
   }
    
   public Date retornarDataEntrada()
   { 
      return this.dataEntrada;
   }
    
   public Date retornarDataSaida()
   { 
      return this.dataSaida;
   }
    
   public Date retornarDataValidade()
   {  
      return this.dataValidade;
   }
    
}//Fim da classe Produto;