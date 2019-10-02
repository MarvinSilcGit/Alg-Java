package br.dominio.republicafederativa;


import java.util.ArrayList;

import java.util.Date;

import br.dominio.empresa.Funcionario;

import br.dominio.cadastro.Endereco;

import br.dominio.banco.Acesso;

import br.dominio.cadastro.Telefone;


public class Presidente extends Funcionario{
    

   private ArrayList gabinete =  new ArrayList(20);
    

   public Presidente()
   {
        
   }
    
   public Presidente (String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta){
     
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, salario, setor, cargo, dataAdmissao, conta);       
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