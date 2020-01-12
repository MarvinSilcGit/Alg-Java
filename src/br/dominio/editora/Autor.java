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


public final class Autor extends Pessoa
{
   private String cnpj;
   
   //Fim do campo de declaração de atributos;
   
   
   public Autor()
   {
      
   }//Fim do método construtor padrão; 
   
   public Autor (String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, String cnpj)
   {
      super (nome, nascimento, cpf, email, telefone, endereco);
   
      //Fim do método super da classe mãe ou super classe Pessoa;
      
      this.cnpj = cnpj;      
   }//Fim do método construtor personalizado;
   
   public final String retornarCnpj()
   {
      return cnpj;
   }//Fim do método que retorna o cnpj do objeto do tipo Autor;
   
}//Fim da classe Autor;