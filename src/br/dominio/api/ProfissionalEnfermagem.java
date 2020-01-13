package br.dominio.api;


import java.util.ArrayList;

import java.util.Date;

import br.dominio.hospital.Paciente;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class ProfissionalEnfermagem  extends Funcionario
{  
   private ArrayList listaPacientes = new ArrayList(15);
   
   private static final int quantidadePlantoesSemana  = 2;
    
   private String coren;
   //Colocar lista de pacientes atendidos;
   //Fim do campo de declaração de atributos;
    
    
   public ProfissionalEnfermagem()
   {
        
   }//Fim do método construtor padrão;
    
   public ProfissionalEnfermagem (String nome, Date nascimento, String cpf, String email, Endereco endereco, double salario, String setor, Date dataAdmissao, Acesso conta, String coren)
   {  
      super (nome, nascimento, cpf, email, endereco, salario, setor, dataAdmissao, conta);        
        
      //Fim do método super da classe mãe ou super classe Funcionario, inicializado seu primeiro método construtor;
       
      this.coren = coren;
   }//Fim do método construtor padrão;
    
   public final int retornarQuantidadePlantoesSemana()
   {    
      return quantidadePlantoesSemana;
   }//Fim do método que retorna a quantidade de plantões do objeto do tipo ProfissionalEnfermagem;
    
   public final String retornarCoren()
   { 
      return coren;
   }//Fim do método que retorna o Coren do objeto do tipo ProfissionalEnfermagem;
    
   public final ArrayList retornarListaPacientes()
   { 
      return listaPacientes;
   }//Fim do método que retorna a lista de pacientes do objeto do tipo ProfissionalEnfermagem;
    
   public final void inserirPacienteLista (Paciente inserir)
   {     
      if (listaPacientes.size() >= 15)
      {
         System.out.println("Não é possível alocar mais pacientes para este enfermeiro()");
      }
      else
      {
         listaPacientes.add(inserir);
      }
   }//Fim do método que insere paciente na lista do objeto do tipo ProfissionalEnfermagem;
    
   public final void removerPacienteLista (Paciente remover)
   {     
      listaPacientes.remove(remover);
   }//Fim do método que remove paciente da lista do objeto do tipo ProfisionalEnfermagem;
    
}//Fim da classe ProfissionalEnfermagem;