package br.dominio.supermercado;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.cadastro.Endereco;

import br.dominio.cadastro.Pessoa;

import br.dominio.cartao.CartaoCredito;

import br.dominio.banco.Acesso;

import br.dominio.cadastro.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

public class Cliente extends Pessoa
{       
   private ArrayList carrinho = new ArrayList();

   private CartaoCredito cartaoCredito;

   private Acesso conta;
      
    
   public Cliente()
   {        
   
   }   
   
   public Cliente(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco,String condicaoCivil, CartaoCredito cartaoCredito, Acesso conta)
   {     
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil);
       
      this.cartaoCredito=cartaoCredito; 
      
      this.conta=conta;
    }
   
   public ArrayList retornarCarrinho()
   {  
      return this.carrinho;
   }

   public void inserirProdutoCarrinho(int inserir)
   {   
      this.carrinho.add(inserir);
   }

   public void removerProdutoCarrinho(int remover)
   {
      this.carrinho.remove(remover); 
   }
    
   public CartaoCredito acessarCartaoCredito()
   { 
       return this.cartaoCredito;
   }
    
   public Acesso acessarContaAcesso()
   {     
      return this.conta;
   }
    
}//Fim da classe Cliente;