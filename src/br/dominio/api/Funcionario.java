/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.api;

/**
 *
 * @author belogo
 */

import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Funcionario extends Pessoa
{
   private double salario;
    
   private String setor;
    
   private Date dataAdmissao;
    
   private Acesso conta;
   
   //Fim do campo de declaração de atributos;
    
   
   public Funcionario()
   {
        
   }//Fim do método construtor padrão;
    
   public Funcionario(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, Date dataAdmissao, Acesso conta)
   {    
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil);          
    
      //Fim do método super da classe mãe ou superclasse Pessoa;
      
      this.salario=salario;
        
      this.setor=setor;
        
      this.dataAdmissao=dataAdmissao;
        
      this.conta=conta;
   }//Fim do primeiro método construtor personalizado;
    
   public Funcionario(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, String setor, Date dataAdmissao, Acesso conta)
   {    
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil);
       
      //Fim do método super da classe mãe ou superclasse Pessoa;
      
      this.setor=setor;
        
      this.dataAdmissao=dataAdmissao;
        
      this.conta=conta;     
   }//Fim do segundo método construtor personalizado;
    
   public Funcionario(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, Acesso conta)
   {    
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil);          
    
      //Fim do método super da classe mãe ou superclasse Pessoa;
      
      this.salario=salario;
        
      this.setor=setor;
        
      this.conta=conta;
   }//Fim do terceiro método construtor personalizado;
    
   public double retornarSalario()
   { 
      return this.salario;
   }//Fim do método que retorna o salario do objeto do tipo Funcionario;
    
   public void alterarSalario(double alterarSalario)
   { 
      this.salario=alterarSalario;
   }//Fim do método que altera o salario do objeto do tipo Funcionario;
    
   public String retornarSetor()
   {
      return this.setor;
   }//Fim do método que retorna o setor do objeto do tipo Funcionario;
    
   public void alterarSetor(String alterarSetor)
   {   
      this.setor=alterarSetor;
   }//Fim do método que altera o setor do objeto do tipo Funcionario;
    
   public Date retornarDataAdmissão()
   {   
      return this.dataAdmissao;
   }//Fim do método que retorna a data admissão do objeto do tipo Funcionario;
    
   public Acesso acessarContaAcesso()
   {  
      return this.conta;
   }//Fim do método que da acesso ao objeto do tipo Conta no objeto do tipo Funcionario;
   
}//Fim da classe Funcionario;