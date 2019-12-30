/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.reguladorcertificados.ecma;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.api.Funcionario;

import br.dominio.api.Empresa;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

        
public class ECMA extends Empresa
{
   
   public ECMA()
   {
      
   }//Fim do método construtor padrão;
   
   public ECMA(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)
   {
      super(cnpj, razaoSocial, nomeFantasia, endereco, telefone, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe ECMA;