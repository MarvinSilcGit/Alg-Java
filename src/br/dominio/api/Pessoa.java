/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.api;

/**
 *
 * @author belogo
 */

import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Pessoa
{    
   private String nome,
           cpf,
           email,
           condicaoCivil;
    
   private Date nascimento;
    
   private Telefone telefone;
    
   private char sexo;
    
   private Endereco endereco;

   //Fim do campo de declaração de atributos;
    
    
   public Pessoa()
   { 
        
   }//Fim do método construtor padrão;
    
   public Pessoa(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil)
   {     
      this.nome=nome;
        
      this.nascimento=nascimento;
        
      this.cpf=cpf;
        
      this.email=email;
        
      this.telefone=telefone;
        
      this.sexo=sexo;
        
      this.endereco=endereco;
      
      this.condicaoCivil=condicaoCivil;
   }//Fim do método construtor personalizado;
    
   public String retornarNome()
   {      
      return this.nome;
   }//Fim do método que retorna o nome do objeto do tipo Pessoa;
    
   public Date retornarNascimento()
   { 
      return this.nascimento;
   }//Fim do método que retorna o nascimento do objeto do tipo Pessoa;
    
   public String retornarCpf()
   { 
      return this.cpf;
   }//Fim do método que retorna o cpf do objeto do tipo Pessoa
    
   public String retornarEmail()
   { 
      return this.email;
   }//Fim do método que retorna o email do objeto do tipo Pessoa;
    
   public void alterarEmail(String alterarEmail)
   { 
      this.email=alterarEmail;
   }//Fim do método que altera o email do objeto do tipo Pessoa;
    
   public Telefone acessarTelefone()
   {  
      return this.telefone;
   }//Fim do método que retorna o telefone do objeto do tipo Pessoa;
    
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
   
   public String retornarCondicaoCivil()
   {
      return this.condicaoCivil;
   }//Fim do método que retorna a condição civil do objeto do tipo Pessoa;
   
   public void alterarCondicaoCivil(String condicaoCivil)
   {
      this.condicaoCivil=condicaoCivil;
   }//Fim do método que altera a condição civil do objeto do tipo Pessoa;
   
}//Fim da classe Pessoa; 