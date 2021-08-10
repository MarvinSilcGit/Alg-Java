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

import java.util.ArrayList;

import java.util.Date;

import br.com.dominio.api.Funcionario;
import br.com.dominio.api.Endereco;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Diretor extends Funcionario
{
   private ArrayList equipe = new ArrayList();
   
   private Assistente assistente;
    
   //Fim do campo de declaração de atributos;        
           
   
   public Diretor()
   {
      
   }//Fim do método construtor padrão;
   
   public Diretor (String email, Endereco endereco, float salario, String setor, Date dataAdmissao, Assistente assistente)
   {
      super ();
      
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