/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.reguladorcertificantes;

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


public class ReguladorCertificantes extends Empresa
{
   private ArrayList listaCertificadoresRegulados = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public ReguladorCertificantes()
   {
      
   }//Fim do método construtor padrão;
   
   public ReguladorCertificantes(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)
   {
      super();
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtor personalizado;
   
}//Fim da clasee ReguladorCertificantes;