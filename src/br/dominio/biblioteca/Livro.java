package br.dominio.biblioteca;


import java.util.Date;

import br.dominio.cadastro.Produto;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Livro extends Produto
{     
   private String titulo, subtitulo, genero, nomeAutor, editora, tradutor;

   private int isbn, quantidadePaginas, edicao;

   private Date ano;
    

   public Livro()
   {       
    
   }//Fim do método construtor padrão;
    
    public Livro(int codigo, int quantidade, Date dataEntrada, Date dataSaida, String categoria, String titulo, String subtitulo, String genero, String nomeAutor, String tradutor, String editora, int isbn, int quantidadePaginas, int edicao, Date anoPublicação){
        
       super(codigo, quantidade, dataEntrada, dataSaida, categoria);
       
        this.titulo=titulo;

        this.subtitulo=subtitulo;

        this.genero=genero;

        this.nomeAutor=nomeAutor;

        this.editora=editora;

        this.tradutor=tradutor;

        this.isbn=isbn;

        this.quantidadePaginas=quantidadePaginas;

        this.edicao=edicao;

        this.ano=anoPublicação;
    }
    
    public String retornarTitulo(){

        return this.titulo;
    }

    public String retornarSubtitulo(){

        return this.subtitulo;
    }

    public String retornarGenero(){

        return this.genero;
    }

    public String retornarNomeAutor(){

        return this.nomeAutor;
    }

    public String retornarEditora(){

        return this.editora;
    }

    public String retornarTradutor(){

        return this.tradutor;
    }

    public int retornarIsbn(){

        return this.isbn;
    }

    public int retornarQuantidadePaginas(){

        return this.quantidadePaginas;
    } 

    public int retornarEdicao(){

        return this.edicao;
    }

    public Date retornarAnoPublicação(){

        return this.ano;
    }
    
}//Fim da classe Livro;