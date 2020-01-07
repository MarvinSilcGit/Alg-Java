/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.educacionalead.w3s;

/**
 *
 * @author belogo
 */

import br.dominio.api.Certificado;

import br.dominio.universidade.colegiado.Estudante;

import br.dominio.universidade.IAutenticaCertificado;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class AutenticaCertificado implements IAutenticaCertificado
{
   private Certificado certificado;
   
   //Fim do campo de declaração de atributos;
   
   
   @Override 
   public Estudante retornarEstudante()
   {
      return certificado.retornarEstudante();
   }//Fim do método que retorna o objeto do tipo Estudante do objeto do tipo Certificado para a interface IValidaCertificado;
   
   @Override
   public int retornarCargaHoraria()
   {
      return certificado.retornarCargaHoraria();
   }//Fim do método que retorna a carga Horária do objeto do tipo Certificado para a interface IValidaCertificado;
   
   @Override
   public String retornarCodigoCertificado()
   {
      return certificado.retornarCodigoCertificado();
   }//Fim do método que retorna o codigo do objeto do tipo Certificado para a interface IValidadeCertifcado;
   
   @Override
   public String retornarCategoriaCertificado()
   {
      return "Ead";
   }//Fim do método que retorna a categoria do objeto do tipo Certificado para a interface IValidaCertificado;
    
}//Fim da classe AutenticarCertificado;