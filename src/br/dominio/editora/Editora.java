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

import br.dominio.api.Empresa;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Editora extends Empresa
{
   private ArrayList listaTradutores,
           listaRevisoresTecnicos,
           listaAutores = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public Editora()
   {
      
   }//Fim do método construtor padrão;
   
   public Editora(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente)
   {
      super(cnpj, razaoSocial, nomeFantasia, endereco, telefone, presidente, vicePresidente);
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe Editora;