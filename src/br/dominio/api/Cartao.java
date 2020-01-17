package br.dominio.api;


import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Cartao
{     
   private long numeroCartao;
   
   private short codeSeguranca,
           senhaNumero;
   
   private String nomeGravado;
    
   private Date vencimentoCartao;
   
   //Fim do campo de declaração de atributos;
    
   
   public enum Bandeira
   {
      MASTERCARD,
      VISA,
      ELO;
   }
   
   public enum Categoria
   {
      BRONZE,
      PRATA,
      OURO,
      PLATINA,
      DIAMANTE;
   }
    
   public Cartao()
   {   

   }//Fim do método construtor padrão;
    
   public Cartao (long numeroCartao, short codeSeguranca, short senhaNumero, String nomeGravado, Date vencimentoCartao)
   {     
      this.numeroCartao = numeroCartao;
        
      this.codeSeguranca = codeSeguranca;
        
      this.senhaNumero = senhaNumero;
        
      this.nomeGravado = nomeGravado;
        
      this.vencimentoCartao=vencimentoCartao;
   }//Fim do método construtor personalizado;
    
   public final long retornarNumeroCartao()
   {    
      return this.numeroCartao;
   }//Fim do método que retornao o número do objeto do tipo Cartão;
    
   public final short retornarCodeSeguranca()
   { 
      return this.codeSeguranca;
   }//Fim do método que retorna o código de segunrança do objeto do tipo Cartão;
    
   public final short retornarSenhaNumero()
   { 
      return this.senhaNumero;
   }//Fim do método que retorna a senha do objeto do tipo Cartao;
    
   public final String retornarNomeGravado()
   { 
      return this.nomeGravado;
   }//Fim do método que retorna o nome gravado do objeto do tipo Cartão;
  
   public final Date retornarVencimentoCartao()
   { 
      return this.vencimentoCartao;
   }//Fim do método que retorna a data de vencimento do objeto do tipo Cartão;
   
}//Fim da classe Cartao;