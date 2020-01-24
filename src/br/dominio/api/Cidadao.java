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

import br.dominio.cadastropessoafisica.IRecebeDadosCidadao;

import br.dominio.cadastropessoafisica.Identidade;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Cidadao implements IRecebeDadosCidadao
{      
   private String nome,
           nomePai,
           nomeMae;
   
   private IRecebeIdentidade registroGeral;
   
   private Identidade identidade;
   
   private int diaNascimento,
           mesNascimento,
           anoNascimento;
   
   //Fim do campo de declaração de atributos;
   
   
   public void receberDadosCidadao (String nomePessoa, String nomePaiPessoa, String nomeMaePessoa, int diaNascimentoPessoa, int mesNascimentoPessoa, int anoNascimentoPessoa)
   { 
      nome = nomePessoa;
      
      nomePai = nomePaiPessoa;
      
      nomeMae = nomeMaePessoa;
      
      diaNascimento = diaNascimentoPessoa;
      
      mesNascimento = mesNascimentoPessoa;
      
      anoNascimento = anoNascimentoPessoa;
   }//Fim do método que recebe o nome do cidadao;
   
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
   public final int retornarDiaNascimento()
   {
      return diaNascimento;
   }//Fim do método que retorna o dia de nascimento do objeto do tipo Cidadao para a interface IRecebeDadoCidadao;
   
   @Override
   public final int retornarMesNascimento()
   {
      return mesNascimento;
   }//Fim do método que retorna o mês de nascimento do objeto do tipo Cidadao para a interface IReecebeDadosCidadao;
   
   @Override
   public final int retornarAnoNascimento()
   {
      return anoNascimento;
   }//Fim do método que retorna o ano de nascimento do objeto do tipo Cidadao para a interface IRecebeDadosCidadao;
   
   @Override
   public int retornarHashCode()
   {
      return hashCode();
   }
   
}//Fim da classe Pessoa; 