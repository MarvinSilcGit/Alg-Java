package br.dominio.republicafederativa.cidade;


import java.util.ArrayList;

import br.dominio.republicafederativa.estado.Estado;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Cidade extends Estado
{     
   private ArrayList listaSecretarias = new ArrayList();
   
   private ArrayList listaPessoas = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public Cidade() 
   {
        
   }//Fim do método construtor padrão;
    
   public Cidade(String nome, String moeda, double tesouro, double pib, double idh)
   {     
      super(nome, moeda, tesouro, pib, idh); 
      
      //Fim do método Super da superclasse ou classe mãe Estado;
      
   }//Fim do método construtor personalizado;
     
   public ArrayList retornarListaPessoas()
   { 
      return this.listaPessoas;
   }
    
   public void inserirPessoas(String inserir)
   { 
      this.listaPessoas.add(inserir);
   }
    
}//Fim da classe Cidade;