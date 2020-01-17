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

import br.dominio.api.Acesso;

import br.dominio.api.Endereco;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class VicePrefeito extends Funcionario
{
   private Date dataPosse;
   
   //Fim do campo de declaração de atributos;
   
   
   public VicePrefeito (String nome, Date dataNascimento, String cpf, String email, Endereco endereco, float salario, String setor, Acesso conta, Date dataPosse)
   {
      super (nome, dataNascimento, cpf, email, endereco, salario, setor, conta);
      
      //Fim do método super da classe mãe ou superclasse ViceGovernador, inicializando o seu terceiro método construtor personalizado;
      
      this.dataPosse = dataPosse;
   }//Fim do método construtor padrão;
   
   public final Date retornarDataPosse()
   {
      return dataPosse;
   }//Fim do método que retorna a dataPosse do objeto do tipo VicePrefeito;
   
   
}//Fim da classe VicePrefeito;