/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.reguladorcertificados.iso;

/**
 *
 * @author belogo
 */

import java.util.Map;

import br.dominio.api.Empresa;

import br.dominio.universidade.IAutenticaCertificador;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;
     

public final class ValidaCertificador implements IAutenticaCertificador
{  
   private Map <String, String> emissoresCertificados;
   
   private Empresa dadosEmpresa;
   
   //Fim do campo de declaração de atributos;
   
   
   @Override
   public String retornarCnpj()
   {
      return dadosEmpresa.retornarCnpj();
   }//Fim do método que retorna o cnpj do objeto do tipo Empresa para a interface IAutenticaCertificador;
   
   public Map retornarEmissoresCertificados()
   {
      return emissoresCertificados;
   }//Fim do método que retorna o mapa de emissores de certificado;  
   
   public void adcionarCertificador()
   {
      emissoresCertificados.put(dadosEmpresa.retornarCnpj(), dadosEmpresa.retornarNomeFantasia());
   }
   
}//Fim da classe ValidarCertificadores;