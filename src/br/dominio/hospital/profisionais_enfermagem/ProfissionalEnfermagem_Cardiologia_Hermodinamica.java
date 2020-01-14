/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.hospital.profisionais_enfermagem;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.dominio.api.ProfissionalEnfermagem;
        
import br.dominio.api.Endereco;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class ProfissionalEnfermagem_Cardiologia_Hermodinamica extends ProfissionalEnfermagem
{
   
   
   public ProfissionalEnfermagem_Cardiologia_Hermodinamica()
   {
      
   }//Fim do método constutor padrão;
   
   public ProfissionalEnfermagem_Cardiologia_Hermodinamica(String nome, Date nascimento, String cpf, String email, Endereco endereco, double salario, String setor, Date dataAdmissao, Acesso conta, String coren)
   {
      super(nome, nascimento, cpf, email, endereco, salario, setor, dataAdmissao, conta, coren);
      
      //Fim do método super da classe mãe ou super classe ProfissionalEnfermagem, inicializando o seu método construtor personalizado;
      
   }//Fim do método construtor personalizado;
   
}//Fim da clsse ProfissionalEnfermagem_Cardiologia_Hermodinamica;