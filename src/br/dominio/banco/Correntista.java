package br.dominio.banco;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.universidade.Endereco;

import br.dominio.universidade.Funcionario;


public class Correntista extends Funcionario{
 
    
    private ArrayList listaClienteFisico = new ArrayList (15);
    
    private ArrayList listaClienteJuridico = new ArrayList (15);
    
    public Correntista(){
        
    }
    
    public Correntista(String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco, double salario, String setor, String cargo, Date dataAdmissao){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, salario, setor, cargo, dataAdmissao);
    }
    
    public ArrayList retornarListaClienteFisico(){
    
        return this.listaClienteFisico;
    }
    
    public ArrayList retornarListaCLienteJuridico(){
        
        return this.listaClienteJuridico;
    }
    
    public void inserirCLienteFisico(String inserirCPF){
    
        this.listaClienteFisico.add(inserirCPF);
    }
    
    public void removerClienteFisico(String removerCPF){
    
        this.listaClienteFisico.remove(removerCPF);
    }
    
    public void inserirClienteJuridico(String inserirCNPJ){
    
        this.listaClienteJuridico.add(inserirCNPJ);
    }
    
    public void removerClienteJuridico(String removerCNPJ){
    
        this.listaClienteJuridico.remove(removerCNPJ);
    }
}