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

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;
        

public final class Endereco 
{
   private String numero,
           bairro,
           cep,
           rua;
   
   private Cidade cidade;
   
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
   }//Fim do enum Estado;
   
   
   public Endereco()
   {     
    
   }//Fim do método construtor padrão;
    
   public Endereco (String numero, String bairro, String cep, String complemento, String rua, Cidade cidade)
   {    
      this.numero = numero;
       
      this.bairro = bairro;
        
      this.cep = cep;
        
      this.rua = rua;
        
      this.cidade = cidade;
   }//Fim do método construtor personalizado;
    
   public final String retornarEnderecoCompleto()
   {
      return "Rua: " + rua + ", Número: " + numero +", Bairro: " + bairro + ", CEP: " + cep + ", Rua: " + ", Cidade: " + cidade + ", Estado: " + ", Pais: Brasil";
   }//Fim do método que retorna todos os atributos do objeto do tipo Endereco;
    
   public final String retornarNumero()
   {
      return numero;
   }//Fim do método que retorna o número do objeto do tipo Endereco;
   
   public final String retornarBairro()
   { 
      return bairro;
   }//Fim do método que retorna o bairro do objeto do tipo Endereco;
    
   public final String retornarCep()
   { 
      return cep;
   }//Fim do método que retorna o cep do objeto do tipo Endereco;
    
   public final String retornarRua()
   { 
      return rua;
   }//Fim do método que retorna a rua do objeto do tipo Endereco;
    
   public final Cidade retornarCidade()
   { 
      return cidade;
   }//Fim do método que retorna o objeto do tipo Cidade do objeto do tipo Endereco;
   
}//Fim da classe Endereco