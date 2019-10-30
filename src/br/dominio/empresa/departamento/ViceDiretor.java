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
   }//Fim do método construtor padrão;
   
   public ViceDiretor(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta, Assistente assistente, Diretor chefe)
   {
      this.chefe=chefe;
   }//Fim do método construtor personalizado;
  
   public Diretor retornaChefeDiretor()
   {
      return this.chefe;
   }//Fim do método que retorna o chefe do objeto do tipo ViceDiretor;
   
}//Fim da classe ViceDiretor;