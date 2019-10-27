package br.dominio.banco;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.api.Endereco;

import br.dominio.api.Funcionario;

import br.dominio.api.Telefone;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

public class Correntista extends Funcionario
{   
   private ArrayList listaClienteFisico = new ArrayList (15);
    
    private ArrayList listaClienteJuridico = new ArrayList (15);
    
    public Correntista(){
        
    }
    
    public Correntista(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, Date dataAdmissao, Acesso conta){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, salario, setor, dataAdmissao, conta);
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
    
}//Fim da classe Correntista;