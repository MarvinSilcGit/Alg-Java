/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.republicafederativa.republica;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import java.util.Date;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class VicePresidente extends Funcionario
{
   private ArrayList gabinete = new ArrayList(20);
   
   //Fim do campo de declaração de atributos;
   
   
   public VicePresidente()
   {
      
   }//Fim do método construtor padrão;
   
   public VicePresidente(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco)
   {
      
   }
   
}//Fim da classeVicePresidente;