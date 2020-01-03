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

import br.dominio.reguladorcertificados.iso.ICadastraEmissorCertificado;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class AutenticarCertificacao implements ICadastraEmissorCertificado
{
   private Udemy dadosUdemy;
   
   //Fim do campo de declaração de atributos;
   
   
   @Override
   public String retornarNomeFantasia()
   {
      return dadosUdemy.retornarNomeFantasia();
   }
   
   @Override
   public ArrayList retornarListaCursos()
   {
      return dadosUdemy.retornarListaCursos();
   }
   
   @Override
   public Endereco retornarEndereco()
   {
      return dadosUdemy.acessarEndereco();
   }
   
   @Override
   public Telefone retornarTelefone()
   {
      return dadosUdemy.acessarTelefone();
   }

}//Fim da classe AutenticarCertificacao;