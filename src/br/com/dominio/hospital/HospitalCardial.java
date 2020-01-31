/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.hospital;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.com.dominio.empresa.Empresa;

import br.com.dominio.api.Funcionario;

import br.com.dominio.api.Endereco;

import br.com.dominio.api.ProfissionalMedicina;

import br.com.dominio.api.ProfissionalEnfermagem;

import br.com.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class HospitalCardial extends Empresa
{   
   private ArrayList <Leito> listaLeitos = new ArrayList(50);
   
   private ArrayList <LeitoUTI> listaLeitosUTI = new ArrayList(listaLeitos.size()/100*20);
   
   private ArrayList <ProfissionalMedicina> listaMedicos = new ArrayList(listaLeitos.size()/5);
  
   private ArrayList <ProfissionalEnfermagem> listaProfissionaisEnfermagem = new ArrayList(listaLeitos.size()/5);
   
   private Funcionario diretor;
   
   //Fim do campo de declaração de atributos;
   
   
   public HospitalCardial()
   {
      
   }//Fim do método construtor padrão;
   
   public HospitalCardial(String razaoSocial, String nomeFantasia, double capitalSocial,Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente, Funcionario diretor)
   {
      super(razaoSocial, nomeFantasia, capitalSocial, endereco, telefone, presidente, vicePresidente);
      
      //Fim do método super da classe mãe ou super classe Empresa, inicializando o método construtor personalizado;
      
      this.diretor = diretor;
   }//Fim do método construtor personalizado;
   
   public Funcionario retornarDiretor()
   {
      return diretor;
   }//Fim do método que retorna o diretor do objeto do tipo HospitalCardial;
   
   public int retornaQuantidadeLeitosUTI()
   {
      return listaLeitosUTI.size();
   }//Fim do método que retorna a quantidade de leitos de UTI do objeto do tipo HospitalCardial;
   
   public int retornarQuantidadeLeitos()
   {
      return listaLeitos.size();
   }//Fim do método que retorna a quantidade de leitos do objeto do tipo HospitalCardial;
   
   public int retornarQuantidadeMedicos()
   {
      return listaMedicos.size();
   }//Fim do método que retorna a quantidade de objeto do tipo 
   
}//Fim da classe HospitalCardial;