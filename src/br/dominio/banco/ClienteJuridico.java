package br.dominio.banco;


import br.dominio.api.Acesso;

import br.dominio.conta.ContaCorrente;

import br.dominio.api.Endereco;

import br.dominio.empresa.Empresa;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ClienteJuridico extends Empresa
{ 
   private ContaCorrente contaCorrente;
    
   private Acesso conta;
    
   //Fim do campo de declaração de atributos;
   
    
   public ClienteJuridico()
   {     
   
   }//Fim do método construtor padrão;
    
   public ClienteJuridico (String razaoSocial, String nomeFantasia, Endereco endereco, Funcionario presidente, Funcionario vicePresidente, double capitalSocial, ContaCorrente contaCorrente, Acesso conta)
   {      
      super (razaoSocial, nomeFantasia, endereco, presidente, vicePresidente, capitalSocial);
        
      //Fim do método super da classe mãe ou super classe Empresa;
      
      this.contaCorrente = contaCorrente;
        
      this.conta = conta;
   }//Fim do método construtor personalizado;

   public final ContaCorrente acessarContaCorrente()
   {     
      return contaCorrente;
   }//Fim do método que dá acesso ao objeto do tipo ContaCorrente no objeto do tipo ClienteJuridico;

   public final Acesso acessarContaAcesso()
   {     
      return conta;
   }//Fim do método que dá acesso ao objeto do tipo Acesso no objeto do tipo ClienteJuridico;
   
}//Fim da classe ClienteJuridoco;