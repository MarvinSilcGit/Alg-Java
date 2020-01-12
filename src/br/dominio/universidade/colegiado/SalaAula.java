/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade.colegiado;

/**
 *
 * @author belogo
 */

public final class SalaAula
{     
   private String cor;
   
   private int capacidade,
           numeroSala;
    
   private double area;
    
   //Fim do campo de declaração de atributos;
    
    
   public SalaAula()
   {
        
   }//Fim do método construtor padrão
    
   public SalaAula (String cor, int capacidade, int numeroSala,  double area, Professor professorResponsavel)
   {   
      this.cor = cor;     
       
      this.capacidade = capacidade;
      
      this.numeroSala = numeroSala;      
        
      this.area = area;
   }//Fim do método construtor personalizado;
    
   public String retornarCor()
   {
      return cor;
   }//Fim do método que retorna a cor do obejto do tipo Sala;
    
   public void alterarCor (String novaCor)
   {
      cor = novaCor;
   }//Fim do método que altera a cor do objeto do tipo Sala;
    
   public int retornarCapacidade()
   {    
      return capacidade;
   }//Fim do método que retorna a capacidade do objeto do tipo Sala;
    
   public int retornarNumeroSala()
   {   
      return numeroSala;
   }//Fim do método que retorna o número do objeto do tipo Sala;
   
   public double retornarArea()
   {
      return area;
   }//Fim do método que retorna a area do objeto do tipo Sala;
    
}//Fim da classe SalaAula;