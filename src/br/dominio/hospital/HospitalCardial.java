/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.hospital;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.dominio.empresa.Empresa;

import br.dominio.api.Funcionario;

import br.dominio.api.Endereco;

import br.dominio.api.ProfissionalMedicina;

import br.dominio.api.ProfissionalEnfermagem;

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
   
   public HospitalCardial(String razaoSocial, String nomeFantasia, Funcionario presidente, Funcionario vicePresidente, double capitalSocial, Funcionario diretor)
   {
      super(razaoSocial, nomeFantasia, presidente, vicePresidente, capitalSocial);
      
      //Fim do método super da classe mãe ou super classe Empresa, inicializando o seu segundo método construtor personalizado;
      
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