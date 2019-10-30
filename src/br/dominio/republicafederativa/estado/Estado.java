package br.dominio.republicafederativa.estado;


import java.util.ArrayList;

import br.dominio.republicafederativa.republica.Pais;

import br.dominio.republicafederativa.republica.Moeda;

import br.dominio.api.Funcionario;

import br.dominio.republicafederativa.cidade.Cidade;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;
//Fazer uma classe abstrata para comportar todos os governos;

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
      
      this.governador=governador;
      
      this.viceGovernador=viceGovernador;
      
   }//Fim do método construtor personalizado;
   
   public Estado(String nome, Moeda moeda, double tesouro, double pib, double idh)
   {     
      super(nome, moeda, tesouro, pib, idh);
      
      //Fim do método construtor Super da classe mãe ou superclasse Pais;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe Estado;