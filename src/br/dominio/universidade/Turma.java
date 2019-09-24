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
   
   private ArrayList listaTurma = new ArrayList();
   
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
   }//Fim do método que altera o professor Responsavel do objeto do tipo Turma;
   
   public ArrayList retornarListaTurma()
   {
      return this.listaTurma;
   }//Fim do método que retorna a lista do objeto do tipo Turma;
   
   public void inserirEstudanteTurma(Estudante novoEstudante)
   {
      this.listaTurma.add(novoEstudante);
   }//Fim do método que insere um objeto do tipo Estudante na lista do objeto do tipo Turma;
   
   public void removerEstudanteTurma(Estudante removerEstudante)
   {
      this.listaTurma.remove(removerEstudante);
   }//Fim do método que remove um objeto do tipo Estudante da lista do objeto do tipo Turma;
}