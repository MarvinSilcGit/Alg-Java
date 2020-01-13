package br.dominio.republicafederativa;


import java.util.ArrayList;

import java.util.Date;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Presidente extends Funcionario
{    
   private ArrayList gabinete =  new ArrayList(20);
   
   private Date dataPosse;
   
   //Fim do campo de declaração de atributos;
   
   
   public Presidente()
   {
        
   }//Fim do método construtor padrão;
    
   public Presidente (String nome, Date dataNascimento, String cpf, String email, Endereco endereco, double salario, String setor, Acesso conta, Date dataPosse)
   {
      super (nome, dataNascimento, cpf, email, endereco, salario, setor, conta);      
      
      //Fim do método super da classe mãe ou superclasse Funcionario, inicializando o seu terceiro método construtor personalizado;
      
      this.dataPosse = dataPosse;
   }//Fim do método construtor personalizado;
    
   public final Date retornarDataPosse()
   {
      return dataPosse;
   }//Fim do método que retorna a dataPosse do objeto do tipo Presidente;
   
   public final ArrayList retornarGabinete()
   {
      return gabinete;
   }//Fim do método que retorna o gabinete do objeto do tipo Presidente;
    
   public final void inserirFuncionarioGabinete (Funcionario novoFuncionario)
   {
      gabinete.add(novoFuncionario);
   }//Fim do método que insere o objeto do tipo Funcionario no gabinete do objeto do tipo Presidente;
   
   public final void removerFuncionarioGabinete (Funcionario removerFuncionario)
   {
      gabinete.remove(removerFuncionario);
   }//Fim do método que remove o objeto do tipo Funcionario do gabinete do objeto do tipo Presidente;
   
}//Fim da classe Presidente;