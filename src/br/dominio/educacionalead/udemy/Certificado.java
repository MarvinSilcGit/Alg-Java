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

import java.util.Random;

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Certificado
{
   private String cpfBeneficiario,
           nomeBeneficiario,
           nomeCurso;
   
   private int cargaHoraria;
   
   private Udemy dadosUdemy;
   
   private long codigoCertificado;
   
   private Random random;
   
   private static final boolean sentinela = true;
   
   private ArrayList listaCodigosCertificado = new ArrayList();
   
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
   
   private long calcularCodigoCertificado()
   {
      while (sentinela == true)
      {
         codigoCertificado = random.nextLong();
         
         if (listaCodigosCertificado.contains (codigoCertificado) == false)
         {
            listaCodigosCertificado.add (codigoCertificado);
            
            return codigoCertificado;
         }
      }
   }//Fim do método que calcula o código do objeto do tipo Certificado;
   
   public long retornarCodigoCertificado()
   {
      return this.calcularCodigoCertificado();
   }//Fim do método que retorna o código do objeto do tipo Certificado;
   
}//Fim da classe Certificado;