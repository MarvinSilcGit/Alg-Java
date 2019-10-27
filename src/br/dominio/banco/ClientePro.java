package br.dominio.banco;


import java.util.Date;

import br.dominio.conta.ContaCorrente;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.api.Cliente;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class ClientePro extends Cliente
{
   private ContaCorrente contaCorrente;
    
   //Fim do campo de declaração de atributos;

   public ClientePro()
   {       
    
   }//Fim do método construtor personalizado;
    
    public ClientePro(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, Acesso conta, Date tempoClienteBanco, ContaCorrente contaCorrente){
    
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, conta, tempoClienteBanco);

        this.contaCorrente=contaCorrente;
    }
    
    public ContaCorrente acessarContaCorrente(){

        return this.contaCorrente;
    }
    
}//Fim da classe ClientePro;