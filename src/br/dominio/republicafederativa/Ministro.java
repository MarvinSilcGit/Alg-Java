package br.dominio.republicafederativa;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.empresa.Funcionario;

import br.dominio.cadastro.Endereco;

import br.dominio.banco.Acesso;

import br.dominio.cadastro.Telefone;

public class Ministro extends Funcionario{
    

    private ArrayList equipe =  new ArrayList();
       
    public Ministro(){
        
    }
    
    public Ministro(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, salario, setor, cargo, dataAdmissao, conta);
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
    
}//Fim da classe Ministro;