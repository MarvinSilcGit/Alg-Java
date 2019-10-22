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

import br.dominio.cadastro.Funcionario;

import br.dominio.cadastro.Endereco;

import br.dominio.cadastro.Telefone;

import java.util.ArrayList;

import br.dominio.empresa.Empresa;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Universidade extends Empresa
{   
   private Funcionario reitor,
           viceReitor;
    
   private float orcamentoPedagogicoTrimestre;
    
   private ArrayList listaColegiados = new ArrayList(50);
    
   //Fim do campo de declaração de atributos;  
  
   
   public Universidade()
   {
        
   }//Fim do método construtor padrão;
    
   public Universidade(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario reitor, Funcionario viceReitor, float orcamentoPedagogicoTrimestre)
   {  
       super(cnpj, razaoSocial, nomeFantasia, endereco, telefone);    
       //Fim do método Super da classe mãe ou superclasse Empresa, inicializando um de seus construtores;
        
       this.reitor=reitor;
        
       this.viceReitor=viceReitor;
        
       this.orcamentoPedagogicoTrimestre=orcamentoPedagogicoTrimestre;
    
   }//Fim do método construtor personalizado;
    
   public Funcionario retornarReitor()
   {      
      return this.reitor;
   }//Fim do método que retorna o reitor para o objeto do tipo Universidade;
    
   public void alterarReitor(Funcionario novoReitor)
   {
      this.reitor=novoReitor;    
   }//Fim do método que altera o reitor para o objeto do tipo Universidade;
    
   public Funcionario retornarViceReitor()
   {   
      return this.viceReitor;
   }//Fim do método que retorna o vice reitor para o objeto do tipo Universidade;
    
   public void alterarViceReitor(Funcionario novoViceReitor)
   {   
       this.viceReitor=novoViceReitor;   
   }//Fim do método que altera o vice reitor para o objeto do tipo Universidade;
   
   public float retornarOrcamentoPedagogicoTrimestre()
   {   
      return this.orcamentoPedagogicoTrimestre;  
   }//Fim do método que retorna o orcamento pedagogio trismestral para o objeto do tipo Universidade;
    
   public void alterarOrcamentoPedagogicoTrimestre(float novoOrcamentoPedagogicoTrimestre)
   {   
      this.orcamentoPedagogicoTrimestre=novoOrcamentoPedagogicoTrimestre;      
   }//Fim do método que altera o orcamento pedagogico trimestral para o objeto do tipo Universidade;
    
   public ArrayList retornarListaColegiados()
   {   
      return this.listaColegiados;     
   }//Fim do método que retorna a lista de objetos do tipo Colegiado da lista do objeto do tipo Universidade;
    
   public void inserirColegiadoLista(Colegiado novoColegiado)
   {   
      if (this.listaColegiados.size()==50)
      {    
         System.out.println("Não é mais possível inserir um colegiado");
      }
      else
      {       
         this.listaColegiados.add(novoColegiado);
      }    
    }//Fim do método que insere um objeto do tipo Colegiado na lista do objeto do tipo Universidade;
    
   public void removerColegiadoLista(Colegiado removerColegiado)
   { 
      if (this.listaColegiados.size()==1)
      {       
          System.out.println("Não é possível remover mais nenhum colegiado");
      }
      else
      {   
          this.listaColegiados.remove(removerColegiado);
      }      
   }//Fim do método que remove um objeto do tipo Colegiado da lista do objeto do tipo Universidade;
   
}//Final da classe Universidade;