package br.dominio.cartao;


import java.util.Date;

import br.dominio.api.Cartao;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class CartaoDebito extends Cartao
{     
   private String senhaLetra;
    
   //Fim do campo de declaração de atributos;
   
    
   public CartaoDebito()
   {     
   
   }//Fim do método construtor padrão;
    
   public CartaoDebito (long numeroCartao, int codeSeguranca, int senhaNumero, String nomeGravado, Date vencimentoCartao,  String senhaLetra)
   {
      super (numeroCartao, codeSeguranca, senhaNumero, nomeGravado, vencimentoCartao);
      
      //Fim do método super da classe mãe ou super classe Cartão;
       
      this.senhaLetra=senhaLetra;
   }//Fim do método construtor padrão;
    
   public final String retornarSenhaLetra()
   {     
      return this.senhaLetra;
   }//Fim do étodo que retorna a senha letra do objeto do tipo CartaoDebito;
    
   public final void alterarSenhaLetra(String alterar)
   { 
      this.senhaLetra=alterar;
   }//Fim do método que altera a senha letra do objeto do tipo CartaoDebito;
   
}//Fim da classe CartaoDebito;