package br.dominio.supermercado;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.api.Endereco;

import br.dominio.api.Pessoa;

import br.dominio.cartao.CartaoCredito;

import br.dominio.api.Acesso;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

public class Cliente extends Pessoa
{       
   private ArrayList carrinho = new ArrayList();

   private CartaoCredito cartaoCredito;

   private Acesso conta;
   
   //Fim do campo de declaração de atributos;
    
   
   //Fazer ou não um classe carrinho;
    
   public Cliente()
   {        
   
   }//Fim do método construtor padrão;
   
   public Cliente(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco,String condicaoCivil, CartaoCredito cartaoCredito, Acesso conta)
   {     
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil);
      
      //Fim do método super da classe mãe o super classe Pessoa; 
       
      this.cartaoCredito=cartaoCredito; 
      
      this.conta=conta;
    }//Fim do método construtor personlizado;
   
   public ArrayList retornarCarrinho()
   {  
      return this.carrinho;
   }//Fim do método que retorna o carrinho do objeto do tipo cliente;

   public void inserirProdutoCarrinho(int inserir)
   {   
      this.carrinho.add(inserir);
   }//Fim do método que insere um produto no carrinho do objeto do tipo Cliente;

   public void removerProdutoCarrinho(int remover)
   {
      this.carrinho.remove(remover); 
   }//Fim do método que remove um produto do carrinho do objeto do tipo Cliente;
    
   public CartaoCredito acessarCartaoCredito()
   { 
       return this.cartaoCredito;
   }//Fim do método que acessa o objeto do tipo CartaoCredito do objeto do tipo cliente;
    
   public Acesso acessarContaAcesso()
   {     
      return this.conta;
   }//Fim do método que acessa o objeto do tipo Conta do objeto do tipo Cliente;
    
}//Fim da classe Cliente;