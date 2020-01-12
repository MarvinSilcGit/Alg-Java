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

import br.dominio.republicafederativa.estado.ViceGovernador;

import br.dominio.api.Acesso;

import br.dominio.api.Telefone;

import br.dominio.api.Endereco;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class VicePrefeito extends ViceGovernador
{
   
   public VicePrefeito (String nome, Date dataNascimento, String cpf, String email, Telefone telefone, Endereco endereco, double salario, String setor, Acesso conta, Date dataPosse, Date dataDesposse)
   {
      super (nome, dataNascimento, cpf, email, telefone, endereco, salario, setor, conta, dataPosse, dataDesposse);
      
      //Fim do método super da classe mãe ou superclasse ViceGovernador, inicializando o método construtor personalizado;
      
   }//Fim do método construtor padrão;
   
}//Fim da classe VicePrefeito;