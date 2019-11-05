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
        
   //Fim do campo de declaração de atributos;
    
     
   public ProfissionalMedicina() 
   {
        
   }//Fim do método construtor padrão;
     
   public ProfissionalMedicina(String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, String condicaoCivil, String setor, Date dataAdmissao, Acesso conta, String crm, double valorConsulta)
   {    
      super(nome, nascimento, cpf, email, telefone, endereco, condicaoCivil, setor, dataAdmissao, conta);
        
      this.crm=crm;
        
      this.valorConsulta=valorConsulta;
   }//Fim do método construtor personalizado;
    
   public String retornarCrm()
   {  
      return this.crm;
   }//Fim do método que retorna o Crm do objeto do tipo ProfissionalMedicina;

   public double retornarValorConsulta()
   {    
      return this.valorConsulta;
   }//Fim do método que retorna o valor da consulta do objeto do tipo ProfissionalMedicina;
    
   public void alterarValorConsulta(double novoValorConsulta)
   {     
      this.valorConsulta=novoValorConsulta;
   }//Fim do método que altera o valor da consulta do objeto do tipo ProfissionalMedicina;
    
   public ArrayList retornarListaPacientes()
   {
      return this.listaPacientes;
   }//Fim do método que retorna a lista de pacientes do objeto do tipo ProfissionalMedicina;
  
   public void inserirPacientesLista(Paciente novoPaciente)
   {    
      if (this.listaPacientes.size() >= 15)
      {
         System.out.println("Não é mais possível alocar pacientes para este médico(a)");
      }
      else
      {      
         this.listaPacientes.add(novoPaciente);
      }
    }//Fim do método que insere paciente na lista do objeto do tipo ProfissionalMedicina;
    
   public void removerPacientesLista(Paciente removerPaciente)
   {    
       this.listaPacientes.remove(removerPaciente);
   }//Fim do método que remover paciente da lista do objeto do tipo ProfissionalMedicina;
    
   public abstract void realizarConsulta();//Fim do método abstrato que será implementado pelas sub classes;
    
}//Fim da classe ProfissionalMedicina;