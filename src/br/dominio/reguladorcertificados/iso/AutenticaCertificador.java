/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.reguladorcertificados.iso;

/**
 *
 * @author belogo
 */

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class AutenticaCertificador 
{  
   private IAutenticaCertificador autenticacao;
   
   private br.dominio.universidade.AutenticaCertificador certificador;
   
   //Fim do campo de declaração de atributos;
   
   
   public boolean retornarValidadeAutenticacao()
   {
      if (certificador.retornarEmissoresCertificados().contains (autenticacao.retornarCnpj()))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
}//Fim da classe AutenticaCertificador;