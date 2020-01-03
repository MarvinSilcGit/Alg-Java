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


public class ValidaCertificados 
{  

   private IValidaCertificados validarCertificados;
   
   private Estudante dadosEstudante;
   
   //Fim do campo de declaração de atributos;
   
   
   public ValidaCertificados()
   {
      
   }//Fim do campo de decalração de atributos;
   
   public void validarCertificados()
   {
      if (this.validarCertificados.retornarCpfEstudante().equals(dadosEstudante.retornarCpf()))
      {
       
      }
   }

}//Fim da clasee ValidaCertificados;