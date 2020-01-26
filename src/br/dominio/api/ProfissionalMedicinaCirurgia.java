/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.api;

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
   
   
   public ProfissionalMedicinaCirurgia (String nome, int cpf, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone, int crm, float valorConsulta, float valorCirurgia)
   {
      super(nome, cpf, setor, dataAdmissao, email, endereco, telefone, crm, valorConsulta);
      
      
      this.valorCirurgia = valorCirurgia;
   }//Fim do método construotr personalizado; 
   
}//Fim da clase ProfissionalMedicinaCirurgia;