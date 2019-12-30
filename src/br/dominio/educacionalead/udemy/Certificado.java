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

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application's Programming Interfaces) Java;


public class Certificado
{
   private long codigo;
   
   private Funcionario responsavel;
   
   private int cargaHoraria;
   
   private Estudante beneficiario;
   
   //Fim do campo de declaração de atributos;
   
  
   public Certificado()
   {
      
   }//Fim do método construtor padrão;
   
   public Certificado(long codigo, Funcionario responsavel, int cargaHoraria, Estudante beneficiario)
   {
      this.codigo = codigo;
      
      this.responsavel = responsavel;
      
      this.cargaHoraria = cargaHoraria;
      
      this.beneficiario = beneficiario;
   }//Fim do método construtor personalizado;
   
   public long retornarCodigoCertificado()
   {
      return codigo;
   }//Fim do método que retorna o código do objeto do tipo Certificado;
   
   public Funcionario retornarResponsavelCertificado()
   {
      return responsavel;
   }//Fim do método que retorna o responável do objeto do tipo Certificado;
   
   public int retornarCargaHoraria()
   {
      return cargaHoraria;
   }//Fim do método que retorna a carga horária do objeto do tipo Certificado;
   
   public Estudante retornarBeneficiario()
   {
      return beneficiario;
   }//Fim do método que retorna o beneficiário do objeto do tipo Certificado;
   
}//Fim da classe Certificado;