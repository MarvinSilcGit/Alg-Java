/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.api;

/**
 *
 * @author belogo
 */

public interface ICidadao
{
   
   String retornarNome();
   
   String retornarNomeMae();
   
   String retornarNomePai();
   
   int retornarDiaNascimento();
   
   int retornarMesNascimento();
   
   int retornarAnoNascimento();
   
}//Fim da interface ICidadao;