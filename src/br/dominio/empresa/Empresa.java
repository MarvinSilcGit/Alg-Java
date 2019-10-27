package br.dominio.empresa;


import br.dominio.empresa.departamento.Departamento;

import br.dominio.empresa.departamento.Orcamento;

import br.dominio.classesabstratas.Funcionario;

import java.util.ArrayList;

import br.dominio.classesabstratas.Endereco;

import br.dominio.classesabstratas.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Empresa
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
   }
    
    public String retornarRazaoSocial(){
        
        return this.razaoSocial;
    }
    
    public String retornarNomeFantasia(){
        
        return this.nomeFantasia;
    }
    
    public Endereco retornarEndereco(){
        
        return this.endereco;
    }
    
    public void alterarEndereco(Endereco novoEndereco){
        
        this.endereco=novoEndereco;
    }
    
    public Telefone acessarTelefone()
    {
       return this.telefone;
    }
    
    public void alterarTelefone(Telefone novoTelefone)
    {
       this.telefone=novoTelefone;
    }
    
    public Funcionario retornarPresidente(){
        
        return this.presidente;
    }
    
    public void alterarPresidente(Funcionario novoPresidente){
        
        this.presidente=novoPresidente;
    }
    
    public Funcionario retornarVicePresidente(){
        
        return this.vicePresidente;
    }
    
    public void alterarVicePresidente(Funcionario novoVicePresidente){
        
        this.vicePresidente=novoVicePresidente;
    }
    
    public Orcamento acessarOrcamento(){
        
        return this.acessarOrcamento;
    }
    
    public ArrayList retornarListaConselheiros(){
        
        return this.listaConselho;
    } 
    
    public void inserirConselheiroLista(Funcionario novoConselheiro){
        
        this.listaConselho.add(novoConselheiro);
    }
    
    public void removerConselheiroLista(Funcionario removerConselheiro){
        
        this.listaConselho.remove(removerConselheiro);
    }
        
    public ArrayList retornarListaDepartamentos(){
        
        return this.listaDepartamentos;
    }
    
    public void inserirDepartamentoLista(Departamento novoDepartamento){
        
        if (this.listaDepartamentos.size()==8){
            
            System.out.println("já fora preenchido o número limite de departamentos ");
        }
        else{
         
            this.listaDepartamentos.add(novoDepartamento);
        }
    }
    
    public void removerDepartamentoLista(Departamento removerDepartamento){
        
        if (this.listaDepartamentos.size()==1){
            
            System.out.println("Já não é mais possível remover departamentos");
        }
        else{
            
            this.listaDepartamentos.remove(removerDepartamento);   
        }
    }
    
}//Fim da classe Empresa;