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

///Atributo para carga horária obrigatória;
import br.dominio.cadastro.Pessoa;

import br.dominio.cadastro.Endereco;

import br.dominio.cadastro.Telefone;

import java.util.Date;

import java.util.ArrayList;

import br.dominio.banco.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Estudante extends Pessoa
{ 
   private int horasExtras,
           codeMatricula;
    
   private double  descontoFiesProUni;
    
   private Acesso conta;
    
   private ArrayList listaBoletins = new ArrayList();
    
   private ArrayList disciplinasCursando = new ArrayList(6);
    
   private ArrayList disciplinasCursadas = new ArrayList(40);
    
   //Fim do campo de declaração de atributos;
    
    
   public Estudante()
   {    
    
   }//Fim do método construtor padrão;
    
   public Estudante(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, int horasExtras, int codeMatricula, double descontoFiesProUni, Acesso conta)
   {    
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil);
        
      //Fim do método Super da classe mãe ou superclasse Pessoa, inicializando um de seus construtores;
     
      this.horasExtras=horasExtras;
        
      this.codeMatricula=codeMatricula;
        
      this.descontoFiesProUni=descontoFiesProUni; 
        
      this.conta=conta;
   }//Fim do método construtor personalizado;
    
   public int retornarHorasExtras()
   {
      return this.horasExtras;
   }//Fim do método que retorna as horas extras do objeto do tipo Estudante;
    
   public void aumentarHorasExtras(int valor)
   {
      this.horasExtras+=valor;
   }//Fim do método que aumenta as horas extras do objeto do tipo Estudante;
    
   public void diminuirHoasExtras(int valor)
   {
      this.horasExtras-=valor;
   }//Fim do método que diminui as horas extras do objeto do tipo Estudante;
    
   public int retornarMatrícula()
   {
      return this.codeMatricula;
   }//Fim do método que retorna a matrícula do objeto do tipo Estudante;
    
   public double retornarDescontoFiesProUni()
   {
      return this.descontoFiesProUni;
   }//Fim do método que retorna o desconto Fies ou ProUni do objeto do tipo Estudante;
    
   public Acesso acessarContaAcesso()
   {
      return this.conta;
   }//Fim do método que acessa a conta do objeto do tipo Estudante;
    
   public ArrayList retornarDisciplinasCursando()
   {      
      return this.disciplinasCursando;
   }//Fim do método que retorna as disciplinas cursando da lista do objeto do tipo Estudante;
    
   public void inserirDisciplinaCursando(Disciplina novaDisciplina)
   {
      if(this.disciplinasCursadas.contains(novaDisciplina))
      {
         System.out.println("Esta disciplina já foi cursada");
      }
      else
      {
         this.disciplinasCursando.add(novaDisciplina);
      }
   }//Fim do método que insere disciplinas na lista para o objeto do tipo Estudante;
   
   public void removerDisciplinaCursando(Disciplina disciplina)
   {
      this.disciplinasCursando.remove(disciplina);
   }//Fim do método que remove disciplinas da lista do objeto do tipo Estudante;
   
   public ArrayList retornarDisciplinasCursadas()
   {   
      return this.disciplinasCursadas;
   }//Fim do método que retorna as disciplinas cursadas da lista do objeto do tipo Estudante;
    
   public void inserirDisciplinasCursadas()
   {
      
   }
   
}//Fim da classe Estudante;