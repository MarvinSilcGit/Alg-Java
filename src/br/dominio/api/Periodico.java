package br.dominio.api;


import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Periodico extends Produto
{     
   private String titulo,
           subTitulo,
           genero;
          
   private short quantidadePaginas;
   
   private byte edicao;

   private Date anoPublicacao;
   
   private long isbn;
   
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
    
   public Periodico (long codigoBarras, short quantidade, Date dataFabricacao, String categoria, String titulo, String subTitulo, String genero, short quantidadePaginas, byte edicao, long isbn, Date anoPublicacao)
   {     
      super (codigoBarras, quantidade, dataFabricacao, categoria);
      
      //Fim do método super da classe mãe ou super classe Produto, inicializando o segundo método construtor personalizado;
      
      this.titulo = titulo;

      this.subTitulo = subTitulo;

      this.genero = genero;

      this.quantidadePaginas = quantidadePaginas;

      this.edicao = edicao;
      
      this.isbn = isbn;
      
      this.anoPublicacao = anoPublicacao;
   }//Fim do primeiro método construtor personalizado;
   
   public Periodico (long codigoBarras, short quantidade, Date dataFabricacao, String categoria, String titulo, String subTitulo, String genero, short quantidadePaginas, byte edicao, Date anoPublicacao)
   {
      super (codigoBarras, quantidade, dataFabricacao, categoria);
      
      //Fim do método super da classe mãe ou superclasse Produto, inicializando o segundo método construtor personalizao;
    
      this.titulo = titulo;
      
      this.subTitulo = subTitulo;
      
      this.genero = genero;
      
      this.quantidadePaginas = quantidadePaginas;
      
      this.edicao = edicao;
      
      this.anoPublicacao = anoPublicacao;
   }//Fim do segundo método construtor personalizado;
    
   public final String retornarTitulo()
   {
      return titulo;
   }//Fim do método que retorna o título do objeto do tipo Periodico;

   public final String retornarSubTitulo()
   {
      return subTitulo;
   }//Fim do método que retorna o subtítulo do objeto do tipo Periodico;

   public final String retornarGenero()
   {
      return genero;
   }//Fim do método que retorna o gênero do objeto do tipo Periodico;

   public final short retornarQuantidadePaginas()
   {
      return quantidadePaginas;
   }//Fim do método que retorna a quantidade de páginas do objeto do tipo Periodico;

   public final byte retornarEdicao()
   {
      return edicao;
   }//Fim do método que retorna a edição do objeto do tipo Periodico;
   
   public final long retornarIsbn()
   {
      return isbn;
   }//Fim do método que retorna o ISBN do objeto do tipo Periodico;
   
   public final Date retornarAnoPublicacao()
   {
      return anoPublicacao;
   }//Fim do método que retorna o ano publicação do objeto do tipo Periodico;
    
}//Fim da classe Periodico;