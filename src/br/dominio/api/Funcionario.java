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


public abstract class Funcionario extends Cidadao
{
   private float salario;
    
   private String setor,
           email;
    
   private Date dataAdmissao;
   
   private Telefone telefone;
   
   //Fim do campo de declaração de atributos;
    
  
   public enum Sexo
   {
      MASCULINO,
      FEMININO;
   }//Fim do enum Sexo;
   
   public enum CondicaoCivil
   {
      SOLTEIRO,
      CASADO,
      DIVORCIADO,
      VIUVO,
      UNIAOESTAVEL;
   }//Fim do enum CondicaoCivil;   
   
   
   public Funcionario()
   {
        
   }//Fim do método construtor padrão;
    
   public Funcionario (String nome, int cpf, float salario, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone)
   {       
      super (nome, cpf);
      
      //Fim do método super da classe mãe ou super classe Cidadao;
      
      this.email = email;
      
      this.salario = salario;
      
      this.setor = setor;
      
      this.dataAdmissao = dataAdmissao;
      
      this.email = email;
      
      this.telefone = telefone;
   }//Fim do primeiro método construtor personalizado;
   
   public Funcionario (String nome, int cpf, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone)
   {
      super (nome, cpf);
      
      //Fim do método super da class mãe ou super classe Cidadao;
      
      this.setor = setor;
      
      this.dataAdmissao = dataAdmissao;
      
      this.email = email;
      
      this.telefone = telefone;
   }//Fim do segundo método construtor personalizado;
    
   public final float retornarSalario()
   { 
      return salario;
   }//Fim do método que retorna o salario do objeto do tipo Funcionario;
   
   public final String retornarSetor()
   {
      return setor;
   }//Fim do método que retorna o setor do objeto do tipo Funcionario;
    
   public final Date retornarDataAdmissão()
   {   
      return dataAdmissao;
   }//Fim do método que retorna a data admissão do objeto do tipo Funcionario;
    
   public final String retornarEmail()
   { 
      return email;
   }//Fim do método que retorna o email do objeto do tipo Pessoa;
   
   public final String retornarTelefone()
   {  
      return telefone.retornarTelefoneCompleto();
   }//Fim do método que retorna o telefone do objeto do tipo Pessoa;
   
}//Fim da classe Funcionario;