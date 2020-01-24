/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.hospital.farmacia;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ProfissionalFarmacia extends Funcionario
{
   private String crf;
   
   //Fim do campo de declaração de atributos;
   
   
   public ProfissionalFarmacia()
   {
      
   }//Fim do método construtor padrão;
   
   public ProfissionalFarmacia(String email, Endereco endereco, float salario, String setor, Date dataAdmissao, String crf)
   {
      super();
      
      //Fim do método super da classe mãe ou super classe Funcionario, inicializando o seu primeiro método contrutor personalizado;
      
      this.crf = crf;
   }//Fim do método construtor personalizado;
   
   public String retornarCrf()
   {
      return crf;
   }//Fim do método que retorna o crf do objeto do tipo Farmaceutico;
   
}//Fim da classe ProfissionalFarmacia;