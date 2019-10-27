package br.dominio.republicafederativa.republica;


import java.util.ArrayList;

import br.dominio.classesabstratas.Funcionario;


public class Ministerio{
    

    private String nome;

    private Ministro ministro;

    private double orcamentoAnual;

    private ArrayList listaServidores = new ArrayList();
    

    public Ministerio(){
        
    }
    
    public Ministerio(String nome, Ministro ministro, double orcamentoAnual){
        
        this.nome=nome;

        this.ministro=ministro;

        this.orcamentoAnual=orcamentoAnual;
    }
    
    public String retornarNome(){

        return this.nome;
    }

    public void alterarNome(String novoNome){

        this.nome=novoNome;
    }

    public Ministro retornarMinistro(){

        return  this.ministro;
    }

    public void alterarMInistro(Ministro novoMinistro){

        this.ministro=novoMinistro;
    }

    public double retornarOrcamentoAnual(){

        return this.orcamentoAnual;
    }

    public ArrayList retornarListaServidores(){

        return this.listaServidores;
    }

    public void inserirServidor(Funcionario novoServidor){

        this.listaServidores.add(novoServidor);
    }

    public void removerServidor(Funcionario removerServidor){

        this.listaServidores.remove(removerServidor);
    }
}