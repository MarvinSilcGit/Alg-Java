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

import br.dominio.universidade.colegiado.Estudante;



public final class Certificado
{
   private long codigo;
   
   private String cpfResponsavel,
           cpfBeneficiario,
           nomeBeneficiario,
           nomeCurso;
   
   private int cargaHoraria;
   
   private Estudante estudante;
   
   //Fim do campo de declaração de atributos;
   
  
   public Certificado()
   {
      
   }//Fim do método construtor padrão;
   
   public Certificado(long codigo, String cpfResponsavel, String cpfBeneficiario, String nomeBeneficiario, String nomeCurso, int cargaHoraria)
   {
      this.codigo = codigo;
      
      this.cpfResponsavel = cpfResponsavel;
      
      this.cpfBeneficiario = cpfBeneficiario;
      
      this.nomeBeneficiario = nomeBeneficiario;
      
      this.nomeCurso = nomeCurso;
      
      this.cargaHoraria = cargaHoraria;
   }//Fim do método construtor personalizado;
   
   public long retornarCodigoCertificado()
   {
      return codigo;
   }//Fim do método que retorna o código do objeto do tipo Certificado;
   
   public String retornarCpfResponsavelCertificado()
   {
      return cpfResponsavel;
   }//Fim do método que retorna o responável do objeto do tipo Certificado;
   
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
    
}//Fim da classe Certificado;