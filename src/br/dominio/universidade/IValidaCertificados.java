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


public interface IValidaCertificados 
{  
   Estudante retornarCpfEstudante();
   
   int retornarCargaHoraria();
   
   long retornarCodigoCertificado();
   
   long retornarCodigoEq();

}//Fim da interface IValidaCertificados;