package br.dominio.empresa;

import br.dominio.api.Endereco;

import br.dominio.api.Funcionario;

import br.dominio.cadastropessoajuridica.ICadastroEmpresarial;

import java.util.ArrayList;

import br.dominio.empresa.departamento.Departamento;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Empresa implements ICadastroEmpresarial
{     
   private String razaoSocial,
           nomeFantasia;
 
   private Endereco endereco;
       
   private ArrayList listaDepartamentos = new ArrayList(10);
        
   private Funcionario presidente,
           vicePresidente;
   
   private double capitalSocial;
   
   private IRecebeCnpj dadosCnpj;
   
   //Fim do campo de declaração de atributos;
    
     
   public Empresa()
   {    
   
   }//Fim do método construtor padrão;
     
   public Empresa(String razaoSocial, String nomeFantasia, Endereco endereco, double capitalSocial)
   {    
      this.razaoSocial = razaoSocial;
        
      this.nomeFantasia = nomeFantasia;
        
      this.endereco = endereco;
      
      this.capitalSocial = capitalSocial;
   }//Fim do primeiro método construtor personalizado;    
   
   public Empresa(String razaoSocial, String nomeFantasia, Endereco endereco, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)
   {           
      this.razaoSocial = razaoSocial;
        
      this.nomeFantasia = nomeFantasia;
        
      this.endereco = endereco;
      
      this.presidente = presidente;
            
      this.vicePresidente = vicePresidente;
      
      this.capitalSocial = capitalSocial;
   }//Fim do segundo método construtor personalizado;
   
   @Override
   public String retornarRazaoSocial()
   {     
      return razaoSocial;
   }//Fim do método que retorna razão social do objeto do tipo Empresa para a interface ICadastroEmpresarial;
   
   @Override
   public String retornarNomeFantasia()
   {     
      return nomeFantasia;
   }//Fim do método que retorna o nome fantasia do objeto do tipo Empresa para a interface ICadastroEmpresarial;
    
   @Override
   public Endereco retornarEndereco()
   {
      return endereco;
   }//Fim do método que retorna o objeto do tipo Endereco do objeto do tipo Empresa para a interface ICadastroEmpresarial;
   
   @Override
   public Funcionario retornarPresidente()
   {     
      return presidente;
   }//Fim do método que retorna o presidente do objeto do tipo Empresa para a interface ICadastroEmpresarial;
   
   @Override
   public Funcionario retornarVicePresidente()
   {     
      return vicePresidente;
   }//Fim do método que retorna o vice presidente do objeto do tipo Empresa para a interface ICadastroEmpresarial;
   
   @Override
   public double retornarCapitalSocial()
   {
      return capitalSocial;
   }//Fim do método que retorna o capital social do objeto do tipo Empresa para a interface ICadastroEmpresarial;
   
   public Long retornarCnpj()
   {
      return dadosCnpj.retornarCnpj();
   }
        
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