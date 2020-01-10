package br.dominio.biblioteca;


import java.util.ArrayList;

import br.dominio.empresa.Empresa;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Biblioteca extends Empresa
{  
   private ArrayList listaPratileiras = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   

   public Biblioteca()
   {     
    
   }//Fim do método contrutor padrão;
    
   public Biblioteca(String razaoSocial, String nomeFantasia, Endereco endereco, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)
   {     
      super(razaoSocial, nomeFantasia, endereco, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtor personalizado;
    
   public ArrayList retornarPratileiras()
   {
      return this.listaPratileiras;
   }//Fim do método que retorna a pratileira do objeto do tipo Biblioteca;

   public void adicionarPratileira(Pratileira add)
   {
      this.listaPratileiras.add(add);
   }//Fim do método que adicona livros na pratileira do objeto do tipo Biblioteca;

   public void removerPratileira(Pratileira remover)
   {
      this.listaPratileiras.remove(remover);
   }//Fim do método que remove livros da pratileira do objeto do tipo Biblioteca;
    
}//Fim da classe Biblioteca;