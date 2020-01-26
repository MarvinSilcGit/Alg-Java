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
import br.com.dominio.api.Endereco;;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ProfissionalEnfermagem_Cardiologia extends ProfissionalEnfermagem
{
   
   public ProfissionalEnfermagem_Cardiologia()
   {
      
   }//Fim do método constutor padrão;
   
   public ProfissionalEnfermagem_Cardiologia(String email, Endereco endereco, float salario, String setor, Date dataAdmissao, String coren)
   {
      super();
      
      //Fim do método super da classe mãe ou super classe ProfissionalEnfermagem, inicializando o seu método construtor personalizado;
      
   }//Fim do método construtor personalizado;
   
}//Fim da clsse ProfissionalEnfermagem_Cardiologia_Hermodinamica;