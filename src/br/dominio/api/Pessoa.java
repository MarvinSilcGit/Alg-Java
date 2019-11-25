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
    
   public Pessoa(String nome, Date dataNascimento, String cpf, String email, Telefone telefone, Endereco endereco)
   {     
      this.nome = nome;
        
      this.dataNascimento = dataNascimento;
        
      this.cpf = cpf;
        
      this.email = email;
        
      this.telefone = telefone;
        
      this.endereco = endereco;
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
    
   public String retornarTelefone()
   {  
      return telefone.retornarTelefoneCompleto();
   }//Fim do método que retorna o telefone do objeto do tipo Pessoa;
    
   public void alterarTelefone(int novoDdi, int novoDddCurtaDistancia, int novoDddLongaDistancia, int novoNumero)
   {  
      telefone.alterarTelefoneCompleto(novoDdi, novoDddCurtaDistancia, novoDddLongaDistancia, novoNumero);
   }//Fim do método que altera o telefone do objeto do tipo Pessoa;
    
   public String retornarEndereco()
   {    
      return endereco.retornarEnderecoCompleto();
   }//Fim do método que retorna o objeto do tipo Endereco;
   
   public void alterarEndereco(String numero, String bairro, String cep, String rua, Cidade cidade, Pais pais)
   {
      endereco.alterarEndereco(numero, bairro, cep, rua, cidade);
   }//Fim do método que altera o endereco do objeto do tipo Pessoa;
   
}//Fim da classe Pessoa; 