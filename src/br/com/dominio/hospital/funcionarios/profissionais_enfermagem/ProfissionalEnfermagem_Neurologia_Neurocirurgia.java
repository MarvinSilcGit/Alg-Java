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


public final class ProfissionalEnfermagem_Neurologia_Neurocirurgia extends ProfissionalEnfermagem
{
   
   public ProfissionalEnfermagem_Neurologia_Neurocirurgia()
   {
      
   }//Fim do método construtor padrão;
   
   public ProfissionalEnfermagem_Neurologia_Neurocirurgia (String nome, int cpf, Date dataNascimento, float salario, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone, String coren)
   {
      super (nome, cpf, dataNascimento, salario, setor, dataNascimento, email, endereco, telefone, coren);
       
      //Fim do método super da classe mãe ou super classe ProfissionalEnfermagem, inicializando o seu método construtor personalizado;
   
   }//Fim do método construtor personalizado;
   
}//Fim da classe ProfissionalEnfermagem_Neurologia_Neurocirurgia;