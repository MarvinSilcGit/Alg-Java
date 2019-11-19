/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade.colegiado;


import java.util.Map;

import java.util.Dictionary;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Boletim
{    
   private int codigo;
 
   private double nota;
    
   private Map eee;
    
   private Estudante estudante;
    
   private Dictionary dicionario;
    
   //Fim do campo de declaração de atributos;
    
  
   public Boletim()
   {
            
   }//Fim do método construtor padrão;
    
   public Boletim(int codigo, double nota)
   {     
      this.codigo = codigo;
        
      this.nota = nota;
   }//Fim do método construtor personalizado;
    
   public int retornarCodigo()
   {    
      return codigo;
   }//Fim do método que retorna o codigo do objeto do tipo Boletim;
    
   public double retornarNotaBoletim()
   {
      return nota;
   }//Fim do método que retorna a nota do objeto do tipo Boletim;
    
   public void alterarNotaBoletim(double novaNota)
   {
      nota = novaNota;
   }//Fim do método que altera a nota do objeto do tipo Boletim;
    
   public void inserirNota(Disciplina nomeDisciplina, double novaNota)
   {     
      dicionario.put(nomeDisciplina, novaNota);
        
     //   this.eee.keySet().add(novaNota);
   }//Fim do método que insere nota no dicionário do objeto do tipo Boletim;
    
}//Fim da classe Boletim;