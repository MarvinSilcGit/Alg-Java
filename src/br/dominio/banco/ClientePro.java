package br.dominio.banco;


import java.util.Date;

import br.dominio.conta.ContaCorrente;

import br.dominio.api.Endereco;

import br.dominio.api.Cliente;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ClientePro extends Cliente
{
   private ContaCorrente contaCorrente;
    
   //Fim do campo de declaração de atributos;

   public ClientePro()
   {       
    
   }//Fim do método construtor personalizado;
    
   public ClientePro (String nome, Date nascimento, String cpf, String email, Endereco endereco, Acesso conta, Date dataFidelizacaoCliente, ContaCorrente contaCorrente)
   { 
      super (nome, nascimento, cpf, email, endereco, conta, dataFidelizacaoCliente);
      
      //Fim do método super da classe mãe ou super classe Cliente;
      
      this.contaCorrente = contaCorrente;
   }//Fim do método construtor personalizado;
    
   public final ContaCorrente acessarContaCorrente()
   {
      return contaCorrente;
   }
    
}//Fim da classe ClientePro;