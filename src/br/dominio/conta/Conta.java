package br.dominio.conta;


import br.dominio.cartao.CartaoDebito;


public abstract class Conta
{  
   private double saldo,
           valorInicial;//Mudar ou não a classe conta de lugar; Todo o cliente possui uma conta, ou será o banco?
    
   private CartaoDebito cartaoDebito;

   //Fim do campo de declaração de atributos;

   public Conta()  
   {        
  
   }
    
    public Conta(double saldo, double valorInicial, CartaoDebito cartaoDebito){
        
        this.saldo=saldo;

        this.valorInicial=valorInicial;

        this.cartaoDebito=cartaoDebito;
    }

    public double retornarSaldo(){

        return this.saldo;
    }

        
    public void depositarDinheiro(double DepositarDinheiroConta){

        this.saldo+=DepositarDinheiroConta;
    }

    public void sacarDinheiro(double retirarDinheiroConta){

        this.saldo-=retirarDinheiroConta;
    }
    
    public double retornarValorInicial(){

        return this.valorInicial;
    }

    public CartaoDebito acessarCartaoDebito(){

        return this.cartaoDebito;
    }
    
}//Fim da classe Conta;