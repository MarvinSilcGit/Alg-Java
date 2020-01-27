/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.hospital.funcionarios.profissionais_medicina.profissionais_tratamento;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.com.dominio.api.Endereco;

import br.com.dominio.api.Telefone;

import br.com.dominio.api.ProfissionalMedicina;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java


public class Ortopedista extends ProfissionalMedicina
{
   
   public Ortopedista()
   {
      
   }//Fim do método construtor padrão;
   
   public Ortopedista (String nome, int cpf, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone, int crm, float valorConsulta)
   {
      super (nome, cpf, setor, dataAdmissao, email, endereco, telefone, crm, valorConsulta);
      
      //Fim do método super da classe mãe ou super classe ProfissionalMedicina;
      
   }//Fim do método construtor personalizado;
  
}//Fim da classe Ortopedista;