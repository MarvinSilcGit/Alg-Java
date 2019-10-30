package br.dominio.cartao;


import br.dominio.api.Cartao;

import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class CartaoCredito extends Cartao
{  
   private double limite;
    
   private Date vencimentoFatura;
   
   //Fim do campo de declaração de atributos;
    
     
   public CartaoCredito()
   {    
    
   }//Fim do método construtor padrão;
    
   public CartaoCredito(int numeroCartao, int codeSeguranca, int categoria, int senhaNumero, String nomeGravado, String bandeira, Date vencimentoCartao, double limite, Date vencimentoFatura)
   {     
      super(numeroCartao, codeSeguranca, categoria, senhaNumero, nomeGravado, bandeira, vencimentoCartao);
      
      //Fim do método super da classe mãe ou super classe Cartao;
        
      this.limite=limite;
       
      this.vencimentoFatura=vencimentoFatura;
    }//Fim do método construtor personalizado;
    
    public double retornarLimite()
    {
        return this.limite;
    }//Fim do método que retorna o limite do objeto do tipo CartaoCredito;
    
    public void aumentarLimite(double novoLimite)
    {
        this.limite=novoLimite;
    }//Fim do método que aumenta o limite do objeto do tipo CartaoCredito;
    
    public void diminuirLimite(double novoLimite)
    {
       this.limite=novoLimite;
    }//Fim do método que diminui o limite do objeto do tipo CartaoCredito;
    
    public Date retornarVencimentoFatura()
    {
       return this.vencimentoFatura;
    }//Fim do método que retorna o vencimento da fatura do objeto do tipo CartaoCredito;
    
    public void alterarVencimentoFatura(Date alterar)
    {
        this.vencimentoFatura=alterar;
    }//Fim do método que altera o vencimento da fatura do objeto do tipo CartaoCredito;
    
}//Fim da classe CartaoCredito;