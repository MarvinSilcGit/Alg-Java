package br.dominio.drograria;


import java.util.Date;

import br.dominio.universidade.Endereco;

import br.dominio.universidade.Funcionario;

import br.dominio.banco.Acesso;

import br.dominio.universidade.Telefone;


public class Farmaceutico extends Funcionario{
    
    
    private String crf;
    
   
    public Farmaceutico(){
        
    }
    
    public Farmaceutico(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta, String crf){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, salario, setor, cargo, dataAdmissao, conta);
        
        this.crf=crf;
    }
    
    public String retornarCrf(){
      
        return this.crf;
    }
    
}//Fim da classe Farmaceutico;