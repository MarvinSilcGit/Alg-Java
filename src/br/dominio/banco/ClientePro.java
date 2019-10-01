package br.dominio.banco;


import java.util.Date;

import br.dominio.conta.ContaCorrente;

import br.dominio.universidade.Endereco;

import br.dominio.universidade.Telefone;


public class ClientePro extends Cliente{
     

    private ContaCorrente contaCorrente;
            

    public ClientePro(){
        
    }
    
    public ClientePro(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, Acesso conta, int tempoClienteBanco, ContaCorrente contaCorrente){
    
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, conta, tempoClienteBanco);

        this.contaCorrente=contaCorrente;
    }
    
    public ContaCorrente acessarContaCorrente(){

        return this.contaCorrente;
    }
    
}//Fim da classe ClientePro;