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

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Professor extends Funcionario
{
   private double salarioHora;
    
   private ArrayList disciplinasLecionadas = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public Professor()
   {
    
   }//Fim do método construtor padrão;
    
   public Professor(String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco, String setor, String cargo, Date dataAdmissao, Acesso conta, double salarioHora)
   {    
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, setor, cargo, dataAdmissao, conta);
      //Fim do método Super da classe mãe ou superclasse Funcionario, inicializando um de seus contrutores; 
        
      this.salarioHora=salarioHora;    
   }//Fim do método construtor personalizado;
    
   public double retornarSalarioHora()
   {    
      return this.salarioHora;
   }//Fim do método que retorna o salario hora do objeto do tipo Professor;
    
   public void alterarSalarioHora(double alterarSalárioHora)
   {  
      this.salarioHora=alterarSalárioHora;
   }//Fim do método que altera o salario hora do objeto do tipo Professor;
   
}//Fim da classe Professor;