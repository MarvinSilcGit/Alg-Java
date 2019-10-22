package br.dominio.cadastro;


import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

   
public abstract class Cliente extends Pessoa
{        
   private Acesso conta;
  
   private Date dataFidelizacaoCliente;
    
   //Fim do campode declaração de atributos;
   
   
   public Cliente()
   {  
   
   }//Fim do método construtor padrão;    
       
   public Cliente(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, Acesso conta, Date dataFidelizacaoCliente)
   {     
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil);
        
      //Fim do métod Super da superclasse ou classe mãe Pessoa;
      
      this.conta=conta;
      
      this.dataFidelizacaoCliente=dataFidelizacaoCliente;      
   }//Fim do método construtor personalizado;
  
   public Acesso acessarContaAcesso()
   {    
      return this.conta;
   }
    
   public Date retornarTempoClienteBanco()
   { 
      return this.dataFidelizacaoCliente;//Alterar o comportamento do método
   }
    
}//Fim da classe Cliente;