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

import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Turma 
{  
   private ArrayList listaEstudantes = new ArrayList(30);
   
   private Date anoTurma;
   
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
   
   public Turma(Date anoTurma)
   {
      this.anoTurma = anoTurma;
   }//Fim do método construtor personalizado;
   
   public Date retornarAnoTurma()
   {
      return anoTurma;
   }//Fim do método que retorna o ano da turma do objeto do tipo Turma;
   
   public ArrayList retornarListaEstudantesTurma()
   {
      return listaEstudantes;
   }//Fim do método que retorna a lista do objeto do tipo Turma;
   
   public void inserirEstudanteTurma (Estudante novoEstudante)
   {
      listaEstudantes.add (novoEstudante);
   }//Fim do método que insere um objeto do tipo Estudante na lista do objeto do tipo Turma;
   
   public void removerEstudanteTurma (Estudante removerEstudante)
   {
      listaEstudantes.remove (removerEstudante);
   }//Fim do método que remove um objeto do tipo Estudante da lista do objeto do tipo Turma;
   
}//Fim da classe Turma;