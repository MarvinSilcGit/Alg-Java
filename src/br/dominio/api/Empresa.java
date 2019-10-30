package br.dominio.api;


import java.util.ArrayList;

import br.dominio.empresa.departamento.Departamento;

import br.dominio.empresa.departamento.Orcamento;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Empresa
{     
   private String cnpj,
           
           razaoSocial,
           
           nomeFantasia;
 
   private Endereco endereco;
    
   private Telefone telefone;
     
   private ArrayList listaConselho = new ArrayList(20);
       
   private ArrayList listaDepartamentos = new ArrayList(10);
        
   private Funcionario presidente, vicePresidente;
    
   private Orcamento acessarOrcamento;
   
   //Fim do campo de declaração de atributos;
    
     
   public Empresa()
   {    
   
   }//Fim do método construtor padrão;
     
   public Empresa(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone)
   {  
      this.cnpj=cnpj;
      
      this.razaoSocial=razaoSocial;
        
      this.nomeFantasia=nomeFantasia;
        
      this.endereco=endereco;
        
      this.telefone=telefone;
   }//Fim do primeiro método construtor personalizado;    
   
   public Empresa(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente)
   {     
      this.cnpj=cnpj;
        
      this.razaoSocial=razaoSocial;
        
      this.nomeFantasia=nomeFantasia;
        
      this.endereco=endereco;
      
      this.telefone=telefone;
      
      this.presidente=presidente;
            
      this.vicePresidente=vicePresidente;
   }//Fim do segundo método construtor personalizado;
    
   public String retornarCnpj()  
   {     
      return this.cnpj;
   }//Fim do método que retorna o Cnpj do objeto do tipo Empresa;
    
   public String retornarRazaoSocial()
   {     
      return this.razaoSocial;
   }//Fim do método que retorna razão social do objeto do tipo Empresa;
    
   public String retornarNomeFantasia()
   {     
      return this.nomeFantasia;
   }//Fim do método que retorna o nome fantasia do objeto do tipo Empresa;
    
   public Endereco acessarEndereco()
   {     
      return this.endereco;
   }//Fim do método que dá acesso ao objeto do tipo Endereco no objeto do tipo Empresa;
    
   public Telefone acessarTelefone()
   {
      return this.telefone;
   }//Fim do método que dá acessa o objeto do tipo Telefone no objeto do tipo Empresa;
    
   public Funcionario retornarPresidente()
   {     
      return this.presidente;
   }//Fim do método que retorna o presidente do objeto do tipo Empresa;
    
   public void alterarPresidente(Funcionario novoPresidente)
   {      
      this.presidente=novoPresidente;
   }//Fim do método que altera o presidente do objeto do tipo Empresa;
    
   public Funcionario retornarVicePresidente()
   {     
      return this.vicePresidente;
   }//Fim do método que retorna o vice presidente do objeto do tipo Empresa;
    
   public void alterarVicePresidente(Funcionario novoVicePresidente)
   {     
      this.vicePresidente=novoVicePresidente;
   }//Fim do método que altera o vice presidente do objeto do tipo Empresa;
    
   public Orcamento acessarOrcamento()
   {     
      return this.acessarOrcamento;
   }//Fim do método que dá acesso ao objeto do tipo Orcamento do objeto do tipo Empresa;
    
   public ArrayList retornarListaConselheiros()
   {     
      return this.listaConselho;
   }//Fim do método que retorna a lista do objeto do tipo Empresa;
    
   public void inserirConselheiroLista(Funcionario novoConselheiro)
   {     
      this.listaConselho.add(novoConselheiro);
   }//Fim do método que insere conselheiro na lista do objeto do tipo Empresa;
    
   public void removerConselheiroLista(Funcionario removerConselheiro)
   {     
      this.listaConselho.remove(removerConselheiro);
   }//Fim do método que remove conselheiro da lista do objeto do tipo Empresa;
        
   public ArrayList retornarListaDepartamentos()
   {     
      return this.listaDepartamentos;
   }//Fim do método que retorna a lista do objeto do tipo Empresa;
    
   public void inserirDepartamentoLista(Departamento novoDepartamento)
   {     
      if (this.listaDepartamentos.size()==8)
      {  
         System.out.println("já fora preenchido o número limite de departamentos ");
      }
      else
      {
         this.listaDepartamentos.add(novoDepartamento);
      }
   }//Fim do método que insere departamento na lista do objeto do tipo Empresa;
    
   public void removerDepartamentoLista(Departamento removerDepartamento)
   {     
      if (this.listaDepartamentos.size()==1)
      {
         System.out.println("Já não é mais possível remover departamentos");
      }
      else
      {        
         this.listaDepartamentos.remove(removerDepartamento);   
      }
   }//Fim do método que remove departamento da lista do objeto do tipo Empresa;
    
}//Fim da classe Empresa;