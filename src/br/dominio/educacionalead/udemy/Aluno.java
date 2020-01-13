/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.educacionalead.udemy;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.dominio.api.Pessoa;

//Fim dos imports de biblioteca de classes ou APIs (Application's Programming Interfaces) Java;


public final class Aluno extends Pessoa
{
   private String login,
           senha;
   
   //Fim do campo de declaração de atributos;
   
   
   public Aluno()
   {
      
   }//Fim do método construtor padrão;
   
   public Aluno (String nome, String cpf, String email, Date nascimento, String login, String senha)
   {
      super(nome, nascimento, cpf, email);
      
      this.login = login;
      
      this.senha = senha;
   }//Fim do método construtor personalizado;

   public final String retornarLogin()
   {
      return login;
   }//Fim do método que retorna o login do objeto do tipo Aluno;
   
}//Fim da classe CadastroEstudante;