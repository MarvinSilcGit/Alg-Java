package br.dominio.republicafederativa;


import java.util.Date;

import br.dominio.cadastro.Pessoa;

import br.dominio.cadastro.*;

public class Cidadao extends Pessoa 
{
   private int numeroSus;
   
   
   public Cidadao()
   {
      
   }//Fim do método construtor padrão;
   
   public Cidadao(String nome, Date nascimento,String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, int numeroSus)
   {
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil);
      
      this.numeroSus=numeroSus;
   }
   
}//Fim da classe Cidadão;