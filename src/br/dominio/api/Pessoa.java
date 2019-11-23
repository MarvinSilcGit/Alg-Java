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

import br.dominio.republicafederativa.cidade.Cidade;

import br.dominio.republicafederativa.Pais;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Pessoa
{    
   private String nome,
           cpf,   
           email,
           condicaoCivil;
    
   private Date dataNascimento;
    
   private Telefone telefone;
       
   private Endereco endereco;
   
   

   //Fim do campo de declaração de atributos;
    
   public enum sexo
   {
      Masculino,
      Feminino;
   }
    
   public Pessoa()
   { 
        
   }//Fim do método construtor padrão;
    
   public Pessoa(String nome, Date dataNascimento, String cpf, String email, Telefone telefone, Endereco endereco, String condicaoCivil)
   {     
      this.nome = nome;
        
      this.dataNascimento = dataNascimento;
        
      this.cpf = cpf;
        
      this.email = email;
        
      this.telefone = telefone;
        
      this.endereco = endereco;
      
      this.condicaoCivil = condicaoCivil;
   }//Fim do método construtor personalizado;
    
   public String retornarNome()
   {      
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Pessoa;
    
   public Date retornarDataNascimento()
   { 
      return dataNascimento;
   }//Fim do método que retorna o nascimento do objeto do tipo Pessoa;
    
   public String retornarCpf()
   { 
      return cpf;
   }//Fim do método que retorna o cpf do objeto do tipo Pessoa
    
   public String retornarEmail()
   { 
      return email;
   }//Fim do método que retorna o email do objeto do tipo Pessoa;
    
   public void alterarEmail(String novoEmail)
   { 
      email = novoEmail;
   }//Fim do método que altera o email do objeto do tipo Pessoa;
    
   public Telefone acessarTelefone()
   {  
      return telefone;
   }//Fim do método que retorna o telefone do objeto do tipo Pessoa;
    
   public void alterarTelefone(Telefone novoTelefone)
   {  
      telefone = novoTelefone;
   }//Fim do método que altera o telefone do objeto do tipo Pessoa;
    
   public Endereco retornarEndereco()
   {    
      return endereco;
   }//Fim do método que acessa o objeto do tipo Endereco;
   
   public void alterarEndereco(String numero, String bairro, String cep, String rua, Cidade cidade, Pais pais)
   {
      endereco.alterarEndereco(numero, bairro, cep, rua, cidade, pais);
   }//Fim do método que altera o endereco do objeto do tipo Pessoa;
   
   public String retornarCondicaoCivil()
   {
      return condicaoCivil;
   }//Fim do método que retorna a condição civil do objeto do tipo Pessoa;
   
   public void alterarCondicaoCivil(String novaCondicaoCivil)
   {
      condicaoCivil = novaCondicaoCivil;
   }//Fim do método que altera a condição civil do objeto do tipo Pessoa;
   
}//Fim da classe Pessoa; 