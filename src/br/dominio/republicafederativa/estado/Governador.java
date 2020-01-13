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

import br.dominio.api.Acesso;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Governador extends Funcionario
{
   private Date dataPosse;
   
   //Fim do campo de declaração de atributos;
   
   
   public Governador()
   {
      
   }//Fim do método construtor padrão;
   
   public Governador (String nome, Date nascimento, String cpf, String email, Endereco endereco, double salario, String setor, Acesso conta, Date dataPosse)
   {
      super (nome, nascimento, cpf, email, endereco, salario, setor, conta);
      
      //Fim do método super da classe mãe ou super classe Funcionario, inicializando o seu terceiro método contrutor personalizado;
      
      this.dataPosse = dataPosse;
   }//Fim do método construtor personalizado;
   
}//Fim da classe Governador;