/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.cadastroempresarial;

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
   private Random contador;
   
   private long cnpj;
   
   private boolean senti;
   
   private ArrayList listaCnpj = new ArrayList();

   //Fim do campo de declaração de atributos;
   
   
   @Override
   public long retornarCnpj()
   {
      senti = true;
      
      while (senti == true)
      {
         cnpj = contador.nextLong();
      
         if (listaCnpj.contains(cnpj) == false)
         { 
            listaCnpj.add(cnpj);
         
            return cnpj;
         }  
      }
      return 0;
     
   }//Fim do método que retorna o cnpj para a interface IRecebeCnpj;
   
   public ArrayList retornarListaCnpj()
   {
      return listaCnpj;
   }//Fim do método que retorna a lista de cnpj do objeto do tipo DevolveCnpj;
   
}//Fim da classe DevolveCnpj;