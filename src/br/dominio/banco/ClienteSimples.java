package br.dominio.banco;


import java.util.Date;

import br.dominio.universidade.Endereco;

import br.dominio.conta.ContaPoupanca;

import br.dominio.universidade.Telefone;


public class ClienteSimples extends Cliente{
    

    private ContaPoupanca contaPoupanca;
    
    
    public ClienteSimples(){
        
    }
     
    public ClienteSimples(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, Acesso conta, int tempoClienteBanco, ContaPoupanca contaPoupanca){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, conta, tempoClienteBanco);

        this.contaPoupanca=contaPoupanca;
    }
    
    public ContaPoupanca acessarContaPoupanca(){

        return this.contaPoupanca;
    } 
    
}//Fim da classe CLienteSimples;