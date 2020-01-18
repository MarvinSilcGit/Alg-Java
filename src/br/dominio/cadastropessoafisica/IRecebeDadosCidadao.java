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

import java.time.LocalDateTime;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public interface IRecebeDadosCidadao 
{
   
   String retornarNome();
   
   String retornarNomePai();
   
   String retornarNomeMae();
   
   LocalDateTime retornarDataNascimento();
     
}//Fim da interface ICadastroSocial;