package br.dominio.hospital;


import java.util.ArrayList;

import java.util.Date;

import br.dominio.universidade.Endereco;

import br.dominio.universidade.Funcionario;

import br.dominio.banco.Acesso;

import br.dominio.universidade.Telefone;


public abstract class ProfissionalEnfermagem  extends Funcionario{
    
   
    private ArrayList listaPacientes = new ArrayList(15);
   
    private int quantidadePlantoesSemana;
    
    private String coren, especialidade;
    
    
    public ProfissionalEnfermagem(){
        
    }
    
    public ProfissionalEnfermagem(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta, int quanitadePlantoesSemana, String coren, String especialidade){
     
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, salario, setor, cargo, dataAdmissao, conta);        
        
        this.quantidadePlantoesSemana=quanitadePlantoesSemana;
        
        this.coren=coren;
        
        this.especialidade=especialidade;
    }
    
    public int retornarQuantidadePlantoesSemana(){
    
        return this.quantidadePlantoesSemana;
    }
    
    public String retornarCoren(){
    
        return this.coren;
    }
    
    public String retornarEspecialidade(){
    
        return this.especialidade;
    }
    
    public ArrayList retornarListaPacientes(){
    
        return this.listaPacientes;
    }
    
    public void inserirPacienteLista(Paciente inserir){
        
        if (this.listaPacientes.size()>=15){
    
            System.out.println("Não é possível alocar mais pacientes para este enfermeiro()");
        }
        else{

            this.listaPacientes.add(inserir);
        }
    }
    
    public void removerPacienteLista(Paciente remover){
        
        this.listaPacientes.remove(remover);
    }
    
}//Fim da classe ProfissionalEnfermagem;