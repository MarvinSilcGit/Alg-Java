package br.dominio.banco;


import br.dominio.conta.ContaCorrente;

import br.dominio.universidade.Endereco;

import br.dominio.empresa.Empresa;

import br.dominio.universidade.Funcionario;

import br.dominio.universidade.Telefone;


public class ClienteJuridico extends Empresa{
    

    private ContaCorrente contaCorrente;
    
    private Acesso conta;
    
    
    public ClienteJuridico(){
        
    }
    
    public ClienteJuridico(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente, ContaCorrente contaCorrente, Acesso conta){ 
        
        super(cnpj, razaoSocial, nomeFantasia, endereco, telefone, presidente, vicePresidente);
        
        this.contaCorrente=contaCorrente;
        
        this.conta=conta;
    }

    public ContaCorrente acessarContaCorrente(){
        
        return this.contaCorrente;
    }

    public Acesso acessarContaAcesso(){
        
        return this.conta;
    }
}