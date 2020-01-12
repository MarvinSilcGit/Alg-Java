package br.dominio.supermercado;


import br.dominio.empresa.departamento.Departamento;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class MainSupermercado
{
    
   public static final void main(String[] args)
   {   
      Departamento dp1 = new Departamento();
       
      Estoque es1 = new Estoque(1);
 
      Acesso ac1 = new Acesso();
    }//Fim do método main;
    
}//Fim da classe MainSupermercado;