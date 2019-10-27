package br.dominio.cartao;


import br.dominio.api.Cartao;

import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class CartaoCredito extends Cartao
{  
   private double limite;
    
   private Date vencimentoFatura;
    
     
   public CartaoCredito()
   {    
    
   }
    
   public CartaoCredito(int numeroCartao, int codeSeguranca, int categoria, int senhaNumero, String nomeGravado, String bandeira, Date vencimentoCartao, double limite, Date vencimentoFatura)
   {     
      super(numeroCartao, codeSeguranca, categoria, senhaNumero, nomeGravado, bandeira, vencimentoCartao);
        
      this.limite=limite;
       
      this.vencimentoFatura=vencimentoFatura;
    }
    
    public double retornarLimite()
    {
        return this.limite;
    }   
    
    public void aumentarLimite(double novoLimite)
    {
        this.limite=novoLimite;
    }
    
    public void diminuirLimite(double novoLimite)
    {
       this.limite=novoLimite;
    }
    
    public Date retornarVencimentoFatura(){
    
        return this.vencimentoFatura;
    }
    
    public void alterarVencimentoFatura(Date alterar){
    
        this.vencimentoFatura=alterar;
    }
    
}