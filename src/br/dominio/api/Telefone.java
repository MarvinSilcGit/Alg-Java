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
   
   
   public enum Ddi
   {
      BRASIL,
      EUA,
   }//Fim do enum Ddi;
   
   public enum DddCurtaDistancia
   {
      QUINZE;
   }//Fim do enum DddCurtaDistancia;
   
   
   public Telefone()
   {
     
   }//Fim do método construtor padrão;
   
   public Telefone (int numero, String operadora)
   {  
      this.numero = numero;
   }//Fim do método construtor personalizado;
   
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