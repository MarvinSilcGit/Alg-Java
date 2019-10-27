package br.dominio.cartao;


import java.util.Date;

import br.dominio.api.Cartao;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class CartaoDebito extends Cartao
{     
   private String senhaLetra;
    
    
   public CartaoDebito()
   {     
   
   }
    
    public CartaoDebito(int numeroCartao, int codeSeguranca, int categoria, int senhaNumero, String nomeGravado, String bandeira, Date vencimentoCartao,  String senhaLetra){
        
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