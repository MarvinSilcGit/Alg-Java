/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.api;

/**
 *
 * @author belogo
 */

import br.dominio.educacionalead.udemy.Udemy;

import br.dominio.universidade.colegiado.Estudante;

//Fim dos imports de biblioteca de classes ou APIs (Application's Programming Interfaces) Java;


public final class Certificado
{
   private String codigoCertificado,
           cpfBeneficiario,
           nomeBeneficiario,
           nomeCurso;
   
   private int cargaHoraria;
   
   private Estudante estudante;
   
   private Udemy cnpjResponsavel,
           dadosUdemy;
   
   //Fim do campo de declaração de atributos;
   
  
   public Certificado()
   {
      
   }//Fim do método construtor padrão;
   
   public Certificado(String codigoCertificado, Udemy cnpjResponsavel, String cpfBeneficiario, String nomeBeneficiario, String nomeCurso, int cargaHoraria)
   {
      this.codigoCertificado = dadosUdemy.retornarCodigoCertificacao() + codigoCertificado;
      
      this.cpfBeneficiario = cpfBeneficiario;
      
      this.nomeBeneficiario = nomeBeneficiario;
      
      this.nomeCurso = nomeCurso;
      
      this.cargaHoraria = cargaHoraria;
   
      this.cnpjResponsavel = cnpjResponsavel;
   }//Fim do método construtor personalizado;
   
   public String retornarCodigoCertificado()
   {
      return codigoCertificado;
   }//Fim do método que retorna o código do objeto do tipo Certificado;
   
   public String retornarCpfBeneficiario()
   {
      return cpfBeneficiario;
   }//Fim do método que retorna o cpf do beneficiário do objeto do tipo Certificado;
   
   public String retornarNomeBeneficiario()
   {
      return nomeBeneficiario;
   }//Fim do método que retorna o nome do beneficiário do objeto do tipo Certificado;
   
   public String retornarNomeCurso()
   {
      return nomeCurso;
   }//Fim do método que retorna o nome do objeto do tipo Curso do objeto do Tipo Certificado;
   
   public int retornarCargaHoraria()
   {
      return cargaHoraria;
   }//Fim do método que retorna a carga horária do objeto do tipo Certificado;
   
   public Estudante retornarEstudante()
   {
      return estudante;
   }//Fim do método que retorna o objeto do tipo Estudante do objeto do tipo Certificado;
    
   public String retornarCnpjResponsavelCertificado()
   {
      return cnpjResponsavel.retornarCnpj();
   }//Fim do método que retorna o responável do objeto do tipo Certificado;
   
}//Fim da classe Certificado;