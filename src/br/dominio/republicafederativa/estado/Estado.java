package br.dominio.republicafederativa.estado;


import java.util.ArrayList;

import br.dominio.republicafederativa.Pais;

import br.dominio.republicafederativa.Moeda;

import br.dominio.api.Funcionario;

import br.dominio.republicafederativa.cidade.Cidade;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Estado extends Pais
{    
   private ArrayList <Cidade> listaCidades = new ArrayList();
   
   private ArrayList <Funcionario> listaSecretarias = new ArrayList();
   
   private Governador governador;
   
   private ViceGovernador viceGovernador;
   
   //Fim do campo de declaração de atributos;
   
   
   public Estado()
   {     
   
   }//Fim do método construtor padrão;
    
   public Estado(String nome, Moeda moeda, double tesouro, double pib, double idh, Governador governador, ViceGovernador viceGovernador)
   {     
      super(nome, moeda, tesouro, pib, idh);
      
      //Fim do método construtor Super da classe mãe ou superclasse Pais;
      
      this.governador = governador;
      
      this.viceGovernador = viceGovernador;
      
   }//Fim do método construtor personalizado;
   
   public Estado(String nome, Moeda moeda, double tesouro, double pib, double idh)
   {     
      super(nome, moeda, tesouro, pib, idh);
      
      //Fim do método construtor Super da classe mãe ou superclasse Pais;
      
   }//Fim do método construtor personalizado;
   
   public ArrayList retornarCidades()
   {
      return listaCidades;
   }//FIm do método que retorna lista de Cidades do objeto do tipo Estado;
   
   public void inserirCidadeLista(Cidade novaCidade)
   {
      listaCidades.add(novaCidade);
   }//Fim do método que insere objeto do tipo Cidade na lista do objeto do tipo Estado;
   
   public void removerCidadeLista(Cidade cidade)
   {
      listaCidades.remove(cidade);
   }//Fim do método que remove objeto do tipo Cidade da lista do objeto do tipo Estado;
   
}//Fim da classe Estado;