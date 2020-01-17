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

import br.dominio.cadastropessoafisica.RG;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public interface IRecebeDadosProfissionalEnfermagem
{
   String retornarEmail();
   
   RG retornarRG();
   
   Endereco retornarEndereco();
   
   Telefone retornarTelefone();
   
}//Fim da interface IRecebeDadosProfissionalEnfermagem;