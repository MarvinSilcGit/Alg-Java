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
   private String numeroSala,
            cor;
   
   private int capacidadeEstudantes;
    
   private double area;
    
   //Fim do campo de declaração de atributos;
    
    
   public SalaAula()
   {
        
   }//Fim do método construtor padrão
    
   public SalaAula(String numeroSala, String cor, int capacidadeEstudantes,  double area, Professor professorResponsavel)
   {
      this.numeroSala = numeroSala;      
       
      this.cor = cor;     
       
      this.capacidadeEstudantes = capacidadeEstudantes;
        
      this.area = area;
   }//Fim do método construtor personalizado;
    
   public String retornarNumeroSala()
   {   
      return numeroSala;
   }//Fim do método que retorna o número do objeto do tipo Sala;
    
   public String retornarCor()
   {
      return cor;
   }//Fim do método que retorna a cor do obejto do tipo Sala;
    
   public void alterarCor(String novaCor)
   {
      cor = novaCor;
   }//Fim do método que altera a cor do objeto do tipo Sala;
    
   public int retornarCapacidadeEstudantes()
   {    
      return capacidadeEstudantes;
   }//Fim do método que retorna a capacidade de estudantes do objeto do tipo Sala;
    
   public void alterarCapacidade(int novaCapacidade)
   {    
      capacidadeEstudantes = novaCapacidade;
   }//Fim do método que altera a capacidade de estudantes do objeto do tipo Sala;
    
   public double retornarArea()
   {
      return area;
   }//Fim do método que retorna a area do objeto do tipo Sala;
    
   public void alterarAreaSala(double novaArea)
   {    
      area=novaArea;
   }//Fim do método que altera a area do objeto do tipo Sala;
    
}//Fim da classe SalaAula;