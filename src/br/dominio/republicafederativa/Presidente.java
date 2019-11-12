package br.dominio.republicafederativa.republica;


import java.util.ArrayList;

import java.util.Date;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

import br.dominio.api.Acesso;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Presidente extends Funcionario
{    
   private ArrayList gabinete =  new ArrayList(20);
   
   private Date dataPosse,
           dataDesposse;
    
   //Fim do campo de declaração de atributos;
   
   
   public Presidente()
   {
        
   }//Fim do método construtor padrão;
    
   public Presidente(String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, String condicaoCivil, double salario, String setor, Acesso conta, Date dataPosse, Date dataDesposse)
   {
      super(nome, nascimento, cpf, email, telefone, endereco, condicaoCivil, salario, setor, conta);      
      
      //Fim do método super da classe mãe ou superclasse Funcionario;
      
      this.dataPosse=dataPosse;
      
      this.dataDesposse=dataDesposse;
   }//Fim do método construtor personalizado;
    
   public Date retornarDataPosse()
   {
      return this.dataPosse;
   }//Fim do método que retorna a dataPosse do objeto do tipo Presidente;
   
   public Date retornarDataDesposse()
   {
      return this.dataDesposse;
   }//Fim do método que retorna a dataDesposse do objeto do tipo Presidente;
   
   public ArrayList retornarGabinete()
   {
      return this.gabinete;
   }//Fim do método que retorna o gabinete do objeto do tipo Presidente;
    
   public void inserirFuncionarioGabinete(Funcionario novoFuncionario)
   {
      this.gabinete.add(novoFuncionario);
   }//Fim do método que insere o objeto do tipo Funcionario no gabinete do objeto do tipo Presidente;
   
   public void removerFuncionarioGabinete(Funcionario removerFuncionario)
   {
      this.gabinete.remove(removerFuncionario);
   }//Fim do método que remove o objeto do tipo Funcionario do gabinete do objeto do tipo Presidente;
   
}//Fim da classe Presidente;