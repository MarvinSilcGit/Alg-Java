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

import br.dominio.universidade.colegiado.Professor;

//Fim dos imports de biblioteca de classes ou APIs (Application's Programming Interfaces) Java;


public class Curso
{
   private int cargaHoraria;
   
   private String nome;
   
   private Professor professor;
   
   //Fim do campo de declaração de atributos;
   
   public Curso()
   {
      
   }//Fim do método construtor padrão;
   
   public Curso(int cargaHoraria, String nome, Professor professor)
   {
      this.cargaHoraria = cargaHoraria;
      
      this.nome = nome;
      
      this.professor = professor;
   }//Fim do método construtor personalizado;
   
   public String retornarNome()
   {
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Curso;
   
   public Professor retornarProfessorResponsaveal()
   {
      return professor;
   }//Fim do método que retorna o objeto do tipo Professor do objeto do tipo Curso;
   
}//Fim da classe Curso