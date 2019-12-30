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

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class CadastroEstudantes
{
   private String cpf,
           nome,
           login,
           senha,
           email;
   
   private Date nascimento;
   
   //Fim do campo de declaração de atributos;
   
   public CadastroEstudantes()
   {
      
   }//Fim do método construtor padrão;
   
   public CadastroEstudantes(String cpf, String nome, String login, String senha, String email, Date nascimento)
   {
      this.cpf = cpf;
      
      this.nome = nome;
      
      this.login = login;
      
      this.senha = senha;
      
      this.nascimento = nascimento;
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
   
   public Date retornarDataNascimento()
   {
      return nascimento;
   }
   
}//Fim da classe CadastroEstudante;