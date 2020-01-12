/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.educacionalead.w3s;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.dominio.empresa.Empresa;

import br.dominio.api.Endereco;

import br.dominio.api.Funcionario;

import br.dominio.universidade.colegiado.Estudante;

import br.dominio.educacionalead.udemy.Curso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class W3S extends Empresa
{ 
   private ArrayList <Estudante> listaEstudantesCursando = new ArrayList();
   
   private ArrayList <Estudante> listaEstudantesConcluintes = new ArrayList();
   
   private ArrayList <Curso> listaCursos = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public W3S()
   {
      
   }//Fim do método construtor padrão;
   
   public W3S (String razaoSocial, String nomeFantasia, Endereco endereco, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)
   {
      super (razaoSocial, nomeFantasia, endereco, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe W3S;