/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.api;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.hospital.Paciente;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class ProfissionalMedicina extends Funcionario
{  
   private ArrayList listaPacientes = new ArrayList(15);
    
   private String crm;
    
   private double valorConsulta;
          
   private static final int quantidadePlantoesSemana = 2;
   
   //Fim do campo de declaração de atributos;
    
     
   public ProfissionalMedicina() 
   {
        
   }//Fim do método construtor padrão;
     
   public ProfissionalMedicina (String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, String setor, Date dataAdmissao, Acesso conta, String crm, double valorConsulta)
   {    
      super (nome, nascimento, cpf, email, telefone, endereco, setor, dataAdmissao, conta);
        
      this.crm = crm;
        
      this.valorConsulta = valorConsulta;
   }//Fim do método construtor personalizado;
    
   public final String retornarCrm()
   {  
      return crm;
   }//Fim do método que retorna o Crm do objeto do tipo ProfissionalMedicina;

   public final double retornarValorConsulta()
   {    
      return valorConsulta;
   }//Fim do método que retorna o valor da consulta do objeto do tipo ProfissionalMedicina;
    
   public final void alterarValorConsulta (double novoValorConsulta)
   {     
      valorConsulta = novoValorConsulta;
   }//Fim do método que altera o valor da consulta do objeto do tipo ProfissionalMedicina;
    
   public final int retornarQuantidadePlantoesSemana()
   {
      return quantidadePlantoesSemana;
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
    
   public abstract void realizarConsulta();//Fim do método abstrato que será implementado pelas sub classes;
    
}//Fim da classe ProfissionalMedicina;