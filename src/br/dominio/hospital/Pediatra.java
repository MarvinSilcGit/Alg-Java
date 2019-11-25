/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.hospital;


import br.dominio.api.ProfissionalMedicina;

import java.util.Date;

import br.dominio.api.Endereco;

import br.dominio.api.Acesso;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Pediatra  extends ProfissionalMedicina
{
   
   public Pediatra(String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, String setor, Date dataAdmissao, Acesso conta, String crm, double valorConsulta)
   {     
      super(nome, nascimento, cpf, email, telefone, endereco, setor, dataAdmissao, conta, crm, valorConsulta);   
         
      //Fim do método super da classe mãe ou super classe ProfissionalMedicina, inicializando seu construtor personalizado;
   
   }//Fim do método construtor personalizado;
   
   @Override
   public void realizarConsulta()
   {
   
   }//Terminar esse polimorfismo;
    
}//Fim da classe Pediatra;