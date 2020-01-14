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

import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public interface ICadastroSocial 
{
   
   String retornarNomePessoa();
   
   Date retornarDataNascimentoPessoa();
   
   String retornarNomePai();
   
   String retornarNomeMae();
     
}//Fim da interface ICadastroSocial;