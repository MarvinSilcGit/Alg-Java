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

import br.dominio.republicafederativa.cidade.Cidade;

import br.dominio.republicafederativa.Pais;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;
        

public final class Endereco 
{
   private String numero,
           bairro,
           cep,
           rua;
   
   private Cidade cidade;
   
   private Pais pais;
   
   //Fim do campo de declaração de atributos;
   
   
   public enum complemento
   {
      CASA,
      APARTAMENTO,
      CHACARA,
      KITNET,
      CasaDeCondominio,
      FLAT,
      TERRENO,
      LoteResidencial,
      Sobrado,
      Cobertura,
      EdificioResidencial,
      Consultorio,
      PredioComercial,
      SalaComercial,
      FAZENDA,
      Galpao,
      Deposito,
      Armazem,
      ImovelComercial,
      LOJA,
      LoteComercial,
      PontoComercial;
   }
    
   public enum Estado
   {
      ACRE,
      AMAPA,
      AMAZONAS,
      BAHIA,
   }
   
   public Endereco()
   {     
    
   }//Fim do método construtor padrão;
    
   public Endereco(String numero, String bairro, String cep, String complemento, String rua, Cidade cidade, Pais pais)
   {    
      this.numero = numero;
       
      this.bairro = bairro;
        
      this.cep = cep;
        
      this.rua = rua;
        
      this.cidade = cidade;
      
      this.pais = pais;
   }//Fim do método construtor personalizado;
  /*  
   public String retornarEnderecoCompleto()
   {
      return "Rua " + this.rua + ", Número " + this.numero +", Bairro " + this.bairro + ", Complemento " + this.complemento + ", CEP " +this.cep + ", Cidade " +this.cidade + ", Estado" + this.estado;
   }//Fim do método que retorna a rua, número, bairro, complemento, cep, cidade e estado do objeto do tipo Endereco;
    */
   public void alterarEndereco(String novoNumero, String novoBairro, String novoCEP, String novaRua, Cidade novaCidade, Pais novoPais)
   {    
      this.numero = novoNumero;
        
      this.bairro = novoBairro;
        
      this.cep = novoCEP;
        
      this.rua = novaRua;
        
      this.cidade = novaCidade;
      
      this.pais = novoPais;
   }//Fim do método que altera a rua, número, bairro, complemento, cep, cidade e bairro do objeto do tipo Endereco;
    
   public String retornarNumero()
   {
      return numero;
   }//Fim do método que retorna o número do objeto do tipo Endereco;
    
   public void alterarNumero(String novoNumero)
   {
      numero = novoNumero;
   }//Fim do método que altera o número do objeto do tipo Endereco;
   
   public String retornarBairro()
   { 
      return bairro;
   }//Fim do método que retorna o bairro do objeto do tipo Endereco;
    
   public String retornarCep()
   { 
      return cep;
   }//Fim do método que retorna o cep do objeto do tipo Endereco;
    
   public String retornarRua()
   { 
      return rua;
   }//Fim do método que retorna a rua do objeto do tipo Endereco;
   
   public void alterarRua(String novaRua)
   {
      rua = novaRua;
      
     // this.numero; Pedir entrada de dados para o novo número do endereco;
   }//Fim do método que altera a rua do objeto do tipo Rua;
    
   public Cidade retornarCidade()
   { 
      return cidade;
   }//Fim do método que retorna o objeto do tipo Cidade do objeto do tipo Endereco;
   
   public Pais retornarPais()
   {
      return pais;
   }//Fim do método retorna o objeto do tipo Pais do objeto do tipo Endereco;
   
}//Fim da classe Endereco