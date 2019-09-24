package br.dominio.universidade;


import java.util.ArrayList;


public class Colegiado
{  
    
   private String nome;
    
   private Funcionario coordenador;
    
   private int numeroMaximoSemestres, numeroMinimoSemestres;
    
   private ArrayList listaProfessores = new ArrayList(20);
    
   private ArrayList listaDisciplinas = new ArrayList();
    
   private ArrayList listaEstudantes = new ArrayList();
        
   private ArrayList listaSalas = new ArrayList();
   
   private ArrayList listaTurmas = new ArrayList();
   
   //Fim do campo de declaração de atributos;
    
    
   public Colegiado()
   {
        
   }//Fim do método construtor padrão da classe Colegiado;
    
   public Colegiado(String nome, Funcionario coordenador, int numeroMaximoSemestres, int numeroMinimoSemestres)
   {       
       this.nome=nome;
        
       this.coordenador=coordenador;
        
       this.numeroMaximoSemestres=numeroMaximoSemestres;
        
       this.numeroMinimoSemestres=numeroMinimoSemestres;
   }//Fim do método construtor personalisado da classe Colegiado
    
   public String retornarNomeColegiado()
   {
      return this.nome;
   }//Fim do método que retorna o nome do objeto do tipo Colegiado;
    
   public Funcionario retornarCoordenador()
   {   
      return this.coordenador;
   }//Fim do método que retorna o coordenador do objeto do tipo Colegiado;
    
   public void alterarCoordenador(Funcionario novoCoordenador)
   {     
      this.coordenador=novoCoordenador;
   }//Fim do método que alterao coordenador do objeto do tipo Colegiado;
    
   public int retornarNumeroMaximoSemestres()
   { 
      return this.numeroMaximoSemestres;
   }//Fim do método que retorna o número máximo de semestres para o objeto do tipo Colegiado;
    
   public void alterarNumeroMaximoSemestres(int novoMaximo)
   {     
      this.numeroMaximoSemestres=novoMaximo;
   }//Fim do método que altera o número máximo de semestres para o objeto do tipo Colegiado;
    
   public int retornarNumeroMinimoSemestres()
   { 
      return this.numeroMinimoSemestres;
   }//Fim do método que retorna o número mínimo de semestres para o objeto do tipo Colegiado;
    
   public void alterarNumeroMinimoSemestres(int novoMinimo)
   {     
      this.numeroMinimoSemestres=novoMinimo;
   }//Fim do método que altera o número mínimo de semestre para o objeto do tipo Colegiado;
    
   public ArrayList retornarListaEstudantes()
   {    
       return this.listaEstudantes;
   }//Fim do método que retorna a lista de estudantes do objeto do tipo Colegiado;
    
   public void inserirEstudanteColegiado(Estudante novoEstudante)
   {    
      if(this.listaEstudantes.contains(novoEstudante))
      {
         System.out.println("Este estudante já está na lista");
      }
      else
      {
          this.listaEstudantes.add(novoEstudante);
      }
   }//Fim do método que insere um objeto do tipo Estudante na lista do objeto do tipo Colegiado;
    
   public void removerEstudanteColegiado(Estudante removerEstudante)
   {    
       this.listaEstudantes.remove(removerEstudante);
   }//Fim do método que remove um objeto do tipo Estudante da lista do objeto do tipo Colegiado;
    
   public ArrayList retornarListaProfessores()
   {    
       return this.listaProfessores;
   }//Fim do método que retorna a lista de professores do objeto do tipo Colegiado;
    
   public void inserirProfessorColegiado(Professor novoProfessor)
   {    
       this.listaProfessores.add(novoProfessor);
   }//Fim do método que insere um objeto do tipo Professor na lista do objeto do tipo Colegiado;
    
   public void removerProfessorColegiado(Professor removerProfessor)
   {   
       this.listaProfessores.remove(removerProfessor);
   }//Fim do método que remove um objeto do tipo Professor da lista do objeto do tipo Colegiado; 
    
   public ArrayList retornarListaDisciplinas()
   {   
      return this.listaDisciplinas;
   }//Fim do método que retorna a lista de disciplinas do objeto do tipo Colegiado;
    
   public void inserirDisciplinaColegiado(Disciplina novaDisciplina)
   {   
      this.listaDisciplinas.add(novaDisciplina);
   }//Fim do método que insere um objeto do tipo Disciplina na lista do objeto do tipo Colegiado;
    
   public void removerDisciplinaColegiado(Disciplina removerDisciplina)
   {       
      this.listaDisciplinas.remove(removerDisciplina);
   }//Fim do método que remove um objeto do tipo disciplina da lista do objeto do tipo Colegiado;
    
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
   
}//Fim da classe Colegiado;