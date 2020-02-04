/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.crf;

/**
 *
 * @author belogo\
 */

import br.com.dominio.api.Endereco;

import br.com.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public interface IRecebeDadosProfissionalEnfermagem
{
   String retornarEmail();
   
   Endereco retornarEndereco();
   
   Telefone retornarTelefone();
   
}//Fim da interface IRecebeDadosProfissionalEnfermagem;