package br.dominio.cartao;


import br.dominio.api.Cartao;

import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class CartaoCredito extends Cartao
{  
   private double limite;
    
   private Date vencimentoFatura;
   
   //Fim do campo de declaração de atributos;
    
     
   public CartaoCredito()
   {    
    
   }//Fim do método construtor padrão;
    
   public CartaoCredito (long numeroCartao, int codeSeguranca,int senhaNumero, String nomeGravado, Date vencimentoCartao, double limite, Date vencimentoFatura)
   {     
      super (numeroCartao, codeSeguranca, senhaNumero, nomeGravado, vencimentoCartao);
      
      //Fim do método super da classe mãe ou super classe Cartao;
        
      this.limite = limite;
       
      this.vencimentoFatura = vencimentoFatura;
    }//Fim do método construtor personalizado;
    
    public final double retornarLimite()
    {
        return limite;
    }//Fim do método que retorna o limite do objeto do tipo CartaoCredito;
    
    public final void aumentarLimite (double novoLimite)
    {
        limite = novoLimite;
    }//Fim do método que aumenta o limite do objeto do tipo CartaoCredito;
    
    public final void diminuirLimite (double novoLimite)
    {
        limite = novoLimite;
    }//Fim do método que diminui o limite do objeto do tipo CartaoCredito;
    
    public final Date retornarVencimentoFatura()
    {
       return vencimentoFatura;
    }//Fim do método que retorna o vencimento da fatura do objeto do tipo CartaoCredito;
    
    public final void alterarVencimentoFatura (Date data)
    {
        vencimentoFatura = data;
    }//Fim do método que altera o vencimento da fatura do objeto do tipo CartaoCredito;
    
}//Fim da classe CartaoCredito;