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
import br.com.dominio.api.Endereco;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ProfissionalEnfermagem_UTI extends ProfissionalEnfermagem
{
   
   public ProfissionalEnfermagem_UTI()
   {
      
   }//Fim do método construtor padrão;
   
   public ProfissionalEnfermagem_UTI (String email, Endereco endereco, float salario, String setor, Date dataAdmissao, String coren)
   {
      super ();
      
      //Fim do método super da classe mãe ou super classe ProfissionalEnfermagem, inicializando o seu método construtor personalizado; 
      
   }//Fim do método construtor personalizado;
   
}//Fim da clase ProfissionalEnfermagem_UTI;