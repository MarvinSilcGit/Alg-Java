package br.dominio.republicafederativa.republica;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

import br.dominio.api.Acesso;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Ministro extends Funcionario
{    
   private ArrayList equipe =  new ArrayList();
 
   //Fim do campo de declaração de atributos;
   
    
   public Ministro()
   {     
   
   }//Fim do método construtor padrão;
    
   public Ministro(String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, String condicaoCivil, double salario, String setor, Date dataAdmissao, Acesso conta)
   {     
      super(nome, nascimento, cpf, email, telefone, endereco, condicaoCivil, salario, setor, dataAdmissao, conta);
        
      //Fim do método super da classe mãe ou super classe Funcionario;
        
   }//Fim do método construtor personalizado;
    
   public ArrayList retornarListaEquipe()
   {
      return this.equipe;
   }//Fim do método que retorna a lista do objeto do tipo Ministro;
    
   public void inserirFuncionarioEquipe(Funcionario inserir)
   { 
      this.equipe.add(inserir);
   }//Fim do método que adiciona o objeto do tipo Funcionario na lista do objeto do tipo Ministro;
    
   public void removerFuncionarioEquipe(Funcionario remover)
   { 
      this.equipe.remove(remover);
   }//Fim do método que remove o objeto do tipo Funcionario da lista do objeto do tipo Ministro;
    
}//Fim da classe Ministro;