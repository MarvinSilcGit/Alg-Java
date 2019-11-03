package br.dominio.banco;


import br.dominio.api.Cliente;

import br.dominio.api.Acesso;

import java.util.Date;

import br.dominio.api.Endereco;

import br.dominio.conta.ContaPoupanca;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ClienteSimples extends Cliente
{ 
   private ContaPoupanca contaPoupanca;
    
   //Fim do campo de declaração de atributos; 
   
   
   public ClienteSimples()
   {        
   
   }//Fim do método construtor padrão;
     
   public ClienteSimples(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, Acesso conta, Date tempoClienteBanco, ContaPoupanca contaPoupanca)
   {     
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, conta, tempoClienteBanco);
      
      //Fim do método super da classe mãe ou super classe Cliente;
      
      this.contaPoupanca=contaPoupanca;
   }//Fim do método construtor personalizado;
    
   public ContaPoupanca acessarContaPoupanca()
   {
      return this.contaPoupanca;
   }//Fim do método que dá acesso ao objeto do tipo ContaPoupanca no objeto do tipo ClienteSimples;
    
}//Fim da classe CLienteSimples;