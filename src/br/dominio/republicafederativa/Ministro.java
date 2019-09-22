package br.dominio.republicafederativa;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.universidade.Funcionario;

import br.dominio.universidade.Endereco;


public class Ministro extends Funcionario{
    

    private ArrayList equipe =  new ArrayList();
       
    public Ministro(){
        
    }
    
    public Ministro(String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco, double salario, String setor, String cargo, Date dataAdmissao){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, salario, setor, cargo, dataAdmissao);
    }
    
    public ArrayList retornarListaEquipe(){
 
        return this.equipe;
    }
    
    public void inserirFuncionarioEquipe(Funcionario inserir){
    
        this.equipe.add(inserir);
    }
    
    public void removerFuncionarioEquipe(Funcionario remover){
    
        this.equipe.remove(remover);
    }
}