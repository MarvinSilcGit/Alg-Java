package br.dominio.republicafederativa.cidade;


import java.util.ArrayList;

import br.dominio.republicafederativa.estado.Estado;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Cidade extends Estado
{     
   private ArrayList listaSecretarias = new ArrayList();
   
   private ArrayList listaCidadaos = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public Cidade() 
   {
        
   }//Fim do método construtor padrão;
    
   public Cidade(String nome, String moeda, double tesouro, double pib, double idh)
   {     
      super(nome, moeda, tesouro, pib, idh); 
      
      //Fim do método Super da superclasse ou classe mãe Estado;
      
   }//Fim do método construtor personalizado;
     
   public ArrayList retornarListaCidadaos()
   { 
      return this.listaCidadaos;
   }
    
   public void inserirPessoas(String inserir)
   { 
      this.listaCidadaos.add(inserir);
   }
    
}//Fim da classe Cidade;