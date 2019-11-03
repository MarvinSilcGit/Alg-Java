package br.dominio.republicafederativa.cidade;


import java.util.ArrayList;

import br.dominio.republicafederativa.estado.Estado;

import br.dominio.republicafederativa.republica.Moeda;

import br.dominio.api.Pessoa;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Cidade extends Estado
{     
   private ArrayList <Funcionario> listaSecretarias = new ArrayList();
   
   private ArrayList <Pessoa> listaCidadaos = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public Cidade() 
   {
        
   }//Fim do método construtor padrão;
    
   public Cidade(String nome, Moeda moeda, double tesouro, double pib, double idh)
   {     
      super(nome, moeda, tesouro, pib, idh); 
      
      //Fim do método Super da superclasse ou classe mãe Estado;
      
   }//Fim do método construtor personalizado;
     
   public ArrayList retornarListaCidadaos()
   { 
      return this.listaCidadaos;
   }//Fim do método que retorna a lista do objeto do tipo Cidade;
    
   public void inserirCidadao(Cidadao inserir)
   { 
      this.listaCidadaos.add(inserir);
   }//Fim do métdo que insere o objeto do tipo Cidadao na lista do objeto do tipo Cidade;
    
   public void removerCidadao(Cidadao remover)
   {
      this.listaCidadaos.remove(remover);
   }//Fim do método que remove o objetod do tipo Cidadao da lista do objeto do tipo Cidade;
   
}//Fim da classe Cidade;