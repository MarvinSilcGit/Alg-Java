/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade;

import br.dominio.empresa.Funcionario;
import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

/**
 *
 * @author belogo
 */

public class Curso 
{
   private String nome, modalidade, tipo;
   
   private int numeroMaximoSemestres, numeroMinimoSemestres;
   
   private double mensalidade;
   
   private Funcionario coordenador;
   
   private ArrayList listaProfessores = new ArrayList(20);
   
   private ArrayList listaDisciplinas = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public Curso()
   {
      
   }//Fim do método construtor padrão;
   
   public Curso(String nome, String modalidade, String tipo, int numeroMaximoSemestres, int numeroMinimoSemestres, double mensalidade)
   {
      this.nome=nome;
      
      this.modalidade=modalidade;
      
      this.tipo=tipo;
      
      this.numeroMaximoSemestres=numeroMaximoSemestres;
      
      this.numeroMinimoSemestres=numeroMinimoSemestres;
      
      this.mensalidade=mensalidade;
   }//Fim do método construtor personalizado;
   
   public String retornarNome()
   {
      return this.nome;
   }//Fim do método que retorna o nome para o objeto do tipo Curso;
   
   public String retornarModalidade()
   {
      return this.modalidade;
   }//Fim do método que retorna a modalidade para o objeto do tipo Curso;
   
   public void alterarModalidadeCurso(String novaModalidade)
   {
      this.modalidade=novaModalidade;
   }//Fim do método que altera a modalidade para o objeto do tipo Curso;
   
   public String retornarTipoCurso()
   {
      return this.tipo;
   }//Fim do método que retorna o tipo para o objeto do tipo Curso;
   
   public void alterarTipoCurso(String novoTipo)
   {
      this.tipo=novoTipo;
   }//Fim do método que altera o tipo para o objeto do tipo Curso;
   
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
       
   public double retornarMensalidade()
   {
      return this.mensalidade;
   }//Fim do método que retorna a mensalidade para o objeto do tipo Curso;
   
   public void alterarMensalidade(double alterarMensalidade)
   {
      this.mensalidade=alterarMensalidade;
   }//Fim do método que altera a mensalidade do objeto do tipo Curso;
   
   public Funcionario retornarCoordenadorCurso()
   {
      return this.coordenador;
   }//Fim do método que retorna o coordenador do objeto do tipo Curso;
   
   public void alterarCoordenadorCurso(Funcionario novoCoordenador)
   {
      this.coordenador=novoCoordenador;
   }//Fim do método que altera o coordenador do objeto do tipo Curso;
   
   public ArrayList retornarListaProfessores()
   {    
       return this.listaProfessores;
   }//Fim do método que retorna a lista de professores do objeto do tipo Cursoo;
    
   public void inserirProfessorColegiado(Professor novoProfessor)
   {    
       this.listaProfessores.add(novoProfessor);
   }//Fim do método que insere um objeto do tipo Professor na lista do objeto do tipo Curso;
    
   public void removerProfessorColegiado(Professor removerProfessor)
   {   
       this.listaProfessores.remove(removerProfessor);
   }//Fim do método que remove um objeto do tipo Professor da lista do objeto do tipo Curso; 
   
   public ArrayList retornarListaDisciplinasCurso()
   {   
      return this.listaDisciplinas;
   }//Fim do método que retorna a lista de disciplinas do objeto do tipo Curso;
    
   public void inserirDisciplinaCurso(Disciplina novaDisciplina)
   {   
      this.listaDisciplinas.add(novaDisciplina);
   }//Fim do método que insere um objeto do tipo Disciplina na lista do objeto do tipo Curso;
    
   public void removerDisciplinaCurso(Disciplina removerDisciplina)
   {       
      this.listaDisciplinas.remove(removerDisciplina);
   }//Fim do método que remove um objeto do tipo disciplina da lista do objeto do tipo Curso;
   
}//Fim da classe Curso;