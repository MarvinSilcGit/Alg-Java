package br.dominio.supermercado;


import br.dominio.cadastro.Endereco;

import br.dominio.empresa.Departamento;

import br.dominio.cartao.CartaoCredito;

import br.dominio.cadastro.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class MainSupermercado
{
    
   public static void main(String[] args)
   {   
      Departamento dp1 = new Departamento();
        
       
      Estoque es1 = new Estoque(1);
        
      
      CartaoCredito cd = new CartaoCredito(0,0,0,0,"","Desavisa",null,1000,null);
        
      
      Acesso ac1 = new Acesso();
    }//Fim do método main;
    
}//Fim da classe MainSupermercado;