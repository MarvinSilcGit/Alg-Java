package br.dominio.drograria;


import java.util.Date;

import br.dominio.supermercado.Produto;

import br.dominio.empresa.Funcionario;


public class Remedio extends Produto{
    
    private String categoria;
    
    public Remedio(){
        
    }
    
    public Remedio(String nome, int codigo, int quantidade, Date dataEntrada, Date dataSaida, Date dataValidade, String categoria){
    
        super(nome, codigo, quantidade, dataEntrada, dataSaida, dataValidade);
        
        this.categoria=categoria;
    }
    
    public String retornarCategoriaRemedio(){
        
        return this.categoria;
    } 
}