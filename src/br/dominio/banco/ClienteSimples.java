package br.dominio.banco;


import java.util.Date;

import br.dominio.cadastro.Endereco;

import br.dominio.conta.ContaPoupanca;

import br.dominio.cadastro.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

public class ClienteSimples extends Cliente
{ 
   private ContaPoupanca contaPoupanca;
    
   //Fim do campo de declaração de atributos; 
   
   public ClienteSimples()
   {        
   
   }
     
   public ClienteSimples(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, Acesso conta, int tempoClienteBanco, ContaPoupanca contaPoupanca)
   {     
   
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, conta, tempoClienteBanco);
      
      //Fim do método Super da superclasse ou classe mãe Cliente;
      
      this.contaPoupanca=contaPoupanca;
   }//Fim do método construtor personalizado;
    
   public ContaPoupanca acessarContaPoupanca()
   {
      return this.contaPoupanca;
   } 
    
}//Fim da classe CLienteSimples;