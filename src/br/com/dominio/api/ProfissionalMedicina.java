/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.api;


import java.util.Date;

import java.util.ArrayList;

import br.com.dominio.hospital.Paciente;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class ProfissionalMedicina extends Funcionario
{  
   private ArrayList listaPacientes = new ArrayList(15);
    
   private int crm;
    
   private float valorConsulta;
          
   private static final int QUANTIDADE_PLANTOES_SEMANA = 1;
   
   //Fim do campo de declaração de atributos;
    
     
   public ProfissionalMedicina() 
   {
        
   }//Fim do método construtor padrão;
     
   public ProfissionalMedicina (String nome, int cpf, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone, int crm, float valorConsulta)
   {    
      super (nome, cpf, setor, dataAdmissao, email, endereco, telefone);
      
      //Fim do método super da classe mãe ou super classe Funcionario, inicializando o seu segundo método construtror personalizado;
        
      this.crm = crm;
        
      this.valorConsulta = valorConsulta;
   }//Fim do método construtor personalizado;
    
   public final int retornarCrm()
   {  
      return crm;
   }//Fim do método que retorna o Crm do objeto do tipo ProfissionalMedicina;

   public final float retornarValorConsulta()
   {    
      return valorConsulta;
   }//Fim do método que retorna o valor da consulta do objeto do tipo ProfissionalMedicina;
    
   public final int retornarQuantidadePlantoesSemana()
   {
      return QUANTIDADE_PLANTOES_SEMANA;
   }//Fim do método que retorna a quantidade de plantoes por semana do objeto do tipo ProfissionalMedicina;
   
   public final ArrayList retornarListaPacientes()
   {
      return listaPacientes;
   }//Fim do método que retorna a lista de pacientes do objeto do tipo ProfissionalMedicina;
  
   public final void inserirPacientesLista (Paciente novoPaciente)
   {    
      if (listaPacientes.size() >= 15)
      {
         System.out.println("Não é mais possível alocar pacientes para este médico(a)");
      }
      else
      {      
         listaPacientes.add (novoPaciente);
      }
    }//Fim do método que insere paciente na lista do objeto do tipo ProfissionalMedicina;
    
   public final void removerPacientesLista (Paciente removerPaciente)
   {    
       listaPacientes.remove (removerPaciente);
   }//Fim do método que remover paciente da lista do objeto do tipo ProfissionalMedicina;
    
 //  public abstract void realizarConsulta();//Fim do método abstrato que será implementado pelas sub classes;
    
}//Fim da classe ProfissionalMedicina;