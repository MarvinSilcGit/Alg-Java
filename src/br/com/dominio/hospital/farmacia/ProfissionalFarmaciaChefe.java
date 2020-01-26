/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.hospital.farmacia;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.com.dominio.api.ProfissionalFarmacia;
import br.com.dominio.api.Endereco;
import br.com.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ProfissionalFarmaciaChefe extends ProfissionalFarmacia
{
   
   public ProfissionalFarmaciaChefe()
   {
      
   }//Fim do método construtor padrão;
   
   public ProfissionalFarmaciaChefe (String nome, int cpf, float salario, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone, int crf)
   {
      super (nome, cpf, salario, setor, dataAdmissao, email, endereco, telefone, crf);
      
      //Fim do método super da classe mãe ou super classe ProfissionalFarmacia;
      
   }//Fim do método constutor personalizado;
   
}//Fim da classe ProfissionalFarmaciaChefe;