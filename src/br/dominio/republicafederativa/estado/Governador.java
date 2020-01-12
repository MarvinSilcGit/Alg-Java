/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.republicafederativa.estado;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.republicafederativa.Presidente;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Governador extends Presidente
{
   
   public Governador()
   {
      
   }//Fim do método construtor padrão;
   
   public Governador (String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, double salario, String setor, Acesso conta, Date dataPosse, Date dataDesposse)
   {
      super (nome, nascimento, cpf, email, telefone, endereco, salario, setor, conta, dataPosse, dataDesposse);
      
      //Fim do método super da classe mãe ou super classe Presidente, inicializando seu contrutor personalizado;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe Governador;