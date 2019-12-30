/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade;

/**
 *
 * @author belogo
 */

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public interface IValidaCertificados 
{  
   
   String retornarCpfEstudante();
   
   int retornarCargaHoraria();
   
   long retornarCodigoCertificado();

}//Fim da interface IValidaCertificados;