/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.hospital.profissionais_medicina;


import br.dominio.api.ProfissionalMedicina;

import java.util.Date;

import br.dominio.api.Endereco;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Pediatra  extends ProfissionalMedicina
{
   
   public Pediatra()
   {
      
   }//Fim do método construtor padrão;
   
   public Pediatra (String nome, Date nascimento, String cpf, String email, Endereco endereco, String setor, Date dataAdmissao, Acesso conta, String crm, double valorConsulta)
   {     
      super (nome, nascimento, cpf, email, endereco, setor, dataAdmissao, conta, crm, valorConsulta);   
         
      //Fim do método super da classe mãe ou super classe ProfissionalMedicina, inicializando o seu método construtor personalizado;
   
   }//Fim do método construtor personalizado;
   
   @Override
   public final void realizarConsulta()
   {
   
   }//Terminar esse polimorfismo;
    
}//Fim da classe Pediatra;