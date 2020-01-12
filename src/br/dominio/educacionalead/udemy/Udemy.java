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

import java.util.ArrayList;

import br.dominio.empresa.Empresa;

import br.dominio.api.Endereco;

import br.dominio.api.Funcionario;

import br.dominio.universidade.colegiado.Estudante;

//Fim dos imports de biblioteca de classes ou APIs (Application's Programming Interfaces) Java;


public final class Udemy extends Empresa
{         
   private ArrayList <Estudante> listaAlunosCursando = new ArrayList();
   
   private ArrayList <Estudante> listaAlunosConcluintes = new ArrayList();
   
   private ArrayList <Curso> listaCursos = new ArrayList();
   
   private IRecebeCodigoCertificador codigoCertificador;
   
   //Fim do campo de declaração de atributos;
   
           
   public Udemy()
   {
      
   }//Fim do método construtor padrão;
   
   public Udemy (String razaoSocial, String nomeFantasia, Endereco endereco, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)
   {
      super (razaoSocial, nomeFantasia, endereco, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtor personalizado;
   
   public final ArrayList retornarListaCursos()
   {
      return listaCursos;
   }//Fim do método que retorna a lista de cursos do objeto do tipo Udemy;
   
   public final long retornarCodigoCertificador()
   {
      return codigoCertificador.retornarCodigoCertificador();
   }//Fim do método que retorna o código certificador do objeto do tipo Udemy;
   
}//Fim da classe Udemy;