/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.educacionalead.udemy;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.com.dominio.api.Cidadao;

//Fim dos imports de biblioteca de classes ou APIs (Application's Programming Interfaces) Java;

public final class Aluno extends Cidadao
{
   private String login,
           senha;
   
   //Fim do campo de declaração de atributos;
   
   
   public Aluno()
   {
      
   }//Fim do método construtor padrão;
   
   public Aluno (String nome, String cpf, String email, Date nascimento, String login, String senha)
   {
      super();
      
      //Fim do método super da classe mãe ou super classe Pessoa, inicializando o seu segundo método construtor personalizado;
      
      this.login = login;
      
      this.senha = senha;
   }//Fim do método construtor personalizado;

   public final String retornarLogin()
   {
      return login;
   }//Fim do método que retorna o login do objeto do tipo Aluno;
   
}//Fim da classe CadastroEstudante;