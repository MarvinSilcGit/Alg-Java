package br.dominio.drograria;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.supermercado.ProdutoNaoPerecivel;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Remedio extends ProdutoNaoPerecivel
{    
   private String tipoTarja;
   
   private ArrayList listaSubstancias = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
    
   public Remedio()
   {     
   
   }//Fim do método construtor padrão;
    
   public Remedio(int codigo, int quantidade, String categoria, String nome, Date dataFabricacao, Date dataValidade, String tipoTarja)
   {         
      super(codigo, quantidade, categoria, nome, dataFabricacao, dataValidade);
       
      //Fim do método super da classe mãe ou super classe Produto;
     
   }//Fim do método construtor personalizado;
   
   public String retornaTipoTarja()
   {
      return this.tipoTarja;
   }//Fim do método que retorna o tarja do objeto do tipo Remedio;
   
   public ArrayList retornarListaSubstancias()
   {
      return this.listaSubstancias;
   }//Fim do método que retorna a lista do objeto do tipo Remedio;
   
}//Fim da classe Remedio;