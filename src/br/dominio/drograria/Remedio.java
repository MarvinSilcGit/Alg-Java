package br.dominio.drograria;


import java.util.Date;

import br.dominio.supermercado.Produto;

import br.dominio.universidade.Funcionario;


public class Remedio extends Produto{
    
    private String categoria;
    
    public Remedio(){
        
    }
    
    public Remedio(String nome, Funcionario funcionario, int codigo, int quantidade,Date dataEntrada, Date dataSaida, Date dataValidade, String categoria){
    
        super(nome, funcionario, codigo, quantidade, dataEntrada, dataSaida, dataValidade);
        
        this.categoria=categoria;
    }
    
    public String retornarCategoriaRemedio(){
        
        return this.categoria;
    } 
}