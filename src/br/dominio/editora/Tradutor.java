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

import java.util.ArrayList;

import java.util.Date;

import br.dominio.api.Funcionario;

import br.dominio.api.Acesso;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Tradutor extends Funcionario
{
   private ArrayList linguasConhecidas = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public Tradutor()
   {
      
   }//Fim do método construtor padrão;
   
   public Tradutor(String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, double salario, String setor, Date dataAdmissao, Acesso conta)
   {
      super(nome, nascimento, cpf, email, telefone, endereco, salario, setor, dataAdmissao, conta);
      
      //Fim do método super da classe mãe ou super classe Funcionario, inicilizando seu primeiro construtor personalizado;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe Tradutor;