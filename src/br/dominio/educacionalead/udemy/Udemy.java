/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.educacionalead.udemy;

/**
 *
 * @author belogo
 */

//import br.dominio.universidade.IValidaCertificados;

import br.dominio.api.Empresa;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Udemy extends Empresa // implements ICadastraEmissor IValidaCertificados
{
   
   public Udemy()
   {
      
   }//Fim do método construtor padrão;
   
   public Udemy(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)
   {
      super(cnpj, razaoSocial, nomeFantasia, endereco, telefone, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtor personalizado
   
}//Fim da classe Udemy;