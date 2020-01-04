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

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java; 
     

public final class ValidaCertificador
{  
   private Map <String, String> emissoresCertificados;
   
   private Empresa dadosEmpresa;
   
   //Fim do campo de declaração de atributos;
   
   
   public void adcionarCertificador()
   {
      emissoresCertificados.put(dadosEmpresa.retornarNomeFantasia(), dadosEmpresa.retornarCnpj());
   }
           
   //Fim do campo de declaração de atributos;
   
}//Fim da classe ValidarCertificadores;