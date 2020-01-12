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

//Fim dos imports de biblioteca de classes ou APIs (Application's Programming Interfaces) Java;


public final class Aluno
{
   private String cpf,
           nome,
           login,
           senha,
           email;
   
   private Date nascimento;
   
   //Fim do campo de declaração de atributos;
   
   
   public Aluno()
   {
      
   }//Fim do método construtor padrão;
   
   public Aluno (String cpf, String nome, String login, String senha, String email, Date nascimento)
   {
      this.cpf = cpf;
      
      this.nome = nome;
      
      this.login = login;
      
      this.senha = senha;
      
      this.nascimento = nascimento;
      
      this.email = email;
   }//Fim do método construtor personalizado;
   
   public final String retornarNome()
   {
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Aluno;
   
   public final String retornarCpf()
   {
      return cpf;
   }//Fim do método que retorna o cpf do objeto do tipo Aluno;

   public final String retornarLogin()
   {
      return login;
   }//Fim do método que retorna o login do objeto do tipo Aluno;
     
   public final String retornarEmail()
   {
      return email;
   }//Fim do método que retorna o email do objeto do tipo Aluno;
   
   public final Date retornarDataNascimento()
   {
      return nascimento;
   }//Fim do método que retorna a data de nascimento do objeto do tipo Aluno;
   
}//Fim da classe CadastroEstudante;