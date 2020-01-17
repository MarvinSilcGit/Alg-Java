/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.cadastropessoafisica;

/**
 *
 * @author belogo
 */

import br.dominio.api.IRecebeRG;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class DevolveRG implements IRecebeRG
{
   private RG registroGeral;
   
   //Fim do campo de declaração de atributos;
   
   
   @Override
   public  RG retornarRegistroGeral()
   {
      return registroGeral;
   }//Fim do método que retora o objeto do tipo RG para a interface IRecebeRG;
   
}///Troca, onde for possível, int por shot;