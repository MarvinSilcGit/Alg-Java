/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.empresa.departamento;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.dominio.api.Endereco;

import br.dominio.api.Telefone;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class ViceDiretor extends Diretor
{
   private Diretor chefe;
   //Fazer atributo derivado para chefe;
   //Fim do campo de declaração de atributos;
   
   
   public ViceDiretor()
   {
      //alterar o tipo do atributo sexo para um imutável;
   }
   
   public ViceDiretor(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta, Assistente assistente)
   {
      
   }
   
   
   
   
}//Fim da classe ViceDiretor;
