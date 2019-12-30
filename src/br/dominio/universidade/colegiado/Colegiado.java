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

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Colegiado
{   
   private String nome;
    
   private Funcionario coordenador;
        
   private ArrayList <SalaAula> listaSalas = new ArrayList();
   
   private ArrayList <Turma> listaTurmas = new ArrayList();
   
   private ArrayList <Curso> listaCursos = new ArrayList();
   
   //Fim do campo de declaração de atributos;
    
   //Corrigir comentários de acordo com a classe curso;
   public enum AreaCientifica
   {
      CIENCIAS_EXATAS,
      CIENCIAS_TERRA,
      CIENCIA_HUMANAS,
      CIENCIA_SOCIAS,
      SAUDE,
   }//Fim do enum AreaCientifica;
    
   public Colegiado()
   {
        
   }//Fim do método construtor padrão;
    
   public Colegiado(String nome, Funcionario coordenador)
   {        
      this.nome = nome;
        
      this.coordenador = coordenador;
   }//Fim do método construtor personalisado da classe Colegiado
    
   public String retornarNomeColegiado()
   {
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Colegiado;
 
   public Funcionario retornarCoordenador()
   {   
      return coordenador;
   }//Fim do método que retorna o coordenador do objeto do tipo Colegiado;
    
   public void alterarCoordenadorColegiado(Funcionario novoCoordenador)
   {     
      coordenador = novoCoordenador;
   }//Fim do método que altera o coordenador do objeto do tipo Colegiado;
    
   public ArrayList retornarListaSalas()
   {
      return listaSalas;       
   }//Fim do método que retorna objetos do tipo Sala da lista do objeto do tipo Colegiado;
    
   public void inserirSalaLista(SalaAula novaSala)
   {   
      listaSalas.add(novaSala);       
   }//Final do método que insere um objeto do tipo Sala na lisa do objeto do tipo Colegiado;
    
   public void removerSalaLista(SalaAula removerSala)
   {   
      listaSalas.remove(removerSala);     
   }//Final do método que remove um objeto to tipo Sala da lista do objeto do tipo Colegiado;
    
   public ArrayList retornarListaTurmas()
   {
      return listaTurmas;
   }//Fim do método que retorna objetos do tipo Turma da lista do objeto do tipo Colegiado;
   
   public void inserirTurmaLista(Turma novaTurma)
   {
      listaTurmas.add(novaTurma);
   }//Fim do método que insere um objeto do tipo Turma na lista do objeto do tipo Colegiado
   
   public void removerTurmaLista(Turma TurmaEscolhida)
   {
      listaTurmas.remove(TurmaEscolhida);
   }//Fim do método que remove um objeto do tipo Turma da lista do objeto do tipo Colegiado;
   
   public ArrayList retornarListaCursos()
   {
      return listaCursos;
   }//Fim do método que retorn objeto do tipo Curso da lista do objeto do tipo Colegiado;
   
   public void inserirCursoLista(Curso novoCurso)
   {
      listaCursos.add(novoCurso);
   }//Fim do método que insere um objeto do tipo Curso na lista do objeto do tipo Colegiado;
   
   public void removerCursoLista(Curso removerCurso)
   {
      listaCursos.remove(removerCurso);
   }//Fim do método que remove um objeto do tipo Curso da lista do objeto do tipo Colegiado;
   
}//Fim da classe Colegiado;