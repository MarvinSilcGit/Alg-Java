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

import java.util.Date;


public abstract class Pessoa
{    
    private String nome, cpf, email;
    
    private Date nascimento;
    
    private int telefone;
    
    private char sexo;
    
    private Endereco endereco;

    
    public Pessoa(){ 
        
    }
    
    public Pessoa(String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco){
        
        this.nome=nome;
        
        this.nascimento=nascimento;
        
        this.cpf=cpf;
        
        this.email=email;
        
        this.telefone=telefone;
        
        this.sexo=sexo;
        
        this.endereco=endereco;
    }
    
    public String retornarNome(){
        
        return this.nome;
    }
    
    public Date retornarNascimento(){
    
        return this.nascimento;
    }
    
    public String retornarCpf(){
    
        return this.cpf;
    }
    
    public String retornarEmail(){
    
        return this.email;
    }
    
    public void alterarEmail(String alterarEmail){
    
        this.email=alterarEmail;
    }
    
    public int retornarTelefone(){
    
        return this.telefone;
    }
    
    public void alterarTelefone(int novoTelefone){
    
        this.telefone=novoTelefone;
    }
    
    public char retornarSexo(){
    
        return this.sexo;
    }
    
    public Endereco acessarEndereco(){
    
        return this.endereco;
    }
}   