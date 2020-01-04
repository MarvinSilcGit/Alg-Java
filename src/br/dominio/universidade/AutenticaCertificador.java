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

import br.dominio.reguladorcertificados.iso.ValidaCertificador;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class AutenticaCertificador 
{  
   private IAutenticaCertificador autenticacao;
   
   private ValidaCertificador certificador;
   
   //Fim do campo de declaração de atributos;
   
   
   public boolean retornarValidadeAutenticacao()
   {
      if (certificador.retornarEmissoresCertificados().containsKey(autenticacao.retornarCnpj()))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
}//Fim da classe AutenticaCertificador;