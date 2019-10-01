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

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Disciplina 
{      
   private String nome, tipo, ementa, periodoAula;
    
   private int cargaHoraria, creditos;
    
   private ArrayList listaRequisitos = new ArrayList();
  
   //Fim do campor de declaração de atributos;
   
    
   public Disciplina()
   {
        
   }//Fim do método construtor padrão;
    
   public Disciplina(String nome, String tipo, String ementa, int cargaHoraria, int creditos)
   {     
      this.nome=nome;
        
      this.tipo=tipo;
        
      this.ementa=ementa;
        
      this.cargaHoraria=cargaHoraria;
        
      this.creditos=creditos;
   }//Fim do método construtor personalizado;
    
   public String retornarNome()
   {  
      return this.nome;
   }//Fim do método que retorna o nome do objeto do tipo Disciplina;
    
   public void alterarNome(String novoNome)
   {      
      this.nome=novoNome;
   }//Fim do método que altera o nome do objeto do tipo Disciplina;
    
   public String retornarTipo()
   {    
      return this.tipo;
   }//Fim do método que retorna o tipo do objeto do tipo Disciplina;
    
   public void alterarTipo(String alterarTipo)
   {   
      this.tipo=alterarTipo;
   }//Fim do método que altera o tipo do objeto do tipo Disciplina;
    
   public String retornarEmenta()
   {    
      return this.ementa;
   }//Fim do método que retorna a ementa do objeto do tipo Disciplina;
    
   public void alterarEmenta(String novaEmenta)
   {    
     this.ementa=novaEmenta;
   }//Fim do método que altera a ementa do objeto do tipo Disciplina;
    
   public String retornarPeriodoAula()
   {
      return this.periodoAula;
   }//Fim do método que altera o período de aula do objeto do tipo Disciplina;
    
   public void alterarPeriodoAula(String novoPeriodoAula)
   {
      this.periodoAula=novoPeriodoAula;
   }//Fim do método que altera o período de aula do objeto do tipo Disciplina;
    
   public int retornarCargaHoraria()
   {    
      return this.cargaHoraria;
   }//Fim do método que retorna a cargaHoraria do objeto do tipo Disciplina;
    
   public void alterarCargaHoraria(int alterarCargaHoraria)
   {    
      this.cargaHoraria=alterarCargaHoraria;
   }//Fim do método que altera a carga horária do objeto do tipo Disciplina;
    
   public int retornarCreditos()
   {   
      return this.creditos;
   }//Fim do método que retorna os créditos do objeto do tipo Disciplina;
    
   public void alterarCreditos(int novoValor)
   {
      this.creditos=novoValor;
   }//Fim do método que altera os créditos do objeto do tipo Disciplina;
    
}//Fim da classe Disciplina