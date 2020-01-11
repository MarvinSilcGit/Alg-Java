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

import java.util.Scanner;

import br.dominio.reguladorcertificados.iso.IValidaCertificador;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ValidaCertificado implements IValidaCertificador
{
   private long codigoCertificador,
           codigoCertificado;
   
   private Scanner input;
   
   //Fim do campo de declaração de atributos;

   
   @Override
   public long retornarCodigoCertificador()
   { 
      System.out.println("Digite o código do certificador: ");
         
      return codigoCertificador = input.nextLong();
   }//Fim do método que retorna o código do certificador para a interface IValidaCertificador;
      
}//Fim da classe ValidaCertificado;