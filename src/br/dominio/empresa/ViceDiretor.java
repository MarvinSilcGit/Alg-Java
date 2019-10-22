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

import br.dominio.cadastro.Endereco;

import br.dominio.cadastro.Telefone;

import br.dominio.cadastro.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class ViceDiretor extends Diretor
{
   private Diretor chefe;
   
   
   public ViceDiretor()
   {
      //alterar o tipo do atributo sexo para um imutável;
   }
   
   public ViceDiretor(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta, Assistente assistente)
   {
      
   }
   
   
   
   
}//Fim da classe ViceDiretor;
