/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.empresa.departamento;

/**
 *
 * @author belogo
 */

import br.dominio.api.Funcionario;

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Departamento
{
   private String nome;
    
   private Diretor diretor;
    
   private ViceDiretor viceDiretor;  
    
   private ArrayList listaFuncionarios = new ArrayList(40);
    
   //Fim do campo de declaração de atributos;
   
   
   public Departamento()
   {
        
   }//Fim do método construtor padrão;
    
   public Departamento (String nome, Diretor diretor, ViceDiretor viceDiretor)
   {     
      this.nome = nome;
        
      this.diretor = diretor;
        
      this.viceDiretor = viceDiretor;
        
   }//Fim do método construtor personalizado;
    
   public final String retornarNomeDepartamento()
   {    
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Departamento;
    
   public final void alterarNomeDepartamento (String novoNome)
   {     
      nome = novoNome;
   }//Fim do método que altera o nome do objeto do tipo Departamento;
    
   public final Diretor retornarDiretor()
   {
      return diretor;
   }//Fim do método que retorna o diretor
    
   public final void alterarDiretor(Diretor novoDiretor)
   {
      diretor = novoDiretor;
   }// Fim do método que altera o diretor do objeto do tipo Departamento;
    
   public final ViceDiretor retornarViceDiretor()
   {   
      return viceDiretor;
   }//Fim do método que retorna o vice diretor do objeto do tipo Departamento;
    
   public final void alterarViceDiretor(ViceDiretor novoViceDiretor)
   {      
      viceDiretor = novoViceDiretor;
   }//Fim do método que altera o vice diretor do objetod do tipo Departamento;
    
   public final ArrayList retornarListaFuncionarios()
   {
      return this.listaFuncionarios;
   }//Fim do método que retorna os funcionarios da lista do objeto do tipo Departamento;
    
   public final void inserirFuncionarioDepartamento(Funcionario novoFuncionario)
   { 
      if (this.listaFuncionarios.size()==40)
      {    
         System.out.println("Não é mais possível adicionar funcionário ao departamento "+this.nome);
      }
      else
      {    
         this.listaFuncionarios.add(novoFuncionario);
      }
      
   }//Fim do método que insere funcionario na lista do objeto do tipo Departamento;
    
   public final void removerFuncionarioDepartamento(Funcionario removerFuncionario)
   {     
      if (this.listaFuncionarios.isEmpty())
      {    
         System.out.println("Este departamento será automaticamente excluído da Universidade");
      } 
      else
      {    
         this.listaFuncionarios.remove(removerFuncionario);
      }
   }//Fim do método que remove funcionario da lista do objeto do tipo Departamento;
    
}//Fim da classe Departamento;