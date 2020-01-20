/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.cadastropessoafisica;

/**
 *
 * @author belogo
 */

public interface IRecebeDadosCidadao 
{
   
   String retornarNome();
   
   String retornarNomePai();
   
   String retornarNomeMae();
   
   int retornarDiaNascimento();
     
   int retornarMesNascimento();
   
   int retornarAnoNascimento();
   
}//Fim da interface ICadastroSocial;