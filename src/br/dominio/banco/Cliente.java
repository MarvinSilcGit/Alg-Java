package br.dominio.banco;


import java.util.Date;

import br.dominio.universidade.Pessoa;

import br.dominio.cadastro.Endereco;
import br.dominio.cadastro.Telefone;


    public abstract class Cliente extends Pessoa{
        
    
        private Acesso conta;
    
        private int tempoClienteBanco;
    
    
        public Cliente(){
        
    
        }
    
        public Cliente(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, Acesso conta, int tempoClienteBanco){
        
            super(nome, nascimento, cpf, email, telefone, sexo, endereco);
        
            this.conta=conta;
       
            this.tempoClienteBanco=tempoClienteBanco;
        }
 
    public Acesso acessarContaAcesso(){
        
        return this.conta;
    }
    
    public int retornarTempoClienteBanco(){
    
        return this.tempoClienteBanco;
    }
    
}//Fim da classe Cliente;