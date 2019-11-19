/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.editora;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.dominio.api.Pessoa;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Autor extends Pessoa
{
   private String cnpj;
   
   //Fim do campo de declaração de atributos;
   
   
   public Autor()
   {
      
   }//Fim do método construtor padrão; 
   
   public Autor(String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, String condicaoCivil, String cnpj)
   {
      super(nome, nascimento, cpf, email, telefone, endereco, condicaoCivil);
      
      this.cnpj = cnpj;
      
      //Fim do método super da classe mãe ou super classe Autor;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe Autor;