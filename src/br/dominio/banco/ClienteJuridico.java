package br.dominio.banco;


import br.dominio.conta.ContaCorrente;

import br.dominio.cadastro.Endereco;

import br.dominio.empresa.Empresa;

import br.dominio.empresa.Funcionario;

import br.dominio.cadastro.Telefone;


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