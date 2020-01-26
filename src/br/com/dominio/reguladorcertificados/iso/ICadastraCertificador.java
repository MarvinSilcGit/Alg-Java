/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.reguladorcertificados.iso;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.com.dominio.api.Endereco;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public interface ICadastraCertificador
{
   String retornarNomeFantasia();
   
   ArrayList retornarListaCursos();
   
   Endereco retornarEndereco();
   
   long retornarCnpj();
   
   String retornarTelefone();
   
}//Fim da interface ICdastrasEmissor;