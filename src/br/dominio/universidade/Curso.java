/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade;

import java.util.ArrayList;

/**
 *
 * @author belogo
 */

public class Curso 
{
   private String nome;
   
   private int numeroMaximoSemestres, numeroMinimoSemestres;
   
   private double mensalidade, valorTotal;
   
   private ArrayList listaDisciplinas = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public Curso()
   {
      
   }//Fim do método construtor padrão;
   
   public Curso(String nome, int numeroMaximoSemestres, int numeroMinimoSemestres, double mensalidade, double valorTotal)
   {
      this.nome=nome;
      
      this.numeroMaximoSemestres=numeroMaximoSemestres;
      
      this.numeroMinimoSemestres=numeroMinimoSemestres;
      
      this.mensalidade=mensalidade;
      
      this.valorTotal=valorTotal;
   }//Fim do método construtor personalizado;
   
   public String retornarNome()
   {
      return this.nome;
   }//Fim do método que retorna o nome do curso;
   
   public int retornarNumeroMaximoSemestres()
   { 
      return this.numeroMaximoSemestres;
   }//Fim do método que retorna o número máximo de semestres para o objeto do tipo Curso;
    
   public void alterarNumeroMaximoSemestres(int novoMaximo)
   {     
      this.numeroMaximoSemestres=novoMaximo;
   }//Fim do método que altera o número máximo de semestres para o objeto do tipo Curso;
    
   public int retornarNumeroMinimoSemestres()
   { 
      return this.numeroMinimoSemestres;
   }//Fim do método que retorna o número mínimo de semestres para o objeto do tipo Curso;
    
   public void alterarNumeroMinimoSemestres(int novoMinimo)
   {     
      this.numeroMinimoSemestres=novoMinimo;
   }//Fim do método que altera o número mínimo de semestre para o objeto do tipo Curso;
       
   public ArrayList retornarListaDisciplinas()
   {   
      return this.listaDisciplinas;
   }//Fim do método que retorna a lista de disciplinas do objeto do tipo Curso;
    
   public void inserirDisciplinaColegiado(Disciplina novaDisciplina)
   {   
      this.listaDisciplinas.add(novaDisciplina);
   }//Fim do método que insere um objeto do tipo Disciplina na lista do objeto do tipo Curso;
    
   public void removerDisciplinaColegiado(Disciplina removerDisciplina)
   {       
      this.listaDisciplinas.remove(removerDisciplina);
   }//Fim do método que remove um objeto do tipo disciplina da lista do objeto do tipo Curso;
   
}//Fim da classe Curso;