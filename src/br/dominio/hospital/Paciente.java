package br.dominio.hospital;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.universidade.Endereco;

import br.dominio.universidade.Pessoa;

import br.dominio.drograria.Remedio;

import br.dominio.universidade.Telefone;


public class Paciente extends Pessoa{
    
    
    private Date dataEntrada, dataAlta;
   
    private ArrayList listaRemedios = new ArrayList();
    
    private ArrayList listaMedicos = new ArrayList(3);
    
    private ArrayList listasEnfermeiras = new ArrayList(3);
    
    public Paciente(){
        
    }
    
    public Paciente(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, Date dataEntrada, Date dataAlta){
       
        super(nome, nascimento, cpf, email, telefone, sexo, endereco);
       
        this.dataEntrada=dataEntrada;
        
        this.dataAlta=dataAlta;
    }
    
    public Date retornarDataEntrada(){
     
        return this.dataEntrada;
    }
    
    public Date retornarDataAlta(){
    
        return this.dataAlta;
    }   
    
    public ArrayList retornarListaRemedios(){
    
        return this.listaRemedios;
    }
    
    public void inserirRemedioPaciente(Remedio novoRemedio){
    
        this.listaRemedios.add(novoRemedio);
    }
    
    public void removerRemedioPaciente(Remedio removerRemedio){
    
        this.listaRemedios.remove(removerRemedio);
    }
    
    public ArrayList retornarMedicos(){
    
        return this.listaMedicos;
    }
    
    public void alterarMedicos(ProfissionalMedicina novoMedico, ProfissionalMedicina novoMedico2, ProfissionalMedicina novoMedico3){
    
        this.listaMedicos.add(novoMedico);
        
        this.listaMedicos.add(novoMedico2);
        
        this.listaMedicos.add(novoMedico3);
    }
    
    public ArrayList retornarEnfermeiras(){
        
        return this.listasEnfermeiras;
    }
    
    public void alterarEnfermeiras(ProfissionalEnfermagem novoProfissionalEnfermagem, ProfissionalEnfermagem novoProfissionalEnfermagem2, ProfissionalEnfermagem novoProfissionalEnfermagem3){
    
        this.listasEnfermeiras.add(novoProfissionalEnfermagem);
        
        this.listasEnfermeiras.add(novoProfissionalEnfermagem2);
        
        this.listasEnfermeiras.add(novoProfissionalEnfermagem3);
    }
    
}//Fim da classe Paciente;