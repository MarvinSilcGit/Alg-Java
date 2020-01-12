/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.api;

/**
 *
 * @author belogo
 */

public final class Telefone 
{
   private int ddi,
           dddCurtaDistancia,
           dddLongaDistancia,
           numero;
   
   private String operadora;
   
   //Criar classe para operadoras;
   //Colocar enum para os ddds
   
   //Fim do campo de declaração de atributos;
   
   
   public Telefone()
   {
     
   }//Fim do método construtor padrão;
   
   public Telefone  (int ddi, int dddCurtaDistancia, int dddLongaDistancia, int numero)
   {
      this.ddi = ddi;
      
      this.dddCurtaDistancia = dddCurtaDistancia;
      
      this.dddLongaDistancia = dddLongaDistancia;
      
      this.numero = numero;
   }//Fim do método construtor personalizado;
   
   public final int retornarDdi()
   {
      return this.ddi;
   }//Fim do método que retorna o ddi do objeto do tipo Telefone;
   
   public final int retornarDddCurtaDistancia()
   {
      return this.dddCurtaDistancia;
   }//Fim do método que retorna o ddd de curta distância do objeto do tipo Telefone;
   
   public final int retornarDddLongaDistancia()
   {
      return this.dddLongaDistancia;
   }//Fim do método que retorna o ddd de longa distância do objeto do tipo Telefone;
   
   public final int retornarNumero()
   {
      return this.numero;
   }//Fim do método que retorna o numero do objeto do tipo Telefone;
  
   public final String retornarTelefoneCompleto()
   {
      return "DDI: " + ddi + ", DDD de curta distância: " + dddCurtaDistancia + ", DDD de longa distância: " + dddLongaDistancia + ", Número: " + numero;
   }
   //Converter para string;
}//Fim da classe Telefone;