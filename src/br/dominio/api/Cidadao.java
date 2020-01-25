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

import java.util.Scanner;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Cidadao
{      
   private String nome;
   
   private Endereco endereco;
   
   private int cpf;
   
   private Scanner scan;
   
   //Fim do campo de declaração de atributos;
   
   
   public final String retornarNome()
   {
      return nome;
   }//Fim do método que retorna o nome;
   
   public final Endereco retornarEndereco()
   {
      return endereco;
   }//Fim do método que retorna o objetivo do tipo Endereco;
   
   public final int retornarCpf()
   {
      return cpf;
   }//Fim do método que retorna o cpf;
   
}//Fim da classe Cidadao; 