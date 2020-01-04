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

import br.dominio.universidade.colegiado.Estudante;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java


public final class ValidaCertificados 
{  

   private IAutenticaCertificado certificados;
   
   private Estudante dadosEstudante;
   
   private IAutenticaCertificador reguladorCertificadores;
   
   //Fim do campo de declaração de atributos;
   
   
   public ValidaCertificados()
   {
      
   }//Fim do campo de decalração de atributos;
   
   public void validarCertificados()
   {
      if (certificados.retornarCpfEstudante().equals(dadosEstudante.retornarCpf()) || certificados.retornarNomeEstudante().equals(dadosEstudante.retornarNome()))
      {
       
      }
   }

}//Fim da clasee ValidaCertificados;