/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.hospital;


import java.util.Date;

import br.dominio.cadastro.Endereco;

import br.dominio.cadastro.Acesso;

import br.dominio.cadastro.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Pediatra  extends ProfissionalMedicina
{
   
   public Pediatra(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, String setor, Date dataAdmissao, Acesso conta, String crm, double valorConsulta)
   
   {     
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, setor, dataAdmissao, conta, crm, valorConsulta);   
   }
   
   @Override
   public void realizarConsulta()
   {
   
   }//Terminar esse polimorfismo;
    
}//Fim da classe Pediatra;