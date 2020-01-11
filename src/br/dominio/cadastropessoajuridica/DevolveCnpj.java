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

import br.dominio.empresa.IRecebeCnpj;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class DevolveCnpj implements IRecebeCnpj
{
   private Random random;
   
   private long cnpj;
   
   private static final boolean sentinela = true;
   
   private ArrayList listaCnpj = new ArrayList();

   //Fim do campo de declaração de atributos;
   
   
   @Override
   public long retornarCnpj()
   {  
      while (sentinela == true)
      {
         cnpj = random.nextLong();
      
         if (listaCnpj.contains(cnpj) == false)
         { 
            listaCnpj.add(cnpj);
         
            return cnpj;
         }  
      }
     
   }//Fim do método que retorna o cnpj para a interface IRecebeCnpj;
   
   public ArrayList retornarListaCnpj()
   {
      return listaCnpj;
   }//Fim do método que retorna a lista de cnpj do objeto do tipo DevolveCnpj;
   
}//Fim da classe DevolveCnpj;