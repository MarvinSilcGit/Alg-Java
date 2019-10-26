package br.dominio.drograria;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.cadastro.Produto;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Remedio extends Produto
{    
   private String tipoTarja, nome;
   
   private ArrayList listaSubstancias = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
    
   public Remedio()
   {     
   
   }//Fim do método construtor padrão;
    
  /* public Remedio(int codigo, int quantidade, Date dataEntrada, Date dataSaida, Date dataValidade, String categoria, String tipoTarja, String nome)
   {         
      super(codigo, quantidade, dataEntrada, dataSaida, dataValidade);
       
      //Fim do método super da classe mãe ou super classe Produto;

     
   }//Fim do método construtor personalizado;
   */
}//Fim da classe Remedio;