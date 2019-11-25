/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.republicafederativa;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import java.util.Date;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class VicePresidente extends Presidente
{
   private ArrayList gabinete = new ArrayList(20);
   
   //Fim do campo de declaração de atributos;
   
   
   public VicePresidente()
   {
      
   }//Fim do método construtor padrão;
   
   public VicePresidente(String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, double salario, String setor, Acesso conta, Date dataPosse, Date dataDesposse)
   {
      super(nome, nascimento, cpf, email, telefone, endereco, salario, setor, conta, dataPosse, dataDesposse);
      
      //Fim do método super da classe mãe ou super classe Presidente, inicializando seu construtor personalizado;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classeVicePresidente;