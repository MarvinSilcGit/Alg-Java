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

import br.dominio.api.Endereco;

import br.dominio.reguladorcertificados.iso.ICadastraCertificador;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class AutenticaCertificacao implements ICadastraCertificador
{
   private Udemy udemy;
   
   //Fim do campo de declaração de atributos;
   
   
   @Override
   public final String retornarNomeFantasia()
   {
      return udemy.retornarNomeFantasia();
   }//Fim do método que retorna o nome fantasia do objeto do tipo Udemy para a interface ICadastraCertificadores;
   
   @Override
   public final ArrayList retornarListaCursos()
   {
      return udemy.retornarListaCursos();
   }//Fim do método que retorna a lista de objetos do tipo Curso do objeto do tipo Udemy para a interface ICadastraCertificadores;
   
   @Override
   public final Endereco retornarEndereco()
   {
      return udemy.retornarEndereco();
   }//Fim do método que retorna o objeto do tipo Endereco do objeto do tipo Udemy para a interface ICadastraCertificadores;
   
   @Override
   public final long retornarCnpj()
   {
      return udemy.retornarCnpj();
   }//Fim do método que retorna o cnpj do objeto do tipo Udemy para a interface ICadastraCertificadores;
   
   @Override
   public final long retornarTelefone()
   {
      return udemy.retornarTelefone();
   }//Fim do métod que retorna o telefoen do objeto do tipo Udemy para a interface ICadastraCertificadores;
   
}//Fim da classe AutenticarCertificacao;