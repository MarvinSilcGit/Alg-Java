/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.cadastropessoajuridica;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import java.util.Random;

import br.dominio.empresa.IRecebeTelefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class DevolveTelefone implements IRecebeTelefone
{
   private long telefone;
   
   private ArrayList listaTelefones = new ArrayList();
   
   private Random random;
   
   private static final boolean sentinela = true;
   
   //Fim do campo de declaração de atributos;
   
   
   @Override
   public long retornarTelefone()
   {
      while(sentinela == true)
      {
         telefone = random.nextLong();
         
         if (listaTelefones.contains (telefone) == false)
         {
            listaTelefones.add (telefone);
            
            return telefone;
         }        
      }//Fim do método que retorna o telefone para a interface IRecebeTelefone;   
   }
   
}//Fim da classe DevolveTelefone;