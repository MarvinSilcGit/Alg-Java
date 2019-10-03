package br.dominio.banco;


import java.util.Date;

import br.dominio.cadastro.Pessoa;

import br.dominio.cadastro.Endereco;

import br.dominio.cadastro.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

   
public abstract class Cliente extends Pessoa
{        
   private Acesso conta;
    
   private int tempoClienteBanco;
    
   //Fim do campode declaração de atributos;
   
   
   public Cliente()
   {  
   
   }//Fim do método construtor padrão;    
       
   public Cliente(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, Acesso conta, int tempoClienteBanco)
   {     
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil);
        
      //Fim do métod Super da superclasse ou classe mãe Pessoa;
      
      this.conta=conta;
      
      this.tempoClienteBanco=tempoClienteBanco;      
   }//Fim do método construtor personalizado;
 
    
   public Acesso acessarContaAcesso()
   {     

      return this.conta;
   }
    
   public int retornarTempoClienteBanco()
   { 
      return this.tempoClienteBanco;
   }
    
}//Fim da classe Cliente;