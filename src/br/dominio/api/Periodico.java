package br.dominio.api;


import java.util.Date;

import br.dominio.editora.Autor;

import br.dominio.editora.Editora;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Periodico extends Produto
{     
   private String titulo,
           subTitulo,
           genero;
          
   private int quantidadePaginas,
           edicao;

   private Date anoPublicacao;
   
   private long isbn;
   
   private Autor nomeAutor;
   
   private Editora nomeEditora;
   
   //Fim do campo de declaração de atributos;
    

   public enum TipoPeriodico
   {
      LIVRO_ELETRONICO,
      LIVRO_DIGITAL,
      REVISTA_ELETRONICA,
      REVISTA_DIGITAL,
      MONOGRAFIA,
      DISSERTACAO,
      TESE;
   }
   
   public Periodico()
   {       
    
   }//Fim do método construtor padrão;
    
   public Periodico(int codigoBarras, int quantidade, Date dataFabricacao, String categoria, String titulo, String subTitulo, String genero, int quantidadePaginas, int edicao, long isbn, Date anoPublicacao, Autor nomeAutor, Editora nomeEditora)
   {     
      super(codigoBarras, quantidade, dataFabricacao, categoria);
      
      //Fim do método super da classe mãe ou super classe Produto, inicializando o segundo método construtor personalizado;
      
      this.titulo = titulo;

      this.subTitulo = subTitulo;

      this.genero = genero;

      this.quantidadePaginas = quantidadePaginas;

      this.edicao = edicao;
      
      this.isbn = isbn;
      
      this.anoPublicacao = anoPublicacao;
      
      this.nomeAutor = nomeAutor;

      this.nomeEditora = nomeEditora;
   }//Fim do primeiro método construtor personalizado;
   
   public Periodico(int codigoBarras, int quantidade, Date dataFabricacao, String categoria, String titulo, String subTitulo, String genero, int quantidadePaginas, int edicao, Date anoPublicacao, Autor nomeAutor, Editora nomeEditora)
   {
      super(codigoBarras, quantidade, dataFabricacao, categoria);
      
      //Fim do método super da classe mãe ou superclasse Produto, inicializando o segundo método construtor personalizao;
    
      this.titulo = titulo;
      
      this.subTitulo = subTitulo;
      
      this.genero = genero;
      
      this.quantidadePaginas = quantidadePaginas;
      
      this.edicao = edicao;
      
      this.anoPublicacao = anoPublicacao;
      
      this.nomeAutor = nomeAutor;
      
      this.nomeEditora = nomeEditora;
   }//Fim do segundo método construtor personalizado;
    
   public String retornarTitulo()
   {
      return titulo;
   }//Fim do método que retorna o título do objeto do tipo Periodico;

   public String retornarSubTitulo()
   {
      return subTitulo;
   }//Fim do método que retorna o subtítulo do objeto do tipo Periodico;

   public String retornarGenero()
   {
      return genero;
   }//Fim do método que retorna o gênero do objeto do tipo Periodico;

   public int retornarQuantidadePaginas()
   {
      return quantidadePaginas;
   }//Fim do método que retorna a quantidade de páginas do objeto do tipo Periodico;

   public int retornarEdicao()
   {
      return edicao;
   }//Fim do método que retorna a edição do objeto do tipo Periodico;
   
   public long retornarIsbn()
   {
      return isbn;
   }//Fim do método que retorna o ISBN do objeto do tipo Periodico;
   
   public Date retornarAnoPublicacao()
   {
      return anoPublicacao;
   }//Fim do método que retorna o ano publicação do objeto do tipo Periodico;
   
   public String retornarNomeAutor()
   {
      return nomeAutor.retornarNome();
   }//Fim do método que retorna o nome do autor do objeto do tipo Livros;

   public String retornarEditora()
   {
      return nomeEditora.retornarNomeFantasia();
   }//Fim do método que retorna a nome da editora do objeto do tipo Periodico;
    
}//Fim da classe Periodico;