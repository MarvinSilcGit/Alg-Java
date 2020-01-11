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

public final class Certificado
{
   private String cpfBeneficiario,
           nomeBeneficiario,
           nomeCurso;
   
   private int cargaHoraria;
   
   private Udemy dadosUdemy;
   
   //Fim do campo de declaração de atributos;
   
  
   public Certificado()
   {
      
   }//Fim do método construtor padrão;
   
   public Certificado(Udemy cnpjResponsavel, String cpfBeneficiario, String nomeBeneficiario, String nomeCurso, int cargaHoraria)
   {
      this.cpfBeneficiario = cpfBeneficiario;
      
      this.nomeBeneficiario = nomeBeneficiario;
      
      this.nomeCurso = nomeCurso;
      
      this.cargaHoraria = cargaHoraria;
   }//Fim do método construtor personalizado;
   
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
    
   public long retornarCnpjResponsavelCertificado()
   {
      return dadosUdemy.retornarCnpj();
   }//Fim do método que retorna o responável do objeto do tipo Udemy;

   public long retornarCodigoCertificador()
   {
      return dadosUdemy.retornarCodigoCertificador();
   }//Fim do método que retorna o código de certificador do objeto do tipo Udemy;
   
}//Fim da classe Certificado;