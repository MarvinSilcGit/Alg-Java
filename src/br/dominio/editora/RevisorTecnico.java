/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.editora;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.api.Acesso;


//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

public class RevisorTecnico extends Funcionario
{
   
   public RevisorTecnico()
   {
      
   }//Fim do método construtor padrão;
   
   public RevisorTecnico(String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, String condicaoCivil, double salario, String setor, Date dataAdmissao, Acesso conta)
   {
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe RevisorTecnico;