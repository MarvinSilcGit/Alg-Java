package br.dominio.republicafederativa.republica;


import java.util.ArrayList;

import java.util.Date;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

import br.dominio.api.Acesso;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Presidente extends Funcionario
{    
   private ArrayList gabinete =  new ArrayList(20);
   
   private Date dataPosse,
           dataDesposse;
    
   //Fim do campo de declaração de atributos;
   
   
   public Presidente()
   {
        
   }//Fim do método construtor padrão;
    
   public Presidente(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, Acesso conta, Date dataPosse, Date dataDesposse)
   {
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, salario, setor, conta);      
      
      //Fim do método super da classe mãe ou superclasse Funcionario;
      
      this.dataPosse=dataPosse;
      
      this.dataDesposse=dataDesposse;
   }//Fim do método construtor personalizado;
    
   public Date retornarDataPosse()
   {
      return this.dataPosse;
   }
   
   public Date retornarDataDesposse()
   {
      return this.dataDesposse;
   }
   
   public ArrayList retornarGabinete()
   {
      return this.gabinete;
   }
    
   public void inserirFuncionarioGabinete(Funcionario novoFuncionario)
   {
      this.gabinete.add(novoFuncionario);
   }
   
}//Fim da classe Presidente;