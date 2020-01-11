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
           matricula,
           horasExtrasMinimas;
    
   private double descontoFiesProUni;
    
   private Acesso conta;
    
   private ArrayList disciplinasCursando = new ArrayList(6);
    
   private ArrayList disciplinasCursadas = new ArrayList(40);
   
   private Map <String, Integer> certificados = new HashMap <String, Integer>();
   
   private Date anoMatricula;
    
   //Fim do campo de declaração de atributos;
    
    
   public Estudante()
   {    
    
   }//Fim do método construtor padrão;
    
   public Estudante(String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, int horasExtras, int matricula, int horasExtrasMinimas, double descontoFiesProUni, Acesso conta, Date anoMatricula)
   {    
      super(nome, nascimento, cpf, email, telefone, endereco);
        
      //Fim do método Super da classe mãe ou superclasse Pessoa, inicializando o seu método construtor personalizado;
     
      this.horasExtras = horasExtras;
        
      this.matricula = matricula;
        
      this.horasExtrasMinimas = horasExtrasMinimas;
      
      this.descontoFiesProUni = descontoFiesProUni; 
        
      this.conta = conta;
      
      this.anoMatricula = anoMatricula;
   }//Fim do método construtor personalizado;
    
   public int retornarHorasExtras()
   {
      return horasExtras;
   }//Fim do método que retorna as horas extras do objeto do tipo Estudante;
    
   public void aumentarHorasExtras (int novoValor, long codigoCertificado)
   {  
      horasExtras+= novoValor;
   }//Fim do método que aumenta as horas extras do objeto do tipo Estudante;
    
   public void diminuirHorasExtras (int valor)
   {
      horasExtras-= valor;
   }//Fim do método que diminui as horas extras do objeto do tipo Estudante;
    
   public int retornarMatrícula()
   {
      return matricula;
   }//Fim do método que retorna a matrícula do objeto do tipo Estudante;
    
   public int retornarHorasExtrasMinimas()
   {
      return horasExtrasMinimas;
   }//Fim do método que retorna as horas extras mínimas do objeto do tipo Estudante;
   
   public double retornarDescontoFiesProUni()
   {
      return descontoFiesProUni;
   }//Fim do método que retorna o desconto Fies ou ProUni do objeto do tipo Estudante;
    
   public Acesso acessarContaAcesso()
   {
      return conta;
   }//Fim do método que acessa o objeto do tipo Conta do objeto do tipo Estudante;
  
   public Date retornarAnoMatricula()
   {
      return anoMatricula;
   }//Fim do método que retorna o ano de matrícula do objeto do tipo Estudante;
   
   public ArrayList retornarDisciplinasCursando()
   {      
      return disciplinasCursando;
   }//Fim do método que retorna o objeto do tipo Disciplinas cursando da lista do objeto do tipo Estudante;
    
   public void inserirDisciplinaCursando (Disciplina novaDisciplina)
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
   
   public void removerDisciplinaCursando (Disciplina disciplina)
   {
      disciplinasCursando.remove (disciplina);
   }//Fim do método que remove o objeto do tipo Disciplina da lista do objeto do tipo Estudante;
   
   public ArrayList retornarDisciplinasCursadas()
   {   
      return disciplinasCursadas;
   }//Fim do método que retorna os objetos do tipo Disciplina da lista de disciplina cursadas do objeto do tipo Estudante;
    
   public void inserirDisciplinasCursadas (Disciplina novaDisciplina)
   {
      disciplinasCursadas.add (novaDisciplina);
   }//Fim do método que insere o objeto do tipo Disciplina na lista de disciplinas cursadas do objeto do tipo Estudante;
   
   public void removerDisciplinasCursadas (Disciplina removerDisciplina)
   {
      disciplinasCursadas.remove (removerDisciplina);
   }//Fim do método que remove o objeto do tipo Disciplina da lista de disciplinas cursadas do objeto do tipo Estudante;
   
   public Map RetornarListaCertificados()
   {
      return certificados;
   }//Fim do método que retorna a lista de certificados do objeto do tipo Estudante;
   
   public void removerCertificado (String nomeCurso)
   {
      certificados.remove (nomeCurso);
   }//Fim do método que remove informações do certificado do HashMap do objeto do tipo Estudante;
   
}//Fim da classe Estudante;