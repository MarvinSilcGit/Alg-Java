package br.dominio.classesabstratas;


import java.util.ArrayList;

import java.util.Date;

import br.dominio.hospital.Paciente;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class ProfissionalEnfermagem  extends Funcionario
{  
   private ArrayList listaPacientes = new ArrayList(15);
   
   private int quantidadePlantoesSemana;
    
   private String coren,
            especialidade;
   
   //Fim do campo de declaração de atributos;
    
    
   public ProfissionalEnfermagem()
   {
        
   }//Fim do método construtor padrão;
    
   public ProfissionalEnfermagem(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, Date dataAdmissao, Acesso conta, int quanitadePlantoesSemana, String coren, String especialidade)
   {  
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, salario, setor, dataAdmissao, conta);        
        
      //Fim do método super da classe mãe ou super classe Funcionario;
      
      this.quantidadePlantoesSemana=quanitadePlantoesSemana;
       
      this.coren=coren;
        
      this.especialidade=especialidade;
   }//Fim do método construtor padrão;
    
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