package br.dominio.republicafederativa;


public class Cidade extends Estado{
    
    
    public Cidade(){
        
    }
    
    public Cidade(String nome, String moeda, double populacao, double tesouro, double pib, double idh){
        
        super(nome,moeda, populacao, tesouro, pib, idh);
        
    }
    
}