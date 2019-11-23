package br.dominio.api;


import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Cartao
{     
   private int numeroCartao,
           codeSeguranca,
           categoria,
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
    
   public Cartao()
   {   

   }//Fim do método construtor padrão;
    
   public Cartao(int numeroCartao, int codeSeguranca, int categoria, int senhaNumero, String nomeGravado, Date vencimentoCartao)
   {     
      this.numeroCartao=numeroCartao;
        
      this.codeSeguranca=codeSeguranca;
        
      this.categoria=categoria;
        
      this.senhaNumero=senhaNumero;
        
      this.nomeGravado=nomeGravado;
        
      this.vencimentoCartao=vencimentoCartao;
   }//Fim do método construtor personalizado;
    
   public int retornarNumeroCartao()
   {    
      return this.numeroCartao;
   }//Fim do método que retornao o número do objeto do tipo Cartão;
    
   public int retornarCodeSeguranca()
   { 
      return this.codeSeguranca;
   }//Fim do método que retorna o código de segunrança do objeto do tipo Cartão;
    
   public int retornarCategoria()
   { 
      return this.categoria;
   }//Fim do método que retorna a categoria do objeto do tipo Cartão;
    
   public int retornarSenhaNumero()
   { 
      return this.senhaNumero;
   }//Fim do método que retorna a senha do objeto do tipo Cartao;
    
   public void alterarSenhaNumero(int alterar)
   { 
      this.senhaNumero=alterar;
   }//Fim do método que altera o objeto do tipo Cartao;
    
   public String retornarNomeGravado()
   { 
      return this.nomeGravado;
   }//Fim do método que retorna o nome gravado do objeto do tipo Cartão;
  
   public Date retornarVencimentoCartao()
   { 
      return this.vencimentoCartao;
   }//Fim do método que retorna a data de vencimento do objeto do tipo Cartão;
   
}//Fim da classe Cartao;