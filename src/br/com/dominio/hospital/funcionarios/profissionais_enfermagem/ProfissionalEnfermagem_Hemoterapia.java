/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.hospital.funcionarios.profissionais_enfermagem;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.com.dominio.api.Endereco;

import br.com.dominio.api.Telefone;

import br.com.dominio.api.ProfissionalEnfermagem;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ProfissionalEnfermagem_Hemoterapia extends ProfissionalEnfermagem
{
   
   public ProfissionalEnfermagem_Hemoterapia()
   {
      
   }//Fim do método construtor padrã́o;
   
   public ProfissionalEnfermagem_Hemoterapia  (String nome, int cpf, Date dataNascimento, float salario, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone, String coren)
   {
      super (nome, cpf, dataNascimento, salario, setor, dataNascimento, email, endereco, telefone, coren);
      
      //Fim do métod super da classe ou super classe ProfissionalEnfermagem, inicializando o seu método construtor personalizado;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe ProfissionalEnfermagem_Hemoterapia;