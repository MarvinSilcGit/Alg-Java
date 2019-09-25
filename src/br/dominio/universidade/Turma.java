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
   //Fim do campo de declaração de atributos;
   
   
   public Turma()
   {
      
   }//Fim do método construtor padrão;
   
   public Turma(String periodo, Professor professorResponsavel, SalaAula sala)
   {
      this.periodo=periodo;
      
      this.professorResponsavel=professorResponsavel;
      
      this.sala=sala;
   }//Fim do método construtor personalizado;
    
   public String retornarPeriodo()
   {
      return this.periodo;
   }//Fim do método que retorna o período do objeto do tipo Turma;
   
   public Professor retornarProfessorResponsavel()
   { 
      return this.professorResponsavel;
   }//Fim do método que retorna o professor Responsavel do objeto do tipo Turma;
    
   public void alterarProfessorResponsavel(Professor novoProfessor)
   {
      this.professorResponsavel=novoProfessor;
   }//Fim do método que altera o professor Responsavel do objeto do tipo Turma;
   
   public SalaAula retornarSalaTurma()
   {
      return this.sala;
   }//Fim do método que retorna um objeto do tipo Sala para o objeto do tipo Turma;
   
   public void alterarSalaTurma(SalaAula novaSala)
   {
      this.sala=novaSala;
   }//Fim do método que altera o objeto do tipo Sala do objeto do tipo Turma;
   
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
   
}//Fim da classe Turma;