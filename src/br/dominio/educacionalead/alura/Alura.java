/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.educacionalead.alura;

/**
 *
 * @author belogo
 */

/*import br.dominio.universidade.IValidaCertificados;

import br.dominio.emissorescertificados.ICadastraEmissor;

import br.dominio.universidade.colegiado.Estudante;
*/

import br.dominio.api.Empresa;

import br.dominio.empresa.departamento.Orcamento;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Alura extends Empresa //implements IValidaCertificados, ICadastraEmissor
{
   
   public Alura()
   {
      
   }//Fim do método construtor padrão;
   
   public Alura(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente, Orcamento orcamento, double capitalSocial)
   {
      super(cnpj, razaoSocial, nomeFantasia, endereco, telefone, presidente, vicePresidente, capitalSocial);
      
     //Fim do método super da classe mãe ou super classe Empresa;
   
   }//Fim do método construtor personalizado;
   
 /*  @Override
   Estudante retornarEstudante()
   {
      return 
   }*/
   
}//Fim da classe Alura;