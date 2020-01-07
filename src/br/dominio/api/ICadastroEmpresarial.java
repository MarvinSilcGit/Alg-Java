/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.api;

/**
 *
 * @author belogo
 */


//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

public interface ICadastroEmpresarial
{    
   Endereco retornarEndereco();
   
   Telefone retornarTelefone();
   
   String retornarRazaoSocial();
   
   String retornarNomeFantasia();
   
   double retornarCapitalSocial();
   
   Funcionario retornarPresidente();
   
   Funcionario retornarVicePresidente();

}//Fim da interface ICadastroEmpresarial;