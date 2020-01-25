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

import br.dominio.api.Funcionario;

import br.dominio.universidade.colegiado.Professor;

//Fim dos imports de biblioteca de classes ou APIs (Application's Programming Interfaces) Java;


public final class Udemy extends Empresa
{         
   private ArrayList <Curso> listaCursos = new ArrayList();
   
   private ArrayList <Professor> listaProfessores = new ArrayList(listaCursos.size()/2);
   
   private ArrayList <Aluno> listaAlunos = new ArrayList(listaProfessores.size()*20);
   
   private IRecebeCodigoCertificador codigoCertificador;
   
   //Fim do campo de declaração de atributos;
   
           
   public Udemy()
   {
      
   }//Fim do método construtor padrão;
   
   public Udemy (String razaoSocial, String nomeFantasia, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)
   {
      super (razaoSocial, nomeFantasia, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtor personalizado;
   
   public final ArrayList retornarListaCursos()
   {
      return listaCursos;
   }//Fim do método que retorna a lista de objetos do tipo Curso do objeto do tipo Udemy;
   
   public final ArrayList retornarListaProfessores()
   {
      return listaProfessores;
   }//Fim do método que retorna a lista de objetos do tipo Professor do objeto do tipo Udemy;
   
   public final ArrayList retornarListaAlunos()
   {
      return listaAlunos;
   }//Fim do método que retorna a lista de objeto do tipo Aluno do objeto do tipo Udemy;
   
   public final long retornarCodigoCertificador()
   {
      return codigoCertificador.retornarCodigoCertificador();
   }//Fim do método que retorna o código certificador do objeto do tipo Udemy;
   
}//Fim da classe Udemy;