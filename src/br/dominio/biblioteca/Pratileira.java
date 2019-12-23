package br.dominio.biblioteca;


import br.dominio.api.Periodico;

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Pratileira
{    
   private String nome;
 
   private int capacidade;
    
   private ArrayList listaLivros = new ArrayList();

   //Fim do campo de declaração de atributos;
   
   
   public Pratileira()
   {     
   
   }//Fim do método construtor padrão;
    
   public Pratileira(String nome, int capacidade)
   {     
      this.nome = nome;
    
      this.capacidade = capacidade;
   }//Fim do método construtor personalizado;
    
   public String retornarNomePratileira()
   {     
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Pratileira;
    
   public int retornarCapacidadePratileira()
   { 
      return capacidade;
   }//Fim do método que retorna a capacidade do objeto do tipo Pratileira;
    
   public ArrayList retornarListaLivros()
   { 
      return listaLivros;
   }//Fim do método que retorna a lista do objeto do tipo Pratileira;
    
    public void inserirLivro(Periodico inserir)
    {    
       if (listaLivros.size() >= capacidade)
       { 
          System.out.println("Pratileira Cheia");
       }
       else{  
          
          if (listaLivros.contains(inserir))
          {       
             System.out.println("O livro " + inserir.retornarTitulo()+", com o códido ISBN " + inserir.retornarCodigoBarras() + ", já está na pratileira");
          }  
          else
          {
             listaLivros.add(inserir);
                   
             if ( listaLivros.size() == capacidade)
             {     
                System.out.println("A pratileira " + nome + " chegou a sua capacidade máxima");
             }
          }
       }
    }//Fim do método que insere livro na lista do objeto do tipo Pratileira;
   
    public void removerLivro(Periodico remover)
    {
       if (this.listaLivros.contains(remover))
       {        
          listaLivros.remove(remover);
       }
       else
       {    
          System.out.println("O livro " + remover.retornarTitulo() + ", com o código ISBN " + remover.retornarCodigoBarras() + ", não está na pratileira para ser removido");
       }
    }//Fim do método que remove livro da lista do objeto do tipo Pratileira;
    
}//Fim da classe Pratileira;