// Classe do pacote br.dominio.universidade; 

package br.dominio.universidade;

/*
 *  Classe que faz parte do projeto Classes
 */

import java.util.ArrayList;

import br.dominio.empresa.Empresa;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

public class Universidade extends Empresa
{   
   private Funcionario reitor, viceReitor, diretorPedagogico, viceDiretorPedagogico;
    
   private float orcamentoPedagogicoTrimestre;
    
   private ArrayList listaColegiados = new ArrayList(50);
    
   private ArrayList listaSalas = new ArrayList();
    
   //Fim do campo de declaração de atributos;  
   
   public Universidade()
   {
        
   }//Fim do método construtor padrão para todas as classes;
    
   public Universidade(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Funcionario reitor, Funcionario viceReitor, Funcionario diretorPedagogico, Funcionario viceDiretorPedagogico, float orcamentoPedagogicoTrimestre)
   {  
       super(cnpj, razaoSocial, nomeFantasia, endereco);    
       //Fim do método Super da classe mãe ou superclasse Empresa, inicializando um dos construtores que ela possui;
        
       this.reitor=reitor;
        
       this.viceReitor=viceReitor;
        
       this.diretorPedagogico=diretorPedagogico;
        
       this.viceDiretorPedagogico=viceDiretorPedagogico;
        
       this.orcamentoPedagogicoTrimestre=orcamentoPedagogicoTrimestre;
    
   }//Fim do método construtor da classe Uniseridade;
    
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
    
   public Funcionario retornarDiretorPedagogico()
   {   
       return this.diretorPedagogico;   
   }//Fim do método que retorna o diretor pedagogico para o objeto do tipo Universidade;
    
   public void alterarDiretorPedagogico(Funcionario novoDiretorPedagogico)
   {   
      this.diretorPedagogico=novoDiretorPedagogico;
    }//Fim do método que altera o diretor pedagogico para o objeto do tipo Universidade;
    
   public Funcionario retornarViceDiretorPedagogico()
   {   
      return this.viceDiretorPedagogico;  
   }//FIm do método que retorna o vice Diretor Pedagogio para o objeto do tipo Universidade;
    
   public void alterarViceDiretorPedagogico(Funcionario novoViceDiretorPedagogico)
   {   
      this.viceDiretorPedagogico=novoViceDiretorPedagogico;   
   }//Fim do método que altera o vice Diretor pedagogico para o objeto do tipo Universidade
    
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
    
   public ArrayList retornarListaSalas()
   {
       return this.listaSalas;       
   }//Retorna a lista de objetos do tipo Sala da lista do objeto do tipo Universidade;
    
   public void inserirSalaLista(SalaAula novaSala)
   {   
      this.listaSalas.add(novaSala);       
   }//Final do método que insere um objeto do tipo Sala na lisa do objeto do tipo Universidade;
    
   public void removerSalaLista(SalaAula removerSala)
   {   
      this.listaSalas.remove(removerSala);     
   }//Final do método que remove um obbjeto to tipo Sala da lista do objeto do tipo Universidade;
   
}//Final da classe Universidade;