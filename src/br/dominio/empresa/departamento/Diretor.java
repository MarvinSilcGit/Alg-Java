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

import br.dominio.api.Funcionario;

import java.util.ArrayList;

import java.util.Date;

import br.dominio.api.Acesso;

import br.dominio.api.Endereco;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Diretor extends Funcionario
{
   private ArrayList equipe = new ArrayList();
   
   private Assistente assistente;
    
   
   //Fim do campo de declaração de atributos;        
           
   
   public Diretor()
   {
      
   }//Fim do método construtor padrão;
   
   public Diretor (String nome, Date nascimento, String cpf, String email, Endereco endereco, double salario, String setor, Date dataAdmissao, Acesso conta, Assistente assistente)
   {
      super (nome, nascimento, cpf, email, endereco, salario, setor, dataAdmissao, conta);
      
      //Fim do método Super da classe mãe ou superclasse Funcionario, inicializando o seu primeiro construtor;
      
      this.assistente = assistente;
      
   }//Fim do método construtor personalizado;
        
   public final Assistente retornarAssistente()
   {
      return assistente;
   }//Fim do método que retorna o objeto do tipo Assistente do objeto do tipo Diretor;
   
   public final void alterarAssistente (Assistente novoAssistente)
   {
      assistente = novoAssistente;
   }//Fim do método que altera o objeto do tipo Assisnte do objeto do tipo Diretor;
   
}//Fim da classe Diretor;