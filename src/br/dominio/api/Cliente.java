package br.dominio.api;


import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

   
public abstract class Cliente extends Pessoa
{        
   private Acesso conta;
  
   private Date dataFidelizacaoCliente;
    
   //Fim do campo de declaração de atributos;
   
   
   public Cliente()
   {  
   
   }//Fim do método construtor padrão;    
       
   public Cliente (String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, Acesso conta, Date dataFidelizacaoCliente)
   {     
      super (nome, nascimento, cpf, email, telefone, endereco);
        
      //Fim do método super da classe mãe ou super classe Pessoa;
      
      this.conta = conta;
      
      this.dataFidelizacaoCliente = dataFidelizacaoCliente;      
   }//Fim do método construtor personalizado;
  
   public final Acesso acessarContaAcesso()
   {    
      return conta;
   }//Fim do método que permite acesso ao objeto do tipo Conta no objeto do tipo Cliente;
    
   public final Date retornarDataFidelizacao()
   { 
      return dataFidelizacaoCliente;//Alterar o comportamento do método
   }//Fim do método que retorna a data de fidelização do objeto do tipo Cliente;
    
}//Fim da classe Cliente;