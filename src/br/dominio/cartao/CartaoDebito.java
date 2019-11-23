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
    
   public CartaoDebito(int numeroCartao, int codeSeguranca, int categoria, int senhaNumero, String nomeGravado, Date vencimentoCartao,  String senhaLetra)
   {
      super(numeroCartao, codeSeguranca, categoria, senhaNumero, nomeGravado, vencimentoCartao);
      
      //Fim do método super da classe mãe ou super classe Cartão;
       
      this.senhaLetra=senhaLetra;
   }//Fim do método construtor padrão;
    
   public String retornarSenhaLetra()
   {     
      return this.senhaLetra;
   }//Fim do étodo que retorna a senha letra do objeto do tipo CartaoDebito;
    
   public void alterarSenhaLetra(String alterar)
   { 
      this.senhaLetra=alterar;
   }//Fim do método que altera a senha letra do objeto do tipo CartaoDebito;
   
}//Fim da classe CartaoDebito;