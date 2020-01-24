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

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ProfissionalEnfermagem_Neonatal_Pediatrica extends ProfissionalEnfermagem
{
   
   public ProfissionalEnfermagem_Neonatal_Pediatrica()
   {
      
   }//Fim do método construtor padrão;
   
   public ProfissionalEnfermagem_Neonatal_Pediatrica (String email, Endereco endereco, float salario, String setor, Date dataAdmissao, String coren)
   {
      super();
      
      //Fim do método super da classe mãe ou super classe ProfissionalEnfermagem, inicializando o seu método construtor personalizado;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe ProfissionalEnfermagem_Neonatal_Pediatrica;