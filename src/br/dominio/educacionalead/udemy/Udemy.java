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

import java.util.ArrayList;

import br.dominio.universidade.IValidaCertificados;

import br.dominio.api.Empresa;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.api.Funcionario;

import br.dominio.universidade.colegiado.Estudante;

//Fim dos imports de biblioteca de classes ou APIs (Application's Programming Interfaces) Java;


public class Udemy extends Empresa implements IValidaCertificados// ICadastraCertificadores
{         
   private ArrayList <Estudante> listaEstudantesCursando = new ArrayList();
   
   private ArrayList <Estudante> listaEstudantesConcluintes = new ArrayList();
   
   private Estudante estudante;
   
   //Fim do campo de declaração de atributos;
   
           
   public Udemy()
   {
      
   }//Fim do método construtor padrão;
   
   public Udemy(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente, double capitalSocial)
   {
      super(cnpj, razaoSocial, nomeFantasia, endereco, telefone, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa;
      
   }//Fim do método construtor personalizado
   
   @Override
   public String retornarCpfEstudante()
   {
      return estudante.retornarCpf();
   }
   
   @Override
   public int retornarCargaHoraria()
   {
      return 1;
   }
   
   @Override
   public long retornarCodigoCertificado()
   {
      return 12;
   }
   
}//Fim da classe Udemy;