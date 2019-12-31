/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.educacionalead.udemy;

/**
 *
 * @author belogo
 */

import java.util.Scanner;

//Fim dos imports de biblioteca de classes ou APIs (Application's Programming Interfaces) Java;


public final class MainUdemy 
{

   public static void main (String [] args)
   {
      Scanner scan = new Scanner(System.in);
      
      String nome,
              cpf,
              login,
              senha,
              email;
      
      System.out.println("Digite seu nome: ");
      nome = scan.next();
      
      System.out.println("Digite seu cpf: ");
      cpf = scan.next();
      
      System.out.println("Digite seu login: ");
      login = scan.next();
      
      System.out.println("Digite sua senha: ");
      senha = scan.next();
      
      System.out.println("Digite seu email: ");
      email = scan.next();
      
      
      Estudante estudante = new Estudante(nome, cpf, login, senha, email);
      
      System.out.println(estudante.retornarDados());
      
   }//Fim do método main;
   
}//Fim da classe MainUdemy;