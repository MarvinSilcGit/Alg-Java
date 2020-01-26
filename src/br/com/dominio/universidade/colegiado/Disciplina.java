/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.universidade.colegiado;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Disciplina 
{      
   private String nome,
           ementa;
    
   private ArrayList listaRequisitos = new ArrayList();
  
   //Fim do campo de declaração de atributos;
   
   
   public enum Tipo
   {
      TEORICA,
      PRATICA,
   }//Fim do enum Tipo do objeto do tipo Disciplina;
   
   public enum PeriodoAula
   {
      NOTURNO,
      DIURNO,
      VESPERTINO
   }//Fim do enum PeriodoAula do objeto do tipo Disciplina;
    
   public enum CargaHoraria
   {
      _80,
      _60,
      _120,
      _100,
      _40
   }//Fim do enum CargaHoraria do objeto do tipo Disciplina;
   
   public enum Creditos
   {
      _4,
      _6,
      _2
   }//Fim do enum Creditor do objeto do tipo Disciplina;
   
   public Disciplina()
   {
        
   }//Fim do método construtor padrão;
    
   public Disciplina (String nome, String ementa)
   {     
      this.nome = nome;
        
      this.ementa = ementa;
   }//Fim do método construtor personalizado;
    
   public String retornarNome()
   {  
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Disciplina;
    
   public final void alterarNome (String novoNome)
   {      
      nome = novoNome;
   }//Fim do método que altera o nome do objeto do tipo Disciplina;
    
   public final String retornarEmenta()
   {    
      return ementa;
   }//Fim do método que retorna a ementa do objeto do tipo Disciplina;
    
   public final void alterarEmenta (String novaEmenta)
   {    
     ementa = novaEmenta;
   }//Fim do método que altera a ementa do objeto do tipo Disciplina;
    
}//Fim da classe Disciplina