package br.dominio.api;


import java.util.ArrayList;

import java.util.Date;

import br.dominio.hospital.Paciente;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class ProfissionalEnfermagem  extends Funcionario
{  
   private ArrayList listaPacientes = new ArrayList(15);
   
   private int quantidadePlantoesSemana;
    
   private String coren;
   //Colocar lista de pacientes atendidos;
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
   }//Fim do método construtor padrão;
    
   public int retornarQuantidadePlantoesSemana()
   {    
      return this.quantidadePlantoesSemana;
   }//Fim do método que retorna a quantidade de plantões do objeto do tipo ProfissionalEnfermagem;
    
   public String retornarCoren()
   { 
      return this.coren;
   }//Fim do método que retorna o Coren do objeto do tipo ProfissionalEnfermagem;
    
   public ArrayList retornarListaPacientes()
   { 
      return this.listaPacientes;
   }//Fim do método que retorna a lista de pacientes do objeto do tipo ProfissionalEnfermagem;
    
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
   }//Fim do método que insere paciente na lista do objeto do tipo ProfissionalEnfermagem;
    
   public void removerPacienteLista(Paciente remover)
   {     
      this.listaPacientes.remove(remover);
   }//Fim do método que remove paciente da lista do objeto do tipo ProfisionalEnfermagem;
    
}//Fim da classe ProfissionalEnfermagem;