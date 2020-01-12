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

import java.util.ArrayList;

import java.util.Random;

import br.dominio.educacionalead.udemy.IRecebeCodigoCertificador;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class DevolveCodigoCertificador implements IRecebeCodigoCertificador
{  
   private static final boolean sentinela = true;
   
   private ArrayList listaCodigosCertificadores = new ArrayList();
   
   private Random random;
   
   private long codigoCertificador;
   
   private ISO iso;
   
   //Fim do campo de declaração de atributos;
   
   
   @Override
   public final long retornarCodigoCertificador()
   {
      codigoCertificador = random.nextLong();
      
      while (sentinela == true)
      {
         if (listaCodigosCertificadores.contains (codigoCertificador) == false)
         {
            listaCodigosCertificadores.add (codigoCertificador);
            
            iso.adcionarEmissorCertificados(codigoCertificador);
            
            return codigoCertificador;
         }
      }
   }//Fim do método que retorna o código de certificador para a interface IRecebeCodigoCertificador; 
   
}//Fim da classe ValidaCertificador;