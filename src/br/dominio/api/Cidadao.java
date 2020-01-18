/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.api;

/**
 *
 * @author belogo
 */

import java.util.Date;

import br.dominio.cadastropessoafisica.IRecebeDadosCidadao;

import br.dominio.cadastropessoafisica.Identidade;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

public abstract class Cidadao implements IRecebeDadosCidadao
{      
   private String nome,
           nomePai,
           nomeMae;
   
   private Date dataNascimento;
   
   private IRecebeIdentidade registroGeral;
   
   //Fim do campo de declaração de atributos;
   
   
   @Override
   public final String retornarNome()
   {
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Cidadao para a interface IRecebeDadoCidadao;
   
   @Override
   public final String retornarNomePai()
   {
      return nomePai;
   }//Fim do método que retorna o nome do pai do objeto do tipo Cidadao para a interface IRecebeDadoCidadao;
   
   @Override
   public final String retornarNomeMae()
   {
      return nomeMae;
   }//Fim do método que retorna o nome da mãe do objeto do tipo Cidadao para a interface IRecebeDadoCidadao;
   
   @Override
   public final Date retornarDataNascimento()
   {
      return dataNascimento;
   }//Fim do método que retorna a data de nascimento do objeto do tipo Cidadao para a interface IRecebeDadoCidadao;
   
   public Identidade retornarRegistroGeral()
   {
      return registroGeral.retornarIdentidade();
   }//Fim do método que retorna o objeto do tipo RG da interface IRecebeRG do objeto do tipo Cidadao;
   
}//Fim da classe Pessoa; 