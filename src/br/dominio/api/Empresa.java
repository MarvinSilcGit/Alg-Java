package br.dominio.api;


import java.util.ArrayList;

import br.dominio.empresa.departamento.Departamento;

import br.dominio.empresa.departamento.Orcamento;

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
        
   private Funcionario presidente,
           vicePresidente;
    
   private Orcamento orcamento;
   
   private double capitalSocial;
   
   //Fim do campo de declaração de atributos;
    
     
   public Empresa()
   {    
   
   }//Fim do método construtor padrão;
     
   public Empresa(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, double capitalSocial)
   {  
      this.cnpj = cnpj;
      
      this.razaoSocial = razaoSocial;
        
      this.nomeFantasia = nomeFantasia;
        
      this.endereco = endereco;
        
      this.telefone = telefone;
      
      this.capitalSocial = capitalSocial;
   }//Fim do primeiro método construtor personalizado;    
   
   public Empresa(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)
   {     
      this.cnpj = cnpj;
        
      this.razaoSocial = razaoSocial;
        
      this.nomeFantasia = nomeFantasia;
        
      this.endereco = endereco;
      
      this.telefone = telefone;
      
      this.presidente = presidente;
            
      this.vicePresidente = vicePresidente;
      
      this.capitalSocial = capitalSocial;
   }//Fim do segundo método construtor personalizado;
    
   public String retornarCnpj()  
   {     
      return cnpj;
   }//Fim do método que retorna o Cnpj do objeto do tipo Empresa;
    
   public String retornarRazaoSocial()
   {     
      return razaoSocial;
   }//Fim do método que retorna razão social do objeto do tipo Empresa;
    
   public String retornarNomeFantasia()
   {     
      return nomeFantasia;
   }//Fim do método que retorna o nome fantasia do objeto do tipo Empresa;
    
   public Endereco acessarEndereco()
   {     
      return endereco;
   }//Fim do método que dá acesso ao objeto do tipo Endereco no objeto do tipo Empresa;
    
   public Telefone acessarTelefone()
   {
      return telefone;
   }//Fim do método que dá acessa o objeto do tipo Telefone no objeto do tipo Empresa;
    
   public Funcionario retornarPresidente()
   {     
      return presidente;
   }//Fim do método que retorna o presidente do objeto do tipo Empresa;
    
   public Funcionario retornarVicePresidente()
   {     
      return vicePresidente;
   }//Fim do método que retorna o vice presidente do objeto do tipo Empresa;
 
   public Orcamento acessarOrcamento()
   {     
      return orcamento;
   }//Fim do método que dá acesso ao objeto do tipo Orcamento do objeto do tipo Empresa;
    
   public double retornarCapitalSocial()
   {
      return capitalSocial;
   }//Fim do método que retorna o capital social do objeto do tipo Empresa;
   
   public ArrayList retornarListaConselheiros()
   {     
      return listaConselho;
   }//Fim do método que retorna a lista do objeto do tipo Empresa;
    
   public void inserirConselheiroLista(Funcionario novoConselheiro)
   {     
      listaConselho.add(novoConselheiro);
   }//Fim do método que insere conselheiro na lista do objeto do tipo Empresa;
    
   public void removerConselheiroLista(Funcionario removerConselheiro)
   {     
      listaConselho.remove(removerConselheiro);
   }//Fim do método que remove conselheiro da lista do objeto do tipo Empresa;
        
   public ArrayList retornarListaDepartamentos()
   {     
      return listaDepartamentos;
   }//Fim do método que retorna a lista do objeto do tipo Empresa;
    
   public void inserirDepartamentoLista(Departamento novoDepartamento)
   {     
      if (listaDepartamentos.size() == 8)
      {  
         System.out.println("já fora preenchido o número limite de departamentos ");
      }
      else
      {
         listaDepartamentos.add(novoDepartamento);
      }
   }//Fim do método que insere departamento na lista do objeto do tipo Empresa;
    
   public void removerDepartamentoLista(Departamento removerDepartamento)
   {     
      if (listaDepartamentos.size() == 1)
      {
         System.out.println("Já não é mais possível remover departamentos");
      }
      else
      {        
         listaDepartamentos.remove(removerDepartamento);   
      }
   }//Fim do método que remove departamento da lista do objeto do tipo Empresa;
    
}//Fim da classe Empresa;