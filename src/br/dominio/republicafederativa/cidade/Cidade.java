package br.dominio.republicafederativa.cidade;


import java.util.ArrayList;

import br.dominio.republicafederativa.estado.Estado;

import br.dominio.republicafederativa.Moeda;

import br.dominio.api.Pessoa;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Cidade extends Estado
{     
   private ArrayList <Funcionario> listaSecretarias = new ArrayList();
   
   private ArrayList <Pessoa> listaCidadaos = new ArrayList();
   
   private Prefeito prefeito;
   
   private VicePrefeito vicePrefeito;
   
   //Fim do campo de declaração de atributos;
   
   
   public Cidade() 
   {
        
   }//Fim do método construtor padrão;
    
   public Cidade(String nome, Moeda moeda, double tesouro, double pib, double idh, Prefeito prefeito, VicePrefeito vicePrefeito)
   {     
      super(nome, moeda, tesouro, pib, idh); 
      
      //Fim do método Super da superclasse ou classe mãe Estado;
      
      this.prefeito = prefeito;
      
      this.vicePrefeito = vicePrefeito;
   }//Fim do método construtor personalizado;
     
   public ArrayList retornarListaSecretarias()
   {
      return listaSecretarias;
   }//Fim do método que retorna a lista de secretarias do objeto do tipo Cidade;
   
   public ArrayList retornarListaCidadaos()
   { 
      return listaCidadaos;
   }//Fim do método que retorna a lista do objeto do tipo Cidade;
    
   public void inserirCidadao(Cidadao inserir)
   { 
      listaCidadaos.add(inserir);
   }//Fim do métdo que insere o objeto do tipo Cidadao na lista do objeto do tipo Cidade;
    
   public void removerCidadao(Cidadao remover)
   {
      listaCidadaos.remove(remover);
   }//Fim do método que remove o objeto do tipo Cidadao da lista do objeto do tipo Cidade;
   
   public Prefeito retornarPrefeito()
   {
      return prefeito;
   }//Fim do método que retorna o objeto do tipo Prefeito do objeto objeto do Cidade;
   
   public VicePrefeito retornarVicePrefeito()
   {
      return vicePrefeito;
   }//Fim do método que retorna o objeto do tipo VicePrefeito do objeto do tipo Cidade;
   
}//Fim da classe Cidade;