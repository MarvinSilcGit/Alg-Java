/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.educacionalead.devmedia;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.dominio.empresa.Empresa;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

import br.dominio.educacionalead.udemy.Curso;

import br.dominio.universidade.colegiado.Estudante;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class DevMedia extends Empresa
{
   private ArrayList <Estudante> listaEstudantesCursando = new ArrayList();
   
   private ArrayList <Estudante> listaEstudantesConcluintes = new ArrayList();
   
   private ArrayList <Curso> listaCursos = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public DevMedia()
   {
      
   }//Fim do método construtor padrão;
   
   public DevMedia (String razaoSocial, String nomeFantasia, Endereco endereco,Funcionario presidente, Funcionario vicePresidente, double capitalSocial)
   {
      super (razaoSocial, nomeFantasia, endereco, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtror personalizado; 
   
}//Fim da classe DevMedia;