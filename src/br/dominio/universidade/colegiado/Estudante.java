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

import java.util.HashMap;

import java.util.Map;

import br.dominio.api.Pessoa;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Estudante extends Pessoa
{ 
   private int horasExtras,
           matricula;
   
   private static final int horasExtrasMinimas = 300;
    
   private double descontoFiesProUni;
   
   private Turma turma;
    
   private Acesso conta;
    
   private ArrayList disciplinasCursando = new ArrayList(6);
    
   private ArrayList disciplinasCursadas = new ArrayList(40);
   
   private Map <String, Integer> certificados = new HashMap <String, Integer>();
   
   private Date anoMatricula;
    
   //Fim do campo de declaração de atributos;
    
    
   public Estudante()
   {    
    
   }//Fim do método construtor padrão;
    
   public Estudante(String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, int horasExtras, int matricula, double descontoFiesProUni, Turma turma, Acesso conta, Date anoMatricula)
   {    
      super(nome, nascimento, cpf, email, telefone, endereco);
        
      //Fim do método Super da classe mãe ou superclasse Pessoa, inicializando o seu método construtor personalizado;
     
      this.horasExtras = horasExtras;
        
      this.matricula = matricula;
      
      this.descontoFiesProUni = descontoFiesProUni; 
      
      this.turma = turma;
        
      this.conta = conta;
      
      this.anoMatricula = anoMatricula;
   }//Fim do método construtor personalizado;
    
   public final int retornarHorasExtras()
   {
      return horasExtras;
   }//Fim do método que retorna as horas extras do objeto do tipo Estudante;
    
   public final void aumentarHorasExtras (int valor)
   {  
      horasExtras+= valor;
   }//Fim do método que aumenta as horas extras do objeto do tipo Estudante;
    
   public final void diminuirHorasExtras (int valor)
   {
      horasExtras-= valor;
   }//Fim do método que diminui as horas extras do objeto do tipo Estudante;
    
   public final int retornarMatrícula()
   {
      return matricula;
   }//Fim do método que retorna a matrícula do objeto do tipo Estudante;
    
   public final int retornarHorasExtrasMinimas()
   {
      return horasExtrasMinimas;
   }//Fim do método que retorna as horas extras mínimas da classe Estudante;
   
   public final double retornarDescontoFiesProUni()
   {
      return descontoFiesProUni;
   }//Fim do método que retorna o desconto Fies ou ProUni do objeto do tipo Estudante;
   
   public final Turma retornarTurma()
   {
      return turma;
   }//Fim do método que retorna o objeto do tipo Turma do objeto do tipo Estudante;
    
   public final Acesso acessarContaAcesso()
   {
      return conta;
   }//Fim do método que acessa o objeto do tipo Conta do objeto do tipo Estudante;
  
   public final Date retornarAnoMatricula()
   {
      return anoMatricula;
   }//Fim do método que retorna o ano de matrícula do objeto do tipo Estudante;
   
   public final ArrayList retornarDisciplinasCursando()
   {      
      return disciplinasCursando;
   }//Fim do método que retorna o objeto do tipo Disciplinas cursando da lista do objeto do tipo Estudante;
    
   public final void inserirDisciplinaCursando (Disciplina novaDisciplina)
   {
      if(disciplinasCursadas.contains (novaDisciplina))
      {
         System.out.println ("Esta disciplina já foi cursada");
      }
      else
      {
         disciplinasCursando.add (novaDisciplina);
      }
   }//Fim do método que insere o objeto do tipo Disciplina na lista do objeto do tipo Estudante;
   
   public final void removerDisciplinaCursando (Disciplina disciplina)
   {
      disciplinasCursando.remove (disciplina);
   }//Fim do método que remove o objeto do tipo Disciplina da lista do objeto do tipo Estudante;
   
   public final ArrayList retornarDisciplinasCursadas()
   {   
      return disciplinasCursadas;
   }//Fim do método que retorna os objetos do tipo Disciplina da lista de disciplina cursadas do objeto do tipo Estudante;
    
   public final void inserirDisciplinasCursadas (Disciplina novaDisciplina)
   {
      disciplinasCursadas.add (novaDisciplina);
   }//Fim do método que insere o objeto do tipo Disciplina na lista de disciplinas cursadas do objeto do tipo Estudante;
   
   public final void removerDisciplinasCursadas (Disciplina removerDisciplina)
   {
      disciplinasCursadas.remove (removerDisciplina);
   }//Fim do método que remove o objeto do tipo Disciplina da lista de disciplinas cursadas do objeto do tipo Estudante;
   
   public final Map RetornarListaCertificados()
   {
      return certificados;
   }//Fim do método que retorna a lista de certificados do objeto do tipo Estudante;
   
   public final void removerCertificado (String nomeCurso)
   {
      certificados.remove (nomeCurso);
   }//Fim do método que remove informações do certificado do HashMap do objeto do tipo Estudante;
   
}//Fim da classe Estudante;