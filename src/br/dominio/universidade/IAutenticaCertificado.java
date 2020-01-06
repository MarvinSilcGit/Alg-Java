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

import br.dominio.universidade.colegiado.Estudante;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public interface IAutenticaCertificado 
{  
   
   Estudante retornarEstudante();
   
   int retornarCargaHoraria();
   
   String retornarCodigoCertificado();
   
   String retornarCategoriaCertificado();

}//Fim da interface IValidaCertificados;