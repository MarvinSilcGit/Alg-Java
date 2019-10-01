/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade;

/**
 *
 * @author belogo
 */

import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Pessoa
{    
   private String nome, cpf, email;
    
   private Date nascimento;
    
   private Telefone telefone;
    
   private char sexo;
    
   private Endereco endereco;

   //Fim do campo de declaração de atributos;
    
    
   public Pessoa()
   { 
        
   }
    
   public Pessoa(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco)
   {     
      this.nome=nome;
        
      this.nascimento=nascimento;
        
      this.cpf=cpf;
        
      this.email=email;
        
      this.telefone=telefone;
        
      this.sexo=sexo;
        
      this.endereco=endereco;
   }
    
   public String retornarNome()
   {      
      return this.nome;
   }
    
   public Date retornarNascimento()
   { 
      return this.nascimento;
   }
    
   public String retornarCpf()
   { 
      return this.cpf;
   }
    
   public String retornarEmail()
   { 
      return this.email;
   }
    
   public void alterarEmail(String alterarEmail)
   { 
      this.email=alterarEmail;
   }
    
   public Telefone retornarTelefone()
   {  
      return this.telefone;
   }//Fim do método que retorna o te
    
   public void alterarTelefone(Telefone novoTelefone)
   {  
      this.telefone=novoTelefone;
   }//Fim do método que altera o telefone do objeto do tipo Pessoa;
    
   public char retornarSexo()
   {    
      return this.sexo;
   }//Fim do método que retorna o sexo do objeto do tipo Pessoa;
    
   public Endereco acessarEndereco()
   {    
      return this.endereco;
   }//Fim do método que acessa o objeto do tipo Endereco;
   
}//Fim da classe Pessoa; 