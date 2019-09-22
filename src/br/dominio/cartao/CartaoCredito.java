package br.dominio.cartao;


import java.util.Date;


public class CartaoCredito extends Cartao{
    
    private double limite;
    
    private Date vencimentoFatura;
    
    
    public CartaoCredito(){
        
    }
    
    public CartaoCredito(int numeroCartao, int codeSeguranca, int categoria, int senhaNumero, String nomeGravado, String bandeira, Date vencimentoCartao, double limite, Date vencimentoFatura){
        
        super(numeroCartao, codeSeguranca, categoria, senhaNumero, nomeGravado, bandeira, vencimentoCartao);
        
        this.limite=limite;
       
        this.vencimentoFatura=vencimentoFatura;
    }
    
    public double retornarLimite(){
    
        return this.limite;
    }   
    
    public void alterarLimite(double alterar){
    
        this.limite=alterar;
    }
    
    public Date retornarVencimentoFatura(){
    
        return this.vencimentoFatura;
    }
    
    public void alterarVencimentoFatura(Date alterar){
    
        this.vencimentoFatura=alterar;
    }
}