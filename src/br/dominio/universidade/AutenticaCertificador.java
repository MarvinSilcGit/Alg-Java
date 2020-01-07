/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.dominio.api.Empresa;
import br.dominio.reguladorcertificados.iso.IAutenticaCertificador;


//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;
     

public final class AutenticaCertificador implements IAutenticaCertificador
{  
   private ArrayList <String> listaEmissoresCertificados = new ArrayList();
   
   private Empresa dadosEmpresa;
   
   //Fim do campo de declaração de atributos;
   
   
   @Override
   public String retornarCnpj()
   {
      return dadosEmpresa.retornarCnpj();
   }//Fim do método que retorna o cnpj do objeto do tipo Empresa para a interface IAutenticaCertificador;
   
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
   
}//Fim da classe ValidarCertificadores;