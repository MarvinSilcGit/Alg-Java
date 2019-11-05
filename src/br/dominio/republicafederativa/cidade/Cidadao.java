package br.dominio.republicafederativa.cidade;


import java.util.Date;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.api.Pessoa;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;
//Nem todo cidadão tem o Sus;

public class Cidadao extends Pessoa 
{
   private int numeroSus;
   
   //Fim do campo de declaração de atributos;
   
   
   public Cidadao()
   {
      
   }//Fim do método construtor padrão;
   
   public Cidadao(String nome, Date nascimento,String cpf, String email, Telefone telefone, Endereco endereco, String condicaoCivil, int numeroSus)
   {
      super(nome, nascimento, cpf, email, telefone, endereco, condicaoCivil);
      
      //Fim do método super da classe mãe ou super classe Pessoa;
      
      this.numeroSus=numeroSus;
   }//Fim do método construtor personalizado;
   
   public int retornaNumeroSus()
   {
      return this.numeroSus;
   }//Fim do método que retorna o número sus do objeto do tipo Cidadao;
   
}//Fim da classe Cidadão;