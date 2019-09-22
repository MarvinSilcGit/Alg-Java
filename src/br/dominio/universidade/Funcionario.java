package br.dominio.universidade;


import java.util.Date;

import br.dominio.banco.Acesso;


public abstract class Funcionario extends Pessoa{
    

    private double salario;
    
    private String setor, cargo;
    
    private Date dataAdmissao;
    
    private Acesso conta;
    
   
    public Funcionario(){
        
    }
    
    public Funcionario(String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco);          
    
        this.salario=salario;
        
        this.setor=setor;
        
        this.cargo=cargo;
        
        this.dataAdmissao=dataAdmissao;
        
        this.conta=conta;
    }
    
    public Funcionario(String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco, String setor, String cargo, Date dataAdmissao, Acesso conta){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco);
       
        this.setor=setor;
        
        this.cargo=cargo;
        
        this.dataAdmissao=dataAdmissao;
        
        this.conta=conta;
        
    }
    
    public double retornarSalario(){
    
        return this.salario;
    }
    
    public void alterarSalario(double alterarSalario){
    
        this.salario=alterarSalario;
    }
    
    public String retornarSetor(){
    
        return this.setor;
    }
    
    public void alterarSetor(String alterarSetor){
    
        this.setor=alterarSetor;
    }
    
    public String retornarCargo(){
    
        return this.cargo;
    }
    
    public void alterarCargo(String alterarSetor){
    
        this.cargo=alterarSetor;
    }
    
    public Date retornarDataAdmissão(){
    
        return this.dataAdmissao;
    }
    
    public Acesso acessarContaAcesso(){
    
        return this.conta;
    }
}