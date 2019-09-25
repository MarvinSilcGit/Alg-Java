/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade;

/**
 *
 * @author belogo
 */

import java.util.Date;

import java.util.ArrayList;

import br.dominio.banco.Acesso;


public class Professor extends Funcionario
{
   private double salarioHora;
    
   private ArrayList disciplinasLecionadas = new ArrayList();
    
   public Professor()
   {
    
   }
    
   public Professor(String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta, double salarioHora, int quantidadeDisciplinas)
   {    
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, salario, setor, cargo, dataAdmissao, conta);
      //Fim do método Super da classe mãe ou superclasse Funcionario, inicializando um de seus contrutores; 
        
      this.salarioHora=salarioHora;    
   }//Fim do método construtor personalizado;
    
   public double retornarSalarioHora()
   {    
      return this.salarioHora;
   }
    
   public void alterarSalarioHora(double alterarSalárioHora)
   {  
      this.salarioHora=alterarSalárioHora;
   }
   
}//Fim da classe Professor;