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


public class Colegiado
{   
   private String nome, areaCientifica;
    
   private Funcionario coordenador;
        
   private ArrayList listaSalas = new ArrayList();
   
   private ArrayList listaTurmas = new ArrayList();
   
   private ArrayList listaCursos = new ArrayList();
   //Fim do campo de declaração de atributos;
    
    
   public Colegiado()
   {
        
   }//Fim do método construtor padrão;
    
   public Colegiado(String nome, Funcionario coordenador)
   {       
       this.nome=nome;
        
       this.coordenador=coordenador;
   }//Fim do método construtor personalisado da classe Colegiado
    
   public String retornarNomeColegiado()
   {
      return this.nome;
   }//Fim do método que retorna o nome do objeto do tipo Colegiado;
    
   public String retornarAreaCientificaColegiado()
   {
      return this.areaCientifica;
   }//Fim do método que retorna a area Científica do objeto do tipo Colegiado;
   
   public Funcionario retornarCoordenador()
   {   
      return this.coordenador;
   }//Fim do método que retorna o coordenador do objeto do tipo Colegiado;
    
   public void alterarCoordenadorColegiado(Funcionario novoCoordenador)
   {     
      this.coordenador=novoCoordenador;
   }//Fim do método que altera o coordenador do objeto do tipo Colegiado;
    
   public ArrayList retornarListaSalas()
   {
      return this.listaSalas;       
   }//Fim do método que retorna objetos do tipo Sala da lista do objeto do tipo Colegiado;
    
   public void inserirSalaLista(SalaAula novaSala)
   {   
      this.listaSalas.add(novaSala);       
   }//Final do método que insere um objeto do tipo Sala na lisa do objeto do tipo Colegiado;
    
   public void removerSalaLista(SalaAula removerSala)
   {   
      this.listaSalas.remove(removerSala);     
   }//Final do método que remove um objeto to tipo Sala da lista do objeto do tipo Colegiado;
    
   public ArrayList retornarListaTurmas()
   {
      return this.listaTurmas;
   }//Fim do método que retorna objetos do tipo Turma da lista do objeto do tipo Colegiado;
   
   public void inserirTurmaLista(Turma novaTurma)
   {
      this.listaTurmas.add(novaTurma);
   }//Fim do método que insere um objeto do tipo Turma na lista do objeto do tipo Colegiado
   
   public void removerTurmaLista(Turma TurmaEscolhida)
   {
      this.listaTurmas.remove(TurmaEscolhida);
   }//Fim do método que remove um objeto do tipo Turma da lista do objeto do tipo Colegiado;
   
   public ArrayList retornarListaCursos()
   {
      return this.listaCursos;
   }//Fim do método que retorn objeto do tipo Curso da lista do objeto do tipo Colegiado;
   
   public void inserirCursoLista(Curso novoCurso)
   {
      this.listaCursos.add(novoCurso);
   }//Fim do método que insere um objeto do tipo Curso na lista do objeto do tipo Colegiado;
   
   public void removerCursoList(Curso removerCurso)
   {
      this.listaCursos.remove(removerCurso);
   }//Fim do método que remove um objeto do tipo Curso da lista do objeto do tipo Colegiado;
   
}//Fim da classe Colegiado;