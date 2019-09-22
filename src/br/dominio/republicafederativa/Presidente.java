package br.dominio.republicafederativa;


import java.util.ArrayList;

import java.util.Date;

import br.dominio.universidade.Funcionario;

import br.dominio.universidade.Endereco;


public class Presidente extends Funcionario{
    

    private ArrayList gabinete =  new ArrayList(20);
    

    public Presidente(){
        
    }
    
    public Presidente (String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco, double salario, String setor, String cargo,Date dataAdmissao){
     
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, salario, setor, cargo, dataAdmissao);       
    }
    
    public ArrayList retornarGabinete(){
        return this.gabinete;
    }
}