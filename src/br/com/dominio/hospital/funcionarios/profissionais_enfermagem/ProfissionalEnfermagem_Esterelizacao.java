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

import br.com.dominio.api.ProfissionalEnfermagem;

import br.com.dominio.api.Endereco;

import br.com.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ProfissionalEnfermagem_Esterelizacao extends ProfissionalEnfermagem
{
 
   public ProfissionalEnfermagem_Esterelizacao()
   {
      
   }//Fim do método construtor padrão;
   
   public ProfissionalEnfermagem_Esterelizacao  (String nome, int cpf, Date dataNascimento, float salario, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone, String coren)
   {
      super (nome, cpf, dataNascimento, salario, setor, dataNascimento, email, endereco, telefone, coren);
      
      //Fim do método super da classe mãe ou super classe ProfissionalMedicina, inicializando o seu método constutor personalizado;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe ProfissionalEnfermagem_Esterelizacao;