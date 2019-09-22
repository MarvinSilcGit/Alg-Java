package br.dominio.republicafederativa;


import java.util.ArrayList;


public class Pais{
    
    private String nome, moeda;
 
    private double populacao, tesouro, pib, idh;
 
    private ArrayList listaPessoas = new ArrayList();
    
    private ArrayList listaEstados = new ArrayList();
    
    public Pais(){
        
    }
    
    public Pais(String nome, String moeda, double populacao, double tesouro, double pib, double idh){
      
        this.nome=nome;
        
        this.moeda=moeda;
        
        this.populacao=populacao;
        
        this.tesouro=tesouro;
        
        this.pib=pib;
        
        this.idh=idh;
    }
    
    public String retornarNome(){
        
        return this.nome;
    }
    
    public String retornarMoedaOficial(){
    
        return this.moeda;
    }
    
    public void alterarMoedaOficial(String alterarMoedaOficial){
    
        this.moeda=alterarMoedaOficial;
    }
    
    public double retornarPopupalacao(){
    
        return this.populacao;
    }
    
    public double retornarTesouro(){
    
        return this.tesouro;
    }
    
    public void alterarTesouro(double alterarTesouro){
    
        this.tesouro=alterarTesouro; 
    }
    
    public double retornarPib(){
    
        return this.pib;
    }
    
    public double retornarIdh(){
    
        return this.idh;
    }
    
    public ArrayList retornarListaEstados(){
    
        return this.listaEstados;
    }
    
    public void inserirEstados(String novoEstado){
    
        this.listaEstados.add(novoEstado);
    }
    
    public void removerEstados(Estado removerEstado){
        
        this.listaEstados.add(removerEstado);
    }
    
    public ArrayList retornarListaPessoas(){
    
        return this.listaPessoas;
    }
    
    public void inserirPessoas(String inserir){
    
        this.listaPessoas.add(inserir);
    }
}