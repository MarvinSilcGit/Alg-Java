/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.educacionalead.alura;

/**
 *
 * @author belogo
 */

import br.dominio.empresa.Empresa;

import br.dominio.empresa.departamento.Orcamento;

import br.dominio.api.Endereco;

import br.dominio.api.Funcionario;

import br.dominio.educacionalead.udemy.Curso;

import br.dominio.universidade.colegiado.Estudante;

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Alura extends Empresa
{
   private ArrayList <Estudante> listaEstudantesCursando = new ArrayList();
   
   private ArrayList <Estudante> listaEstudantesConcluintes = new ArrayList();
   
   private ArrayList <Curso> listaCursos = new ArrayList();
   
   //Fim do campo de declaração de atriabutos;
   
   
   public Alura()
   {
      
   }//Fim do método construtor padrão;
   
   public Alura (String razaoSocial, String nomeFantasia, Endereco endereco, Funcionario presidente, Funcionario vicePresidente, Orcamento orcamento, double capitalSocial)
   {
      super (razaoSocial, nomeFantasia, endereco, presidente, vicePresidente, capitalSocial);
      
     //Fim do método super da classe mãe ou super classe Empresa;
   
   }//Fim do método construtor personalizado;
   
}//Fim da classe Alura;