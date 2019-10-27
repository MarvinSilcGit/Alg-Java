/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.classesabstratas;

/**
 *
 * @author belogo
 */

import br.dominio.republicafederativa.Cidade;

import br.dominio.republicafederativa.Estado;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;
        

public class Endereco 
{
   private String numero, bairro, cep, complemento, rua;
   
   private Cidade cidade;
   
   private Estado estado;
   
   //Fim do campo de declaração de atributos;
    
    
   public Endereco()
   {     
    
   }//Fim do método construtor padrão;
    
   public Endereco(String numero, String bairro, String cep, String complemento, String rua, Cidade cidade, Estado estado)
   {    
      this.numero=numero;
       
      this.bairro=bairro;
        
      this.cep=cep;
        
      this.complemento=complemento;
        
      this.rua=rua;
        
      this.cidade=cidade;
        
      this.estado=estado;
   }//Fim do método construtor personalizado;
    
   public String retornarEnderecoCompleto()
   {
      return "Rua " + this.rua + ", Número " + this.numero +", Bairro " + this.bairro + ", Complemento " + this.complemento + ", CEP " +this.cep + ", Cidade " +this.cidade + ", Estado" + this.estado;
   }//Fim do método que retorna a rua, número, bairro, complemento, cep, cidade e estado do objeto do tipo Endereco;
    
   public void alterarEndereco(String novoNumero, String novoBairro, String novoCEP, String novoComplemento, String novaRua, Cidade novaCidade, Estado novoEstado)
   {    
      this.numero=novoNumero;
        
      this.bairro=novoBairro;
        
      this.cep=novoCEP;
        
      this.complemento=novoComplemento;
        
      this.rua=novaRua;
        
      this.cidade=novaCidade;
        
      this.estado=novoEstado;
   }//Fim do método que altera a rua, número, bairro, complemento, cep, cidade e bairro do objeto do tipo Endereco;
    
   public String retornarNumero()
   {
      return this.numero;
   }//Fim do método que retorna o número do objeto do tipo Endereco;
    
   public String retornarBairro()
   { 
      return this.bairro;
   }//Fim do método que retorna o bairro do objeto do tipo Endereco;
    
   public String retornarCep()
   { 
      return this.cep;
   }//Fim do método que retorna o cep do objeto do tipo Endereco;
    
   public String retornarComplemento()
   { 
      return this.complemento;
   }//Fim do método que retorna o complemento do objeto do tipo Endereco;
    
   public String retornarRua()
   { 
      return this.rua;
   }//Fim do método que retorna a rua do objeto do tipo Endereco;
    
   public Cidade retornarCidade()
   { 
      return this.cidade;
   }//Fim do método que retorna a cidade do objeto do tipo Endereco;
    
   public Estado retornarEstado()
   { 
      return this.estado;
   }//Fim do método que retorna o estado do objeto do tipo Endereco;
   
}//Fim da classe Endereco