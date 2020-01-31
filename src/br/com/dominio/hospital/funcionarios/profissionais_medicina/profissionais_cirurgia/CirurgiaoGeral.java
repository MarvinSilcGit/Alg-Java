/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.hospital.funcionarios.profissionais_medicina.profissionais_cirurgia;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.com.dominio.api.ProfissionalMedicinaCirurgia;

import br.com.dominio.api.Endereco;

import br.com.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class CirurgiaoGeral extends ProfissionalMedicinaCirurgia
{
   
   public CirurgiaoGeral()
   {
      
   }//Fim do método construtor padrão;
   
   public CirurgiaoGeral (String nome, int cpf, Date dataNascimento, float salario, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone, int crm, float valorCirurgia)
   {
     super (nome, cpf, dataNascimento, salario, setor, dataAdmissao, email, endereco, telefone, crm, valorCirurgia);
      
      //Fim do método super da classe mãe ou super classe ProfissionalMedicinaCirurgia, inicializando seu método construtor personalizado;
      
   }//Fim do método construtor personalizado;

   @Override
   public void realizarConsulta()
   {
      
   }   
   
   @Override
   public void realizarCirurgia()
   {
      
   }
   
}//Fim da classe CirurgiaoGeral;