package br.dominio.conta;


import br.dominio.cartao.CartaoDebito;


public class ContaPoupanca extends Conta{

    
    private double taxaDividendosAno;

    private int limiteSaquesMensais;
    

    public ContaPoupanca(){
        
    }
    
    public ContaPoupanca(double saldo, double valorInicial, CartaoDebito cartaoDebito, double taxaDividendosAno, int limiteSaquesMensais){
        
        super(saldo, valorInicial, cartaoDebito);

        this.taxaDividendosAno=taxaDividendosAno; 

        this.limiteSaquesMensais=limiteSaquesMensais;
    }
    
    public double retornarTaxaDividendos(){

        return this.taxaDividendosAno;
    }

    public void alterarTaxaDividendos(double alterar){

        this.taxaDividendosAno=alterar;
    }

    public int retornarLimiteSaquesMensais(){

        return this.limiteSaquesMensais;
    }
}