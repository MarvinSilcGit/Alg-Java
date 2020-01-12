package br.dominio.drograria;


import java.util.Date;

import br.dominio.api.ProdutoComValidade;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Remedio extends ProdutoComValidade
{    
   
   public enum TipoTarja
   {
      PRETA,
      BRANCA,
      VERMELHA;
   }
   
    
   public Remedio()
   {     
   
   }//Fim do método construtor padrão;
    
   public Remedio (int codigo, int quantidade, String categoria, String nome, Date dataFabricacao, Date dataValidade, String tipoTarja)
   {         
      super (codigo, quantidade, categoria, nome, dataFabricacao, dataValidade);
       
      //Fim do método super da classe mãe ou super classe Produto;
     
   }//Fim do método construtor personalizado;
   
}//Fim da classe Remedio;