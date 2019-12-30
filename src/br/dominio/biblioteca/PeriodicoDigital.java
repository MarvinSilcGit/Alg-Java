/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.biblioteca;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.dominio.api.Periodico;

import br.dominio.editora.Autor;

import br.dominio.editora.Editora;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class PeriodicoDigital extends Periodico
{   
   private long issn;
      
   //Fim do campo de declaração de atributos;
      
   
   public PeriodicoDigital()
   {
      
   }//Fim do método construtor padrão;
   
   public PeriodicoDigital(int codigoBarras, int quantidade, Date dataFabricacao, String categoria, String titulo, String subTitulo, String genero, int quantidadePaginas, int edicao, Date anoPublicacao, Autor nomeAutor, Editora nomeEditora, long issn)
   {
      super(codigoBarras, quantidade, dataFabricacao, categoria, titulo, subTitulo, genero, quantidadePaginas, edicao, anoPublicacao, nomeAutor, nomeEditora);
      
      //Fim do método super da classe mãe ou super classe Periodico, inicializando o segundo método construtor personalizado;
      
      this.issn = issn;  
   }//Fim do método construtor personalizado do objeto do tipo PeriodicoDigital;
   
   public long retornarIssn()
   {
      return issn;
   }//Fim do método que retorna o ISSN do objeto do tipo PeriodicoDigital;
   
}//Fim da classe PeriodicoDigital;