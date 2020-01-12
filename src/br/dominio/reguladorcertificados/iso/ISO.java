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

import java.util.ArrayList;

import br.dominio.empresa.Empresa;

import br.dominio.api.Endereco;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ISO extends Empresa
{  
   private ArrayList listaEmissoresCertificados = new ArrayList();
   
   private ICadastraCertificador autenticacao;
     
   //Fim do campo de declaração de atributos;
   
   
   public ISO()
   {
      
   }//Fim do método construtor padrão;
   
   public ISO (String razaoSocial, String nomeFantasia, Endereco endereco, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)    
   {
      super (razaoSocial, nomeFantasia, endereco, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtor personalizado;
   
   public final ArrayList retornarListEmissoresCertificados()
   {
      return listaEmissoresCertificados;
   }//Fim do método que retorna o lista de emissores de certificado do objeto do tipo ISO;  
   
   public final void adcionarEmissorCertificados (long codigoCertificador)
   {
      listaEmissoresCertificados.add (codigoCertificador);
   }//Fim do método que adiciona na lista um certificador do objeto do tipo ISO;
   
   public final void removerEmissorCertificador (long codigoCertificador)
   {
      listaEmissoresCertificados.remove (codigoCertificador);
   }//Fim do método que remove da lista um certificador do objeto do tipo ISO;
   
}//Fim da classe ISO;