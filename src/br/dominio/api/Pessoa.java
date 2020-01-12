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
           email;
    
   private Date dataNascimento;
    
   private Telefone telefone;
       
   private Endereco endereco;
   
  
   //Fim do campo de declaração de atributos;
    
   public enum sexo
   {
      MASCULINO,
      FEMININO;
   }
   
   public enum CondicaoCivil
   {
      SOLTEIRO,
      CASADO,
      DIVORCIADO,
      VIUVO,
      UNIAOESTAVEL;
   }
    
   public Pessoa()
   { 
        
   }//Fim do método construtor padrão;
    
   public Pessoa (String nome, Date dataNascimento, String cpf, String email, Telefone telefone, Endereco endereco)
   {     
      this.nome = nome;
        
      this.dataNascimento = dataNascimento;
        
      this.cpf = cpf;
        
      this.email = email;
        
      this.telefone = telefone;
        
      this.endereco = endereco;
   }//Fim do método construtor personalizado;
    
   public final String retornarNome()
   {      
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Pessoa;
    
   public final Date retornarDataNascimento()
   { 
      return dataNascimento;
   }//Fim do método que retorna o nascimento do objeto do tipo Pessoa;
    
   public final String retornarCpf()
   { 
      return cpf;
   }//Fim do método que retorna o cpf do objeto do tipo Pessoa
    
   public final String retornarEmail()
   { 
      return email;
   }//Fim do método que retorna o email do objeto do tipo Pessoa;
    
   public final void alterarEmail (String novoEmail)
   { 
      email = novoEmail;
   }//Fim do método que altera o email do objeto do tipo Pessoa;
    
   public final String retornarTelefone()
   {  
      return telefone.retornarTelefoneCompleto();
   }//Fim do método que retorna o telefone do objeto do tipo Pessoa;
 
   public final String retornarEndereco()
   {    
      return endereco.retornarEnderecoCompleto();
   }//Fim do método que retorna o objeto do tipo Endereco;
   
}//Fim da classe Pessoa; 