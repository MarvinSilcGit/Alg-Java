package br.dominio.republicafederativa;


import java.util.ArrayList;

import java.util.Date;

import br.dominio.cadastro.Funcionario;

import br.dominio.cadastro.Endereco;

import br.dominio.cadastro.Acesso;

import br.dominio.cadastro.Telefone;


public class Presidente extends Funcionario
{    

   private ArrayList gabinete =  new ArrayList(20);
    

   public Presidente()
   {
        
   }//Fim do método construtor padrão;
    
   public Presidente (String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, Date dataAdmissao, Acesso conta){
     
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