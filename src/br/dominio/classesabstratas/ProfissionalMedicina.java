/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.classesabstratas;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.classesabstratas.Endereco;
import br.dominio.classesabstratas.Funcionario;
import br.dominio.classesabstratas.Acesso;
import br.dominio.classesabstratas.Telefone;
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
     
   public ProfissionalMedicina(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, String setor, Date dataAdmissao, Acesso conta, String crm, double valorConsulta)
   {    
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, setor, dataAdmissao, conta);
        
      this.crm=crm;
        
      this.valorConsulta=valorConsulta;
   }//Fim do método construtor personalizado;
    
   public String retornarCrm()
   {  
      return this.crm;
   }

   public double retornarValorConsulta()
   {    
      return this.valorConsulta;
   }
    
   public void alterarValorConsulta(double novoValorConsulta)
   {     
      this.valorConsulta=novoValorConsulta;
   }
    
   public ArrayList retornarListaPacientes()
   {
      return this.listaPacientes;
   }
  
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
    }
    
   public void removerPacientesLista(Paciente removerPaciente)
   {    
       this.listaPacientes.remove(removerPaciente);
   }
    
   public abstract void realizarConsulta();
    
}//Fim da classe ProfissionalMedicina;