package br.dominio.republicafederativa;


import java.util.ArrayList;

import java.util.Date;

import br.dominio.classesabstratas.Funcionario;

import br.dominio.classesabstratas.Endereco;

import br.dominio.classesabstratas.Acesso;

import br.dominio.classesabstratas.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Presidente extends Funcionario
{    
   private ArrayList gabinete =  new ArrayList(20);
    
   //Fim do campo de declaração de atributos;
   
   
   public Presidente()
   {
        
   }//Fim do método construtor padrão;
    
   public Presidente (String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, Date dataAdmissao, Acesso conta)
   {
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, salario, setor, dataAdmissao, conta);       
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