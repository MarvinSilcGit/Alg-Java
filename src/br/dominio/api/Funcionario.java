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
   
   private Endereco endereco;
   
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
    
   public Funcionario (IRecebeIdentidade registroGeral, String email, Endereco endereco, float salario, String setor, Date dataAdmissao)
   {               
      this.salario = salario;
        
      this.setor = setor;
        
      this.dataAdmissao = dataAdmissao;
   }//Fim do primeiro método construtor personalizado;
    
   public Funcionario (String nome, Date dataNascimento, String cpf, String email, Endereco endereco, String setor, Date dataAdmissao)
   {    
      this.setor = setor;
        
      this.dataAdmissao = dataAdmissao;   
   }//Fim do segundo método construtor personalizado;
    
   public Funcionario (String nome, Date nascimento, String cpf, String email, Endereco endereco, float salario, String setor)
   {    
      this.salario = salario;
        
      this.setor = setor;
   }//Fim do terceiro método construtor personalizado;
    
   public final float retornarSalario()
   { 
      return salario;
   }//Fim do método que retorna o salario do objeto do tipo Funcionario;
    
   public final void alterarSalario (double valorParaAumentar)
   { 
      salario += valorParaAumentar;
   }//Fim do método que altera o salario do objeto do tipo Funcionario;
   
   public final void diminuirSalario (double valorParaDiminuir)
   {
      salario -= valorParaDiminuir;
   }
   public final String retornarSetor()
   {
      return setor;
   }//Fim do método que retorna o setor do objeto do tipo Funcionario;
    
   public final void alterarSetor (String novosetor)
   {   
      setor = novosetor;
   }//Fim do método que altera o setor do objeto do tipo Funcionario;
    
   public final Date retornarDataAdmissão()
   {   
      return dataAdmissao;
   }//Fim do método que retorna a data admissão do objeto do tipo Funcionario;
    
   public final String retornarEmail()
   { 
      return email;
   }//Fim do método que retorna o email do objeto do tipo Pessoa;
    
   public final void alterarEmail (String novoEmail)
   { 
      email = novoEmail;
   }//Fim do método que altera o email do objeto do tipo Pessoa;
    
   public final String retornarTelefone()
   {  
      return telefone.retornarTelefoneCompleto();
   }//Fim do método que retorna o telefone do objeto do tipo Pessoa;
 
   public final String retornarEndereco()
   {    
      return endereco.retornarEnderecoCompleto();
   }//Fim do método que retorna o objeto do tipo Endereco;
   
}//Fim da classe Funcionario;