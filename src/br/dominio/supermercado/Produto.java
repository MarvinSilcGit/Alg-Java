package br.dominio.supermercado;


import java.util.Date;

import br.dominio.universidade.Funcionario;


public class Produto{
    

    private String nome;

    private Funcionario cadastrante;

    private int codigo, quantidade;

    private Date dataEntrada, dataSaida, dataValidade;
  

    public Produto(){
        
    }
    
    public Produto(String nome, Funcionario cadastrante, int codigo, int quantidade,Date dataEntrada, Date dataSaida, Date dataValidade){
        
        this.nome=nome;

        this.cadastrante=cadastrante;

        this.codigo=codigo;

        this.quantidade=quantidade;

        this.dataEntrada=dataEntrada;

        this.dataSaida=dataSaida;

        this.dataValidade=dataValidade;
    }
    
    public String retornarNomeProduto(){
 
        return this.nome;
    }
    
    public Funcionario retornarFuncionarioCadastrante(){
    
        return this.cadastrante;
    }
    
    public int retornarCodigo(){
    
        return this.codigo;
    }
    
    public int retornarQuantidade(){
    
        return this.quantidade;
    }
    
    public Date retornarDataEntrada(){
    
        return this.dataEntrada;
    }
    
    public Date retornarDataSaida(){
    
        return this.dataSaida;
    }
    
    public Date retornarDataValidade(){
    
        return this.dataValidade;
    }
}