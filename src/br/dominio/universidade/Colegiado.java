package br.dominio.universidade;


import java.util.ArrayList;


public class Colegiado{
  
    
    private String nome;
    
    private Funcionario coordenador;
    
    private int numeroMaximoSemestres, numeroMinimoSemestres;
    
    private ArrayList listaProfessores = new ArrayList(20);
    
    private ArrayList listaDisciplinas = new ArrayList();
    
    private ArrayList listaEstudantes = new ArrayList();
    
    
    public Colegiado(){
        
    }
    
    public Colegiado(String nome, Funcionario coordenador, int numeroMaximoSemestres, int numeroMinimoSemestres){
        
        this.nome=nome;
        
        this.coordenador=coordenador;
        
        this.numeroMaximoSemestres=numeroMaximoSemestres;
        
        this.numeroMinimoSemestres=numeroMinimoSemestres;
    }
    
    public String retornarNomeColegiado(){
        
        return this.nome;
    }
    
    public Funcionario retornarCoordenador(){
        
        return this.coordenador;
    }
    
    public void alterarCoordenador(Funcionario novoCoordenador){
        
        this.coordenador=novoCoordenador;
    }
    
    public int retornarNumeroMaximoSemestres(){
        
        return this.numeroMaximoSemestres;
    }
    
    public void alterarNumeroMaximoSemestres(int novoMaximo){
        
        this.numeroMaximoSemestres=novoMaximo;
    }
    
    public int retornarNumeroMinimoSemestres(){
    
        return this.numeroMinimoSemestres;
    }
    
    public void alterarNumeroMinimoSemestres(int novoMinimo){
        
        this.numeroMinimoSemestres=novoMinimo;
    }
    
    public ArrayList retornarListaEstudantes(){
        
        return this.listaEstudantes;
    }
    
    public void inserirEstudanteColegiado(Estudante novoEstudante){
        
        this.listaEstudantes.add(novoEstudante);
    }
    
    public void removerEstudanteColegiado(Estudante removerEstudante){
        
        this.listaEstudantes.remove(removerEstudante);
    }
    
    public ArrayList retornarListaProfessores(){
        
        return this.listaProfessores;
    }
    
    public void inserirProfessorColegiado(Professor novoProfessor){
        
        this.listaProfessores.add(novoProfessor);
    }
    
    public void removerProfessorColegiado(Professor removerProfessor){
        
        this.listaProfessores.remove(removerProfessor);
    }
    
    public ArrayList retornarListaDisciplinas(){
        
        return this.listaDisciplinas;
    }
    
    public void inserirDisciplinaColegiado(Disciplina novaDisciplina){
        
        this.listaDisciplinas.add(novaDisciplina);
    }
    
    public void removerDisciplinaColegiado(Disciplina removerDisciplina){
        
        this.listaDisciplinas.remove(removerDisciplina);
    }
}