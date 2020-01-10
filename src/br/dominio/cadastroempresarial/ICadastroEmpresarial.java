/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.cadastroempresarial;

/**
 *
 * @author belogo
 */

import br.dominio.api.Endereco;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

public interface ICadastroEmpresarial
{    
   Endereco retornarEndereco();
   
   String retornarRazaoSocial();
   
   String retornarNomeFantasia();
   
   double retornarCapitalSocial();
   
   Funcionario retornarPresidente();
   
   Funcionario retornarVicePresidente();

}//Fim da interface ICadastroEmpresarial;