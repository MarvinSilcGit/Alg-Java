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

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Turma 
{  
   private ArrayList listaEstudantes = new ArrayList();
   
   private Professor professorResponsavel;
   
   private SalaAula sala;
   
   //Fim do campo de declaração de atributos;
   
   
   public enum Periodo
   {
      _1,
      _2,
      _3,
      _4,
      _5,
      _6,
      _7,
      _8,
      _9,
      _10
   }//Fim do enum Periodo;
   
   public Turma()
   {
      
   }//Fim do método construtor padrão;
   
   public Turma(Professor professorResponsavel, SalaAula sala)
   {  
      this.professorResponsavel = professorResponsavel;
      
      this.sala = sala;
   }//Fim do método construtor personalizado;
   
   public Professor retornarProfessorResponsavel()
   { 
      return professorResponsavel;
   }//Fim do método que retorna o professor Responsavel do objeto do tipo Turma;
    
   public void alterarProfessorResponsavel(Professor novoProfessor)
   {
      professorResponsavel = novoProfessor;
   }//Fim do método que altera o professor Responsavel do objeto do tipo Turma;
   
   public SalaAula retornarSalaTurma()
   {
      return sala;
   }//Fim do método que retorna um objeto do tipo Sala para o objeto do tipo Turma;
   
   public void alterarSalaTurma(SalaAula novaSala)
   {
      sala = novaSala;
   }//Fim do método que altera o objeto do tipo Sala do objeto do tipo Turma;
   
   public ArrayList retornarListaEstudantesTurma()
   {
      return listaEstudantes;
   }//Fim do método que retorna a lista do objeto do tipo Turma;
   
   public void inserirEstudanteTurma(Estudante novoEstudante)
   {
      listaEstudantes.add(novoEstudante);
   }//Fim do método que insere um objeto do tipo Estudante na lista do objeto do tipo Turma;
   
   public void removerEstudanteTurma(Estudante removerEstudante)
   {
      listaEstudantes.remove(removerEstudante);
   }//Fim do método que remove um objeto do tipo Estudante da lista do objeto do tipo Turma;
   
}//Fim da classe Turma;