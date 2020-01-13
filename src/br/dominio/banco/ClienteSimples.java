package br.dominio.banco;


import br.dominio.api.Cliente;

import br.dominio.api.Acesso;

import java.util.Date;

import br.dominio.api.Endereco;

import br.dominio.conta.ContaPoupanca;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ClienteSimples extends Cliente
{ 
   private ContaPoupanca contaPoupanca;
    
   //Fim do campo de declaração de atributos; 
   
   
   public ClienteSimples()
   {        
   
   }//Fim do método construtor padrão;
     
   public ClienteSimples (String nome, Date nascimento, String cpf, String email, Endereco endereco, String condicaoCivil, Acesso conta, Date dataFidelizacaoCliente, ContaPoupanca contaPoupanca)
   {     
      super (nome, nascimento, cpf, email, endereco, conta, dataFidelizacaoCliente);
      
      //Fim do método super da classe mãe ou super classe Cliente;
      
      this.contaPoupanca = contaPoupanca;
   }//Fim do método construtor personalizado;
    
   public final ContaPoupanca acessarContaPoupanca()
   {
      return contaPoupanca;
   }//Fim do método que dá acesso ao objeto do tipo ContaPoupanca no objeto do tipo ClienteSimples;
    
}//Fim da classe CLienteSimples;