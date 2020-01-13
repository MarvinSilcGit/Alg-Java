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
        

public class ViceGovernador extends Funcionario
{
   private Date dataṔosse;
   
   //Fim do campo de declaração de atributos;
   
   
   public ViceGovernador()
   {
      
   }//Fim do método construtor padrão;
   
   public ViceGovernador (String nome, Date dataNascimento, String cpf, String email, Endereco endereco, double salario, String setor, Acesso conta, Date dataPosse)
   {
      super (nome, dataNascimento, cpf, email, endereco, salario, setor, conta);
      
      //Fim do método super da classe mãe ou super classe VicePresidente, inicializando o seu terceiro método construtor personalizado;
      
      this.dataṔosse = dataPosse;
   }//Fim do método construtor personalizado;
   
}//Fim da classe ViceGovernador;