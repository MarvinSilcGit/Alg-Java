/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.crm;

/**
 *
 * @author belogo
 */

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

public interface IRecebeDadosProfissionalMedicina
{
  
   String retornarEmail();
   
   Endereco retornarEndereco();
   
   Telefone retornarTelefone();
   
}//Fim da interface IRecebeDadosProfissionalMedicina;