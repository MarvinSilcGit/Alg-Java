package br.dominio.cartao;


import br.dominio.api.Cartao;

import java.util.Date;


public class CartaoDebito extends Cartao
{     
   private String senhaLetra;
    
    
   public CartaoDebito()
   {     
   
   }
    
    public CartaoDebito(int numeroCartao, int codeSeguranca, int categoria, int senhaNumero, String nomeGravado, String bandeira, Date vencimentoCartao, String senhaLetra){
        
        super(numeroCartao, codeSeguranca, categoria, senhaNumero, nomeGravado, bandeira, vencimentoCartao);
       
        this.senhaLetra=senhaLetra;
    }
    
    public String retornarSenhaLetra(){
        
        return this.senhaLetra;
    }
    
    public void alterarSenhaLetra(String alterar){
    
        this.senhaLetra=alterar;
    }
}