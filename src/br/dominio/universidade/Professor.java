package br.dominio.universidade;


import java.util.Date;

import br.dominio.banco.Acesso;


public class Professor extends Funcionario{
    

    private double salarioHora;
    
    private int quantidadeDisciplinas;
    
    public Professor(){
    
    }
    
    public Professor(String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta, double salarioHora, int quantidadeDisciplinas){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, salario, setor, cargo, dataAdmissao, conta);
     
        this.salarioHora=salarioHora;
        
        this.quantidadeDisciplinas=quantidadeDisciplinas;
    }
    
    public double retornarSalarioHora(){
        
        return this.salarioHora;
    }
    
    public void alterarSalarioHora(double alterarSalárioHora){
    
        this.salarioHora=alterarSalárioHora;
    }
    
    public int retornarQuantidadeDisciplinas(){
    
        return this.quantidadeDisciplinas;
    }
    
    public void alterarQuantidadeDisciplinas(int alterarQuantidadeDisciplinas){
    
        this.quantidadeDisciplinas=alterarQuantidadeDisciplinas;
    }
}