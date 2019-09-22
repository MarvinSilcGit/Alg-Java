package br.dominio.conta;


import br.dominio.cartao.CartaoDebito;


public abstract class Conta{
    
    private double saldo, valorInicial;
   
    private CartaoDebito cartaoDebito;
    

    public Conta(){
        
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
}