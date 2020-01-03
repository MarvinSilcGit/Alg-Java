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

import java.util.ArrayList;

import br.dominio.reguladorcertificados.iso.ICadastraCertificadores;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class AutenticaCertificacao implements ICadastraCertificadores
{
   private Udemy dadosUdemy;
   
   //Fim do campo de declaração de atributos;
   
   
   @Override
   public String retornarNomeFantasia()
   {
      return dadosUdemy.retornarNomeFantasia();
   }//Fim do método que retorna o nome fantasia do objeto do tipo Udemy para a interface ICadastraCertificadores;
   
   @Override
   public ArrayList retornarListaCursos()
   {
      return dadosUdemy.retornarListaCursos();
   }//Fim do método que retorna a lista de objetos do tipo Curso do objeto do tipo Udemy para a interface ICadastraCertificadores;
   
   @Override
   public Endereco retornarEndereco()
   {
      return dadosUdemy.acessarEndereco();
   }//Fim do método que retorna o objeto do tipo Endereco do objeto do tipo Udemy para a interface ICadastraCertificadores;
   
   @Override
   public Telefone retornarTelefone()
   {
      return dadosUdemy.acessarTelefone();
   }//Fim do método que retorna o objeto do tipo Telefone do objeto do tipo Udemy para a interface ICadastraCertificadores;
   
}//Fim da classe AutenticarCertificacao;