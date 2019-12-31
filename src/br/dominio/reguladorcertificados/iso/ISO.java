/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.reguladorcertificados.iso;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.dominio.api.Empresa;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class ISO extends Empresa
{//colocar a lista de qualificados para a emissão de certificados;
   
   private ArrayList listaEmisorresCertificados = new ArrayList();
   
   private ArrayList listaEmissoresCertificadosQualificados = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public ISO()
   {
      
   }//Fim do método construtor padrão;
   
   public ISO(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)    
   {
      super(cnpj, razaoSocial, nomeFantasia, endereco, telefone, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe ISO;