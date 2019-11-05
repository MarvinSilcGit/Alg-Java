package br.dominio.drograria;


import java.util.Date;

import br.dominio.api.Endereco;

import br.dominio.api.Funcionario;

import br.dominio.api.Acesso;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Farmaceutico extends Funcionario
{   
   private String crf;
    
   //Fim do campo de declaração de atributos;
   
   public Farmaceutico()
   {
   
   }//Fim do método construtor padrão;
    
   public Farmaceutico(String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, String condicaoCivil, double salario, String setor, Date dataAdmissao, Acesso conta, String crf)
   {     
      super(nome, nascimento, cpf, email, telefone, endereco, condicaoCivil, salario, setor, dataAdmissao, conta);
        
      //Fim do método super da classe mãe ou super classe Funcionario;
      
      this.crf=crf;
   }//Fim do método construtor personalizado;
    
   public String retornarCrf()
   {   
      return this.crf;
   }//Fim do método que retorna o crf do objeto do tipo Farmaceutico;
    
}//Fim da classe Farmaceutico;