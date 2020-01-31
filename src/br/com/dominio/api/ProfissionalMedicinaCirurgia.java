/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.api;

/**
 *
 * @author belogo
 */

import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class ProfissionalMedicinaCirurgia extends ProfissionalMedicina
{
   private float valorCirurgia;
   
   //Fim do campo de declaração de atributos;
   
   public ProfissionalMedicinaCirurgia()
   {
      
   }//Fim do método construtor personalizado;
   
   public ProfissionalMedicinaCirurgia (String nome, int cpf, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone, int crm, float valorConsulta, float valorCirurgia)
   {
      super(nome, cpf, setor, dataAdmissao, email, endereco, telefone, crm, valorConsulta);
      
      //Fim do método super da classe mãe ou super classe ProfissionalMedicina;
      
      this.valorCirurgia = valorCirurgia;
   }//Fim do método construotr personalizado;
   
   public float retornarValorCirurgia()
   {
      return valorCirurgia;
   }//Fim do método que retorna a valor da cirurgia do objeto do tipo ProfissionalMedicinaCirurgia;
   
   public abstract void realizarCirurgia();
   
}//Fim da clase ProfissionalMedicinaCirurgia;