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


public final class Estudante
{
   private String cpf,
           nome,
           login,
           senha,
           email;
   
   private Date nascimento;
   
   //Fim do campo de declaração de atributos;
   
   
   public Estudante()
   {
      
   }//Fim do método construtor padrão;
   
   public Estudante(String cpf, String nome, String login, String senha, String email)
   {
      this.cpf = cpf;
      
      this.nome = nome;
      
      this.login = login;
      
      this.senha = senha;
      
      this.nascimento = nascimento;
      
      this.email = email;
   }//Fim do método construtor personalizado;
   
   public String retornarNome()
   {
      return nome;
   }
   
   public String retornarCpf()
   {
      return cpf;
   }

   public String retornarLogin()
   {
      return login;
   }
     
   public String retornarSenha()
   {
      return senha;
   }
   
   public String retornarEmail()
   {
      return email;
   }
   
   public String retornarDados()
   {
      return "Nome: " + nome + "; Cpf: " + cpf + "; Login: " + login + "; Senha: " + senha + "; Email: " + email;
   }
   
   public Date retornarDataNascimento()
   {
      return nascimento;
   }
   
}//Fim da classe CadastroEstudante;