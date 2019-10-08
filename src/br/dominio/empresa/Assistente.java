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

import java.util.Date;

import br.dominio.cadastro.Telefone;

import br.dominio.cadastro.Endereco;

import java.util.ArrayList;

import br.dominio.banco.Acesso;//Mudar classe acesso para pacote cadastro;

public class Assistente extends Funcionario
{
   private ArrayList listaCompromissosDiretor = new ArrayList(5);//Colocar um dicionário no lugar, com cada chave equivalente aos cincos dias úteis da semana, e o valor com o vetor de compromissos;
   
   
   public Assistente()
   {
      
   }//Fim do método construtor padrão;
   
   public Assistente(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta)
   {
      super (nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, salario, setor, cargo, dataAdmissao, conta);
   }
   
}//Fim da classe assitente;
