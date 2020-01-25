/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade;

/**
 *
 * @author belogo
 */

import br.dominio.universidade.colegiado.Colegiado;

import br.dominio.api.Funcionario;

import java.util.ArrayList;

import br.dominio.empresa.Empresa;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Universidade extends Empresa
{   
   private Funcionario reitor,
           viceReitor;
    
   private ArrayList listaColegiados = new ArrayList(50);
    
   //Fim do campo de declaração de atributos;  
  
   
   public Universidade()
   {
        
   }//Fim do método construtor padrão;
    
   public Universidade (String razaoSocial, String nomeFantasia, double capitalSocial, Funcionario reitor, Funcionario viceReitor, float orcamentoPedagogicoTrimestre)
   { 
      super (razaoSocial, nomeFantasia, capitalSocial);
      
      //Fim do método Super da classe mãe ou superclasse Empresa, inicializando o primeiro método construtor personalizado;
        
      this.reitor = reitor;
        
      this.viceReitor = viceReitor;
   }//Fim do método construtor personalizado;
    
   public final Funcionario retornarReitor()
   {      
      return this.reitor;
   }//Fim do método que retorna o reitor para o objeto do tipo Universidade;
    
   public final void alterarReitor(Funcionario novoReitor)
   {
      reitor = novoReitor;    
   }//Fim do método que altera o reitor para o objeto do tipo Universidade;
    
   public final Funcionario retornarViceReitor()
   {   
      return viceReitor;
   }//Fim do método que retorna o vice reitor para o objeto do tipo Universidade;
    
   public final void alterarViceReitor(Funcionario novoViceReitor)
   {   
       viceReitor = novoViceReitor;   
   }//Fim do método que altera o vice reitor para o objeto do tipo Universidade;
   
   public final ArrayList retornarListaColegiados()
   {   
      return listaColegiados;     
   }//Fim do método que retorna a lista de objetos do tipo Colegiado da lista do objeto do tipo Universidade;
    
   public final void inserirColegiadoLista(Colegiado novoColegiado)
   {  
      if (listaColegiados.size() == 50)
      {    
         System.out.println("Não é mais possível inserir um colegiado");
      }
      else
      {       
         listaColegiados.add(novoColegiado);
      }    
    }//Fim do método que insere um objeto do tipo Colegiado na lista do objeto do tipo Universidade;
    
   public final void removerColegiadoLista(Colegiado removerColegiado)
   { 
      if (listaColegiados.size() == 1)
      {        
         System.out.println("Não é possível remover mais nenhum colegiado");
      }
      else
      {    
         listaColegiados.remove(removerColegiado);
      }      
   }//Fim do método que remove um objeto do tipo Colegiado da lista do objeto do tipo Universidade;
   
}//Final da classe Universidade;