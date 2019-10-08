/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.empresa;

/**
 *
 * @author belogo
 */

import br.dominio.cadastro.Endereco;

import br.dominio.cadastro.Telefone;

import java.util.Date;

import br.dominio.banco.Acesso;

import br.dominio.cadastro.Pessoa;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Funcionario extends Pessoa
{
   private double salario;
    
   private String setor,
           
           cargo;
    
   private Date dataAdmissao;
    
   private Acesso conta;
   
   //Fim do campo de declaração de atributos;
    
   
   public Funcionario()
   {
        
   }//Fim do método construtor padrão;
    
   public Funcionario(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta)
   {    
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil);          
    
      this.salario=salario;
        
      this.setor=setor;
        
      this.cargo=cargo;
        
      this.dataAdmissao=dataAdmissao;
        
      this.conta=conta;
   }//Fim do primeiro método construtor personalizado;
    
   public Funcionario(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, String setor, String cargo, Date dataAdmissao, Acesso conta)
   {    
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil);
       
      this.setor=setor;
        
      this.cargo=cargo;
        
      this.dataAdmissao=dataAdmissao;
        
      this.conta=conta;     
   }//Fim do segundo método construtor personalizado;
    
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
    
   public String retornarCargo()
   { 
      return this.cargo;
   }//Fim do método que retora o cargo do objeto do tipo Funcionario;
    
   public void alterarCargo(String alterarSetor)
   { 
      this.cargo=alterarSetor;
   }//Fim do método que altera o cargo do objeto do tipo Funcionario;
    
   public Date retornarDataAdmissão()
   {   
      return this.dataAdmissao;
   }//Fim do método que retorna a data admissão do objeto do tipo Funcionario;
    
   public Acesso acessarContaAcesso()
   {  
      return this.conta;
   }
   
}//Fim da classe Funcionario;