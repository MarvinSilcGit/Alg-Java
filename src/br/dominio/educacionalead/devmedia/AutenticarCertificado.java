/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.educacionalead.devmedia;

/**
 *
 * @author belogo
 */

import br.dominio.educacionalead.udemy.Certificado;

import br.dominio.universidade.IValidaCertificados;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class AutenticarCertificado implements IValidaCertificados
{
   private Certificado certificado;
   
   //Fim do campo de declaraçaõ de atributos;
   
      
   @Override
   public String retornarCpfEstudante()
   {
      return certificado.retornarCpfBeneficiario();
   }//Fim do método que retorna o cpf do beneficiário do objeto do tipo Certificado para a interface IValidaCertificados;
   
   @Override
   public String retornarNomeEstudante()
   {
      return certificado.retornarNomeBeneficiario();
   }//Fim do método que retorna o nome do beneficiário do objeto do tipo Certificado para a interface IValidaCertificados; 
   
   @Override
   public int retornarCargaHoraria()
   {
      return certificado.retornarCargaHoraria();
   }//Fim do método que retorna a carga Horária do objeto do tipo Certificado para a interface IValidaCertificados;
   
   @Override
   public long retornarCodigoCertificado()
   {
      return certificado.retornarCodigoCertificado();
   }//Fim do método que retorna o codigo do certificado do objeto do tipo Certificado para a interface IValidadeCertifcados;
   
}//Fim da classe AutenticarCertificado;