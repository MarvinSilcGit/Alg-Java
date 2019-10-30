package br.dominio.banco;


import br.dominio.api.Acesso;

import br.dominio.conta.ContaCorrente;

import br.dominio.api.Endereco;

import br.dominio.api.Empresa;

import br.dominio.api.Funcionario;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class ClienteJuridico extends Empresa
{ 
   private ContaCorrente contaCorrente;
    
   private Acesso conta;
    
   //Fim do campo de declaração de atributos;
   
    
   public ClienteJuridico()
   {     
   
   }//Fim do método construtor padrão;
    
   public ClienteJuridico(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente, ContaCorrente contaCorrente, Acesso conta)
   {      
      super(cnpj, razaoSocial, nomeFantasia, endereco, telefone, presidente, vicePresidente);
        
      //Fim do método super da classe mãe ou super classe Empresa;
      
      this.contaCorrente=contaCorrente;
        
      this.conta=conta;
   }//Fim do método construtor personalizado;

   public ContaCorrente acessarContaCorrente()
   {     
      return this.contaCorrente;
   }//Fim do método que dá acesso ao objeto do tipo ContaCorrente no objeto do tipo ClienteJuridico;

   public Acesso acessarContaAcesso()
   {     
      return this.conta;
   }//Fim do método que dá acesso ao objeto do tipo Acesso no objeto do tipo ClienteJuridico;
   
}//Fim da classe ClienteJuridoco;