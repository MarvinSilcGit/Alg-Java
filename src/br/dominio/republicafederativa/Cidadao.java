package br.dominio.republicafederativa;


import br.dominio.classesabstratas.Endereco;

import br.dominio.classesabstratas.Telefone;

import java.util.Date;

import br.dominio.classesabstratas.Pessoa;

public class Cidadao extends Pessoa 
{
   private int numeroSus;
   
   //Fim do campo de declaração de atributos;
   
   
   public Cidadao()
   {
      
   }//Fim do método construtor padrão;
   
   public Cidadao(String nome, Date nascimento,String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, int numeroSus)
   {
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil);
      
      this.numeroSus=numeroSus;
   }
   
}//Fim da classe Cidadão;