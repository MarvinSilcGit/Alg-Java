/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade.colegiado;

/**
 *
 * @author belogo
 */

import java.util.Date;

import java.util.ArrayList;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Professor extends Funcionario
{
   private double salarioHora;
    
   private ArrayList disciplinasLecionadas = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public enum Titulacao
   {
      MESTRE,
      DOUTOR,
      DOUTORA,
      GRADUADO,
      GRADUADA;
   }//Fim do enum Titulacao do objeto do tipo Professor;
   
   public Professor()
   {
    
   }//Fim do método construtor padrão;
    
   public Professor (String nome, int cpf, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone, double salarioHora)
   {    
      super (nome, cpf, setor, dataAdmissao, email, endereco, telefone);
      
      //Fim do método Super da classe mãe ou superclasse Funcionario, inicializando o seu segundo método construtor personalizado; 
        
      this.salarioHora = salarioHora;    
   }//Fim do método construtor personalizado;
    
   public final double retornarSalarioHora()
   {    
      return salarioHora;
   }//Fim do método que retorna o salario hora do objeto do tipo Professor;
    
   public final void alterarSalarioHora (double novoSalarioHora)
   {  
      salarioHora = novoSalarioHora;
   }//Fim do método que altera o salario hora do objeto do tipo Professor;
   
}//Fim da classe Professor;