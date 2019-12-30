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
           senha;
   
   private Date nascimento;
   
   //Fim do campo de declaração de atributos;
   
   public CadastroEstudantes()
   {
      
   }//Fim do método construtor padrão;
   
   public CadastroEstudantes(String cpf, String nome, String login, String senha, Date nascimento)
   {
      this.cpf = cpf;
      
      this.nome = nome;
      
      this.login = login;
      
      this.senha = senha;
      
      this.nascimento = nascimento;
   }//Fim do método construtor personalizado;
   
}//Fim da classe CadastroEstudante;