/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.educacionalead.udemy;

/**
 *
 * @author belogo
 */

import br.dominio.universidade.IValidaCertificados;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;s


public class AutenticarCertificado implements IValidaCertificados
{  
   private Certificado certificado;
   
   //Fim do campo de declaração de atributos;
   
   public AutenticarCertificado()
   {
      
   }//Fim do método construtor padrão;
   
      
   @Override
   public String retornarCpfEstudante()
   {
      return certificado.retornarBeneficiario().retornarCpf();
   }
   
   @Override
   public int retornarCargaHoraria()
   {
      return 1;
   }
   
   @Override
   public long retornarCodigoCertificado()
   {
      return 12;
   }
   
}//Fim da classe AunteticarCertificado;