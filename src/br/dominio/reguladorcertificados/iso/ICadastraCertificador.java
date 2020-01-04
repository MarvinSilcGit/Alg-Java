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

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public interface ICadastraCertificador
{
   String retornarNomeFantasia();
   
   ArrayList retornarListaCursos();
   
   Endereco retornarEndereco();
   
   Telefone retornarTelefone();
   
   String retornarCnpj();
   
}//Fim da interface ICdastrasEmissor;