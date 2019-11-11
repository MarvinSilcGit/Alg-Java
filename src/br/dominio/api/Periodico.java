package br.dominio.api;


import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Periodico extends ProdutoSemValidade
{     
   private String titulo,
           subtitulo,
           genero,
           nomeAutor,
           editora;
          
   private int quantidadePaginas,
           edicao;

   private Date anoPublicacao;
   
   //Fim do campo de declaração de atributos;
    

   public Periodico()
   {       
    
   }//Fim do método construtor padrão;
    
   public Periodico(int codigo, int quantidade, Date dataEntrada, Date dataSaida, String categoria, String nome, String titulo, String subtitulo, String genero, String nomeAutor, String editora, int quantidadePaginas, int edicao, Date anoPublicacao)
   {     
      super(codigo, quantidade, dataEntrada, dataSaida, categoria, nome);
      
      //Fim do método super da classe mãe ou super classe ProdutoSemValidade;
      
      this.titulo=titulo;

      this.subtitulo=subtitulo;

      this.genero=genero;

      this.nomeAutor=nomeAutor;

      this.editora=editora;

      this.quantidadePaginas=quantidadePaginas;

      this.edicao=edicao;

      this.anoPublicacao=anoPublicacao;
   }//Fim do método construtor personalizado;
    
   public String retornarTitulo()
   {
      return this.titulo;
   }//Fim do método que retorna o título do objeto do tipo Periodico;

   public String retornarSubtitulo()
   {
      return this.subtitulo;
   }//Fim do método que retorna o subtítulo do objeto do tipo Periodico;

   public String retornarGenero()
   {
      return this.genero;
   }//Fim do método que retorna o gênero do objeto do tipo Periodico;

   public String retornarNomeAutor()
   {
      return this.nomeAutor;
   }//Fim do método que retorna o nome do autor do objeto do tipo Livros;

   public String retornarEditora()
   {
      return this.editora;
   }//Fim do método que retorna a editora do objeto do tipo Periodico;

   public int retornarQuantidadePaginas()
   {
      return this.quantidadePaginas;
   }//Fim do método que retorna a quantidade páginas do objeto do tipo Periodico;

   public int retornarEdicao()
   {
      return this.edicao;
   }//Fim do método que retorna a edição do objeto do tipo Periodico;

   public Date retornarAnoPublicacao()
   {
      return this.anoPublicacao;
   }//Fim do método que retorna o ano publicação do objeto do tipo Periodico;
    
}//Fim da classe Periodico;