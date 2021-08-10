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


public class Traumatologista extends ProfissionalMedicina
{
   
   public Traumatologista()
   {
      
   }//Fim do método construtor padrão;
   
   public Traumatologista (String nome, int cpf, Date dataNascimento, float salario, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone, int crm)
   {
      super (nome, cpf,dataNascimento, salario, setor, dataAdmissao, email, endereco, telefone, crm);
      
      //Fim do método super da classe mãe ou super classe ProfissionalMedicina, imicializando o seu método construtor personalizado;
      
   }//Fim do método construtor personalizado;
   
   @Override
   public void realizarConsulta()
   {
      
   }   
   
}//Fim da classe Traumatologista;