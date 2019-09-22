package br.dominio.cartao;


import java.util.Date;


public abstract class Cartao{
    
    private int numeroCartao, codeSeguranca, categoria, senhaNumero;
    
    private String nomeGravado, bandeira;
    
    private Date vencimentoCartao;
    
    
    public Cartao(){
        
    }
    
    public Cartao(int numeroCartao, int codeSeguranca, int categoria, int senhaNumero, String nomeGravado, String bandeira, Date vencimentoCartao){
        
        this.numeroCartao=numeroCartao;
        
        this.codeSeguranca=codeSeguranca;
        
        this.categoria=categoria;
        
        this.senhaNumero=senhaNumero;
        
        this.nomeGravado=nomeGravado;
        
        this.bandeira=bandeira;
        
        this.vencimentoCartao=vencimentoCartao;
    }
    
    public int retornarNumeroCartao(){
        
        return this.numeroCartao;
    }
    
    public int retornarCodeSeguranca(){
    
        return this.codeSeguranca;
    }
    
    public int retornarCategoria(){
    
        return this.categoria;
    }
    
    public int retornarSenhaNumero(){
    
        return this.senhaNumero;
    }
    
    public void alterarSenhaNumero(int alterar){
    
        this.senhaNumero=alterar;
    }
    
    public String retornarNomeGravado(){
    
        return this.nomeGravado;
    }
    
    public String retornarBandeira(){
    
        return this.bandeira;
    }
    
    public Date retornarVencimentoCartao(){
    
        return this.vencimentoCartao;
    }
}