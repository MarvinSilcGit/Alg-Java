package br.dominio.hospital;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.universidade.Endereco;

import br.dominio.universidade.Funcionario;

import br.dominio.banco.Acesso;


public abstract class ProfissionalMedicina extends Funcionario{
    
   
    private ArrayList listaPacientes = new ArrayList(15);
   
    private String crm;
    
    private double valorConsulta;
    
    
    public ProfissionalMedicina(){
        
    }
    
    public ProfissionalMedicina(String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco, String setor, String cargo, Date dataAdmissao, Acesso conta, String crm, double valorConsulta){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, setor, cargo, dataAdmissao, conta);
        
        this.crm=crm;
        
        this.valorConsulta=valorConsulta;
    }
    
    public String retornarCrm(){
     
        return this.crm;
    }

    public double retornarValorConsulta(){
        
        return this.valorConsulta;
    }
    
    public void alterarValorConsulta(double novoValorConsulta){
        
        this.valorConsulta=novoValorConsulta;
    }
    
    public ArrayList retornarListaPacientes(){
    
        return this.listaPacientes;
    }
  
    public void inserirPacientesLista(Paciente novoPaciente){
        
        if (this.listaPacientes.size()>=15){
    
            System.out.println("Não é mais possível alocar pacientes para este médico(a)");
        }
        else{
            
            this.listaPacientes.add(novoPaciente);
        }
    }
    
    public void removerPacientesLista(Paciente removerPaciente){
    
        this.listaPacientes.remove(removerPaciente);
    }
    
    public void realizarConsulta(String nomePaciente, String cpf, String receita){  
        
        
        
    }
}