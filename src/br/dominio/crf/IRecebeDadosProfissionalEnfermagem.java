/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.crf;

/**
 *
 * @author belogo
 */

import br.dominio.cadastropessoafisica.Identidade;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public interface IRecebeDadosProfissionalEnfermagem
{
   String retornarEmail();
   
   Identidade retornarRG();
   
   Endereco retornarEndereco();
   
   Telefone retornarTelefone();
   
}//Fim da interface IRecebeDadosProfissionalEnfermagem;