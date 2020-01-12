/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.reguladorcertificados.ecma;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.dominio.api.Endereco;

import br.dominio.api.Funcionario;

import br.dominio.empresa.Empresa;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

        
public final class ECMA extends Empresa
{  
   private ArrayList listaEmissoresCertificadosQualificados = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public ECMA()
   {
      
   }//Fim do método construtor padrão;
   
   public ECMA (String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)
   {
      super (razaoSocial, nomeFantasia, endereco, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtor personalizado;
   
   public final ArrayList retornarEmissoresCertificadosQualificados()
   {
      return listaEmissoresCertificadosQualificados;
   }//Fim do método que retorna os emissores de certificados qualificados do objeto do tipo ECMA;
   
}//Fim da classe ECMA;