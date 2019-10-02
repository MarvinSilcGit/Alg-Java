package br.dominio.supermercado;


import br.dominio.cadastro.Endereco;

import br.dominio.empresa.Departamento;

import br.dominio.cartao.CartaoCredito;

import br.dominio.banco.Acesso;


public class MainSupermercado{

    public static void main(String[] args){
                
        Endereco e1 = new Endereco("","","","333","","","");
        
        Departamento dp1 = new Departamento();
        
        Estoque es1 = new Estoque(1);
        
        CartaoCredito cd = new CartaoCredito(0,0,0,0,"","Desavisa",null,1000,null);
        
        Acesso ac1 = new Acesso();
        
        Cliente cl = new Cliente("assa",null,"","",null,'a',e1,cd,ac1);
    }
    
}//Fim da classe MainSupermercado;