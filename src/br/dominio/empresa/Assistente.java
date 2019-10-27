/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.empresa;

/**
 *
 * @author belogo
 */

import br.dominio.classesabstratas.Funcionario;

import java.util.Date;

import br.dominio.classesabstratas.Telefone;
import br.dominio.classesabstratas.Endereco;

import java.util.ArrayList;

import br.dominio.classesabstratas.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Assistente extends Funcionario
{
   private ArrayList listaCompromissosDiretor = new ArrayList(5);//Colocar um dicionário no lugar, com cada chave equivalente aos cincos dias úteis da semana, e o valor com o vetor de compromissos;
   
   //Fim do campo de declaração de atributos;
   
   
   public Assistente()
   {
      
   }//Fim do método construtor padrão;
   
   public Assistente(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, Date dataAdmissao, Acesso conta)
   {
      super (nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, salario, setor, dataAdmissao, conta);
      
      //Fim do método super da classe mãe ou super classe Assitente;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe assitente;