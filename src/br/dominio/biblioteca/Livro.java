package br.dominio.biblioteca;


import java.util.Date;

import br.dominio.classesabstratas.ProdutoSemValidade;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Livro extends ProdutoSemValidade
{     
   private String titulo, subtitulo, genero, nomeAutor, editora, tradutor;

   private long isbn;
          
   private int quantidadePaginas, edicao;

   private Date anoPublicacao;
   
   //Fim do campo de declaração de atributos;
    

   public Livro()
   {       
    
   }//Fim do método construtor padrão;
    
   public Livro(int codigo, int quantidade, Date dataEntrada, Date dataSaida, String categoria, String nome, String titulo, String subtitulo, String genero, String nomeAutor, String tradutor, String editora, long isbn, int quantidadePaginas, int edicao, Date anoPublicacao)
   {     
      super(codigo, quantidade, dataEntrada, dataSaida, categoria, nome);
      
      //Fim do método super da classe mãe ou super classe ProdutoSemValidade;
      
      this.titulo=titulo;

      this.subtitulo=subtitulo;

      this.genero=genero;

      this.nomeAutor=nomeAutor;

      this.editora=editora;

      this.tradutor=tradutor;

      this.isbn=isbn;

      this.quantidadePaginas=quantidadePaginas;

      this.edicao=edicao;

      this.anoPublicacao=anoPublicacao;
   }//Fim do método construtor personalizado;
    
   public String retornarTitulo()
   {
      return this.titulo;
   }

   public String retornarSubtitulo()
   {
      return this.subtitulo;
   }

   public String retornarGenero()
   {
      return this.genero;
   }

   public String retornarNomeAutor()
   {
      return this.nomeAutor;
   }

   public String retornarEditora()
   {
      return this.editora;
   }
    
   public String retornarTradutor()
   {
      return this.tradutor;
   }

   public long retornarIsbn()
   {
      return this.isbn;
   }

   public int retornarQuantidadePaginas()
   {
      return this.quantidadePaginas;
   } 

   public int retornarEdicao()
   {
      return this.edicao;
   }

   public Date retornarAnoPublicacao()
   {
      return this.anoPublicacao;
   }
    
}//Fim da classe Livro;