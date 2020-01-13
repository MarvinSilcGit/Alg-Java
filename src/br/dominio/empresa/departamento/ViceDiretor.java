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

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class ViceDiretor extends Diretor
{
   private Departamento chefe;
   
   //Fim do campo de declaração de atributos;
   
   
   public ViceDiretor()
   {
    
   }//Fim do método construtor padrão;
   
   public ViceDiretor (String nome, Date nascimento, String cpf, String email, Endereco endereco, String condicaoCivil, double salario, String setor, Date dataAdmissao, Acesso conta, Assistente assistente, Departamento chefe)
   {
      super (nome, nascimento, cpf, email, endereco, salario, setor, dataAdmissao, conta, assistente);
      
      //Fim do método super da classe mãe ou super classe Funcionario, inicializando o seu primeiro método construtor;
      
      this.chefe = chefe;
   }//Fim do método construtor personalizado;
  
   public final Diretor retornaChefeDiretor()
   {
      return chefe.retornarDiretor();
   }//Fim do método que retorna o chefe do objeto do tipo ViceDiretor;
   
}//Fim da classe ViceDiretor;