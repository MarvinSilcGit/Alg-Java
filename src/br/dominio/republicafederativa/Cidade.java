package br.dominio.republicafederativa;


public class Cidade extends Estado
{     
   public Cidade() 
   {
        
   }//Fim do método construtor padrão;
    
   public Cidade(String nome, String moeda, double populacao, double tesouro, double pib, double idh)
   {     
      super(nome,moeda, populacao, tesouro, pib, idh); 
      
      //Fim do método Super da superclasse ou classe mãe Estado;
   }
    
}//Fim da classe Cidade;