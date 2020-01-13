package br.dominio.republicafederativa;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Ministro extends Funcionario
{    
   private ArrayList equipe =  new ArrayList();
   
   private Date dataPosse;
 
   //Fim do campo de declaração de atributos;
   
    
   public Ministro()
   {     
   
   }//Fim do método construtor padrão;
    
   public Ministro (String nome, Date nascimento, String cpf, String email, Endereco endereco, double salario, String setor, Acesso conta, Date dataPosse)
   {     
      super (nome, nascimento, cpf, email, endereco, salario, setor, conta);
        
      //Fim do método super da classe mãe ou super classe Funcionario, inicializando o seu terceiro construtor personalizado;
      
      this.dataPosse = dataPosse;
        
   }//Fim do método construtor personalizado;
    
   public final Date retornarDataPosse()
   {
      return dataPosse;
   }//Fim do método que retorna a dataPosse do objeto do tipo Ministro;
   
   public final ArrayList retornarListaEquipe()
   {
      return equipe;
   }//Fim do método que retorna a lista do objeto do tipo Ministro;
    
   public final void inserirFuncionarioEquipe (Funcionario inserir)
   { 
      equipe.add (inserir);
   }//Fim do método que adiciona o objeto do tipo Funcionario na lista do objeto do tipo Ministro;
    
   public final void removerFuncionarioEquipe (Funcionario remover)
   { 
      equipe.remove (remover);
   }//Fim do método que remove o objeto do tipo Funcionario da lista do objeto do tipo Ministro;
    
}//Fim da classe Ministro;