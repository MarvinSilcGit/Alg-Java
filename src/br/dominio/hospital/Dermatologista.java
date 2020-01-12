/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.hospital;


import java.util.Date;

import br.dominio.api.ProfissionalMedicina;

import br.dominio.api.Endereco;

import br.dominio.api.Acesso;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Dermatologista extends ProfissionalMedicina
{    
   
   public Dermatologista()
   {
      
   }//Fim do método construtor padrão;
   
   public Dermatologista (String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, String setor, Date dataAdmissao, Acesso conta, String crm, double valorConsulta)
   {    
      super (nome, nascimento, cpf, email, telefone, endereco, setor, dataAdmissao, conta, crm, valorConsulta);
      
      //Fim do método construtor super da classe mãe o super classe ProfissionalMedicina, inicilizando o método construtor personalizado; 
      
   }//Fim do método construtor personalizado;
   
   @Override
   public void realizarConsulta()
   {
      
   }//Terminar esse polimorfismo;
    
}//Fim da classe Dermatologista;