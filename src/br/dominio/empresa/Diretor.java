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

import java.util.ArrayList;

import java.util.Date;

import br.dominio.banco.Acesso;

import br.dominio.cadastro.Endereco;

import br.dominio.cadastro.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;
             
public class Diretor extends Funcionario
{
   private ArrayList equipe = new ArrayList();
   
   private Assistente assistente;
    
   
   //Fim do campo de declaração de atributos;        
           
   
   public Diretor()
   {
      
   }//Fim do método construtor padrão;
   
   public Diretor(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta, Assistente assistente)
   {
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, salario, setor, cargo, dataAdmissao, conta);
      
      //Fim do método Super da classe mãe ou superclasse Funcionario;
      
      this.assistente=assistente;
      
   }//Fim do método construtor personalizado;
        
   public Assistente retornarAssistente()
   {
      return this.assistente;
   }
   
   public void alterarAssistente(Assistente assistente)
   {
      this.assistente=assistente;
   }
   
}//Fim da classe Diretor;