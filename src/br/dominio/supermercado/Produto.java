package br.dominio.supermercado;


import java.util.Date;

import br.dominio.empresa.Funcionario;

public class Produto
{    
   private String nome;
   
   private int codigo, quantidade;

   private Date dataEntrada, dataSaida, dataValidade;
  
   //Fim do campo de declaração de atributos;
   

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
   }//Fim do método que retorna o nome do objeto do tipo Produto;
    
   public int retornarCodigo() 
   {
      return this.codigo;
   }//Fim do método que retorna o codigo do objeto do tipo Produto;
    
   public int retornarQuantidade()
   {
      return this.quantidade;
   }//Fim do método que retorna a quantidade do objeto do tipo Produto;
    
   public Date retornarDataEntrada()
   { 
      return this.dataEntrada;
   }//Fim do método que retorna a data de entrada do objeto do tipo Produto;
    
   public Date retornarDataSaida()
   { 
      return this.dataSaida;
   }//Fim do método que retorna a data de saída do objeto do tipo Produto;
    
   public Date retornarDataValidade()
   {  
      return this.dataValidade;
   }//Fim do método que retorna a data de validade do objeto do tipo Produto;
    
}//Fim da classe Produto;