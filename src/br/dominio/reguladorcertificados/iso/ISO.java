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

import br.dominio.api.Empresa;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class ISO extends Empresa
{  
   private ArrayList listaEmissoresCertificados = new ArrayList();
   
   private ICadastraCertificador autenticacao;
     
   //Fim do campo de declaração de atributos;
   
   
   public ISO()
   {
      
   }//Fim do método construtor padrão;
   
   public ISO(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)    
   {
      super(cnpj, razaoSocial, nomeFantasia, endereco, telefone, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtor personalizado;
   
   public ArrayList retornarEmissoresCertificados()
   {
      return listaEmissoresCertificados;
   }//Fim do método que retorna o lista de emissores de certificado;  
   
   public void adcionarCertificador(String cnpj)
   {
      listaEmissoresCertificados.add (cnpj);
   }//Fim do método que adiciona na lista um certificador do objeto do tipo;
   
   public void removerCertificador(String cnpj)
   {
      listaEmissoresCertificados.remove (cnpj);
   }//Fim do método que remove da lista um certificador do objeto do tipo;
   
}//Fim da classe ISO;