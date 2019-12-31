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

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public interface ICadastraEmissorCertificado 
{
   
   String retornarCnpj();
   
   Endereco retornarEndereco();
   
   ArrayList retornarListaCursos();
   
   //órgaos que possui todos os cnpjs, telefone e endereco;
   
}//Fim da interface ICadastraEmissorCertificado;