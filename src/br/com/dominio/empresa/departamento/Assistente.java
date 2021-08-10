/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.empresa.departamento;

/**
 *
 * @author belogo
 */

import br.com.dominio.api.Funcionario;

import java.util.Date;

import br.com.dominio.api.Endereco;

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Assistente extends Funcionario
{
   private ArrayList listaCompromissosDiretor = new ArrayList(5);//Colocar um dicionário no lugar, com cada chave equivalente aos cincos dias úteis da semana, e o valor com o vetor de compromissos;
   
   //Fim do campo de declaração de atributos;
   
   
   public Assistente()
   {
      
   }//Fim do método construtor padrão;
   
   public Assistente (String nome, Date nascimento, String cpf, String email, Endereco endereco, float salario, String setor, Date dataAdmissao)
   {
      super ();
      
      //Fim do método super da classe mãe ou super classe Funcionario, inicializando o seu primeiro construtor personalizado;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe assitente;