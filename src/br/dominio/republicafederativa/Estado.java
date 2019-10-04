package br.dominio.republicafederativa;


import java.util.ArrayList;


//Colocar lista secretarias municipais e estaduais;

public class Estado extends Pais
{    
   private ArrayList listaCidades = new ArrayList();
    
   
   public Estado()
   {     
   
   }
    
   public Estado(String nome, String moeda, double populacao, double tesouro, double pib, double idh)
   {     
      super(nome, moeda, populacao, tesouro, pib, idh);
      
      //Fim do método construtor Super da classe mãe ou superclasse Pais;
   }
   
}//Fim da classe Estado;