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

import br.dominio.api.IRecebeIdentidade;


public final class DevolveIdentidade implements IRecebeIdentidade
{
   private Identidade registroGeral;
   
   //Fim do campo de declaração de atributos;
   
   
   @Override
   public  Identidade retornarIdentidade()
   {
      return registroGeral;
   }//Fim do método que retora o objeto do tipo RG para a interface IRecebeRG;
   
}///Troca, onde for possível, int por shot;