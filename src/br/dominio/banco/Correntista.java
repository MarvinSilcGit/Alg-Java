package br.dominio.banco;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.api.Endereco;

import br.dominio.api.Funcionario;

import br.dominio.api.Telefone;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Correntista extends Funcionario
{   
   private ArrayList listaClienteFisico = new ArrayList (15);
    
   private ArrayList listaClienteJuridico = new ArrayList (15);
    
   public Correntista()
   {     
    
   }//Fim do método construtor padrão;
    
   public Correntista(String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, double salario, String setor, Date dataAdmissao, Acesso conta)
   {     
      super(nome, nascimento, cpf, email, telefone, endereco, salario, setor, dataAdmissao, conta);
   
      //Fim do método super da classe mãe ou super classe Funcionário;
   
   }//Fim do método que construtor personalizado;
    
   public ArrayList retornarListaClienteFisico()
   { 
      return this.listaClienteFisico;
   }//Fim do método que retorna a lista do objeto do tipo Correntista;
    
   public ArrayList retornarListaCLienteJuridico()
   {     
      return this.listaClienteJuridico;
   }//Fim do método que retorna a lista do objeto do tipo Correntista;
    
   public void inserirCLienteFisico(String inserirCPF)
   { 
      this.listaClienteFisico.add(inserirCPF);
   }//Fim do método que insere ClienteFisico na lista do objeto do tipo Correntista;
    
   public void removerClienteFisico(String removerCPF)
   { 
      this.listaClienteFisico.remove(removerCPF);
   }//Fim do método que remove ClienteFisico da lista do objeto do tipo Correntista;
    
   public void inserirClienteJuridico(String inserirCNPJ)
   { 
      this.listaClienteJuridico.add(inserirCNPJ);
   }//Fim do método que insere ClienteJuridico na lista do objeto do tipo Correntista;
    
   public void removerClienteJuridico(String removerCNPJ)
   { 
      this.listaClienteJuridico.remove(removerCNPJ);
   }//Fim do método que remove ClienteJuridico da lista do objeto do tipo Correntista;
    
}//Fim da classe Correntista;