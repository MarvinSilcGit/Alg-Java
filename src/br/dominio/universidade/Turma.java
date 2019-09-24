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

import java.util.ArrayList;

public class Turma 
{
   
   private String periodo;
   
   private ArrayList listaAlunos = new ArrayList();
   
   private Professor professorResponsavel;
   
   public Turma()
   {
      
   }
   
   public Turma(String periodo, Professor professorResponsavel)
   {
      this.periodo=periodo;
      
      this.professorResponsavel=professorResponsavel;
   }
    
   public String retornarPeriodo()
   {
      return this.periodo;
   }
   
   public Professor retornarProfessorResponsavel()
   { 
      return this.professorResponsavel;
   }
    
   public void alterarProfessorResponsavel(Professor novoProfessor)
   {
      this.professorResponsavel=novoProfessor;
   }//Fim do método que altera o   
}