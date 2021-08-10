/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.hospital.farmacia;

/**
 *
 * @author belogo
 */

import br.com.dominio.empresa.Empresa;

import br.com.dominio.api.Endereco;

import br.com.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Farmacia extends Empresa 
{
   
   public Farmacia()
   {
      
   }//Fim do método construtor padrão;
   
   public Farmacia (String razaoSocial, String nomeFantasia, double capitalSocial, Endereco endereco, Telefone telefone)
   {
      super (razaoSocial, nomeFantasia, capitalSocial, endereco, telefone);
      
      //Fim do método super da classe mãe ou super classe Empresa, inicializando o seu método construtor personalizado;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe Farmacia;