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

import br.dominio.api.Funcionario;

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Curso 
{
   private String nome;
   
   private double mensalidade;
   
   private Funcionario coordenador;
   
   private ArrayList <Professor> listaProfessores = new ArrayList(20);
   
   private ArrayList <Disciplina> listaDisciplinas = new ArrayList();
   
   private ArrayList <Turma> listaTurmas = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public enum Tipo
   {
      GRADUACAO,
      MESTRADO,
      DOUTORADO,
      TECNOLOGO;
   }//Fim do enum Tipo do objeto do tipo Curso;
   
   public enum Modalidade
   {
      PRESENCIAL,
      EAD,
      SEMI_PRESENCIAL
   }//Fim do num Modalidade do objeto do tipo Curso;
   
   public enum NumeroSemestres
   {
      QUATRO,
      OITO,
      CINCO,
      SEIS,
      DEZ,
      DOIS,
      TRES;
   }//Fim do enum NumeroSemestres;
   
   
   public Curso()
   {
      
   }//Fim do método construtor padrão;
   
   public Curso(String nome, double mensalidade)
   {
      this.nome = nome;
      
      this.mensalidade = mensalidade;
   }//Fim do método construtor personalizado;
   
   public String retornarNome()
   {
      return nome;
   }//Fim do método que retorna o nome para o objeto do tipo Curso;
       
   public double retornarMensalidade()
   {
      return mensalidade;
   }//Fim do método que retorna a mensalidade para o objeto do tipo Curso;
   
   public void alterarMensalidade (double alterarMensalidade)
   {
      mensalidade = alterarMensalidade;
   }//Fim do método que altera a mensalidade do objeto do tipo Curso;
   
   public Funcionario retornarCoordenadorCurso()
   {
      return coordenador;
   }//Fim do método que retorna o coordenador do objeto do tipo Curso;
   
   public void alterarCoordenadorCurso (Funcionario novoCoordenador)
   {
      coordenador = novoCoordenador;
   }//Fim do método que altera o coordenador do objeto do tipo Curso;
   
   public ArrayList retornarListaProfessores()
   {    
       return listaProfessores;
   }//Fim do método que retorna o objeto do tipo Professor da lista do objeto do tipo Cursoo;
    
   public void inserirProfessorColegiado (Professor novoProfessor)
   {    
       listaProfessores.add (novoProfessor);
   }//Fim do método que insere o objeto do tipo Professor na lista do objeto do tipo Curso;
    
   public void removerProfessorColegiado (Professor removerProfessor)
   {   
       listaProfessores.remove (removerProfessor);
   }//Fim do método que remove o objeto do tipo Professor da lista do objeto do tipo Curso; 
   
   public ArrayList retornarListaDisciplinasCurso()
   {   
      return listaDisciplinas;
   }//Fim do método que retorna o objeto do tipo Disciplina da lista do objeto do tipo Curso;
    
   public void inserirDisciplinaCurso (Disciplina novaDisciplina)
   {   
      listaDisciplinas.add (novaDisciplina);
   }//Fim do método que insere o objeto do tipo Disciplina na lista do objeto do tipo Curso;
    
   public void removerDisciplinaCurso (Disciplina removerDisciplina)
   {       
      listaDisciplinas.remove (removerDisciplina);
   }//Fim do método que remove o objeto do tipo Disciplina da lista do objeto do tipo Curso;
   
   public ArrayList retornarListaEstudantes()
   {
      return listaTurmas;
   }//Fim do método que retorna objeto do tipo Turma da lista do objeto do Curso;
   
   public void inserirTurmaLista (Turma turma)
   {
      listaTurmas.add (turma);
   }//Fim do método que insere o objeto do tipo Turma na lista do objeto do tipo Curso;
   
   public void removerEstudanteLista (Estudante removerEstudante)
   {
      
   }//Fim do método que remove o objeto do tipo Estudante da lista do objeto do tipo Curso;
   
}//Fim da classe Curso;