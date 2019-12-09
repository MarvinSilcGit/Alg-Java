/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.republicafederativa.cidade;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.dominio.republicafederativa.estado.Governador;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.api.Acesso;


//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Prefeito extends Governador
{
   
   public Prefeito(String nome, Date dataNascimento, String cpf, String email, Telefone telefone, Endereco endereco, double salario, String setor, Acesso conta, Date dataPosse, Date dataDesposse)
   {
      super(nome, dataNascimento, cpf, email, telefone, endereco, salario, setor, conta, dataPosse, dataDesposse);
      
      //Fim do método super da classe mãe ou super classe Governador, inicializando o método construtor personalizado;
      
   }//Fim do método construtor padrão;
   
}//Fim da classe Prefeito;