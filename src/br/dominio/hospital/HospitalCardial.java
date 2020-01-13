/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.hospital;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.dominio.empresa.Empresa;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class HospitalCardial extends Empresa
{
   private ArrayList listaLeitosUIT = new ArrayList();
   
   private ArrayList listaMedicos = new ArrayList();
  
   private ArrayList listaProfissionaisEnfermagem = new ArrayList();
   
   private Funcionario diretor;
   
   //Fim do campo de declaração de atributos;
   
   
   public HospitalCardial()
   {
      
   }//Fim do método construtor padrão;
   
   public HospitalCardial(String razaoSocial, String nomeFantasia, Endereco endereco, Funcionario presidente, Funcionario vicePresidente, double capitalSocial, Funcionario diretor)
   {
      super(razaoSocial, nomeFantasia, endereco, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa, inicializando seu segundo método construtor personalizado;
      
      this.diretor = diretor;
   }//Fim do método construtor personalizado;
   
}//Fim da classe HospitalCardial;