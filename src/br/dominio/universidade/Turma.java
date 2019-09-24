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
   
   private ArrayList listaEstudantes = new ArrayList();
   
   private Professor professorResponsavel;
   
   private SalaAula sala;
   
   
   public Turma()
   {
      
   }
   
   public Turma(String periodo, Professor professorResponsavel, SalaAula sala)
   {
      this.periodo=periodo;
      
      this.professorResponsavel=professorResponsavel;
      
      this.sala=sala;
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
   
   public SalaAula retornarSalaTurma()
   {
      return this.sala;
   }
   
   public void alterarSalaTurma(SalaAula novaSala)
   {
      this.sala=novaSala;
   }
   
   public ArrayList retornarListaEstudante()
   {
      return this.listaEstudantes;
   }//Fim do método que retorna a lista do objeto do tipo Turma;
   
   public void inserirEstudanteTurma(Estudante novoEstudante)
   {
      this.listaEstudantes.add(novoEstudante);
   }//Fim do método que insere um objeto do tipo Estudante na lista do objeto do tipo Turma;
   
   public void removerEstudanteTurma(Estudante removerEstudante)
   {
      this.listaEstudantes.remove(removerEstudante);
   }//Fim do método que remove um objeto do tipo Estudante da lista do objeto do tipo Turma;
}