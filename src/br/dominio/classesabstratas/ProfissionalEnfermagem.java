package br.dominio.classesabstratas;


import java.util.ArrayList;

import java.util.Date;

import br.dominio.classesabstratas.Endereco;
import br.dominio.classesabstratas.Funcionario;
import br.dominio.classesabstratas.Acesso;
import br.dominio.classesabstratas.Telefone;
import br.dominio.hospital.Paciente;


public abstract class ProfissionalEnfermagem  extends Funcionario
{  
   private ArrayList listaPacientes = new ArrayList(15);
   
   private int quantidadePlantoesSemana;
    
   private String coren,
            especialidade;
    
    
   public ProfissionalEnfermagem()
   {
        
   }//Fim do método construtor padrão;
    
   public ProfissionalEnfermagem(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, Date dataAdmissao, Acesso conta, int quanitadePlantoesSemana, String coren, String especialidade)
   {  
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, salario, setor, dataAdmissao, conta);        
        
      this.quantidadePlantoesSemana=quanitadePlantoesSemana;
       
      this.coren=coren;
        
      this.especialidade=especialidade;
   }
    
   public int retornarQuantidadePlantoesSemana()
   {    
      return this.quantidadePlantoesSemana;
   }
    
   public String retornarCoren()
   { 
      return this.coren;
   }
    
   public String retornarEspecialidade()
   {    
      return this.especialidade;
   }
    
   public ArrayList retornarListaPacientes()
   { 
      return this.listaPacientes;
   }
    
   public void inserirPacienteLista(Paciente inserir)
   {     
      if (this.listaPacientes.size()>=15)
      {
         System.out.println("Não é possível alocar mais pacientes para este enfermeiro()");
      }
      else
      {
         this.listaPacientes.add(inserir);
      }
   }
    
   public void removerPacienteLista(Paciente remover)
   {     
      this.listaPacientes.remove(remover);
   }
    
}//Fim da classe ProfissionalEnfermagem;