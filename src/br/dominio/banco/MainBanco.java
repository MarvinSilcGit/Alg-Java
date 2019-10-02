package br.dominio.banco;


import br.dominio.cadastro.Endereco;

import br.dominio.conta.ContaCorrente;

import br.dominio.conta.ContaPoupanca;

import br.dominio.cartao.CartaoDebito;

import br.dominio.cartao.CartaoCredito;


//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

public class MainBanco{
    
    
    public static void main(String[] args){
        
        Endereco endereco2 = new Endereco("","48400-000","alameda dos anjos","alameda","QG","","");
        
        Correntista ca1 = new Correntista("mma",null,"1123","",null,'s',null,0,"financeiro","",null,null);
        
        CartaoDebito cd1 = new CartaoDebito(0,0,0,0,"a","s",null,"x"); 
        
        ContaPoupanca cp1 = new ContaPoupanca(0,50,cd1,6,10);
        
        CartaoCredito cc1 = new CartaoCredito(0,0,0,0,"a","s",null,0,null);
        
        ContaCorrente ct1 = new ContaCorrente(0,100,cd1,1,cc1);
        
        Acesso ac1 = new Acesso("","");
        
        ClienteSimples cl1 = new ClienteSimples("João",null,"0909","",null,'m',null,null,5,cp1);
       
        ClientePro cm1 = new ClientePro("",null,"","",null,'s',endereco2,ac1,6,ct1);
        
        System.out.println(cm1.acessarContaCorrente().acessarCartaoCredito().retornarBandeira());
        
        cm1.acessarContaAcesso().alterarSenha("s");
        
        System.out.println(cm1.acessarContaAcesso().retornarSenhaTemporaria());     
    }
}