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
   
   private int dia,
           mes,
           ano;
   
   //Fim do campo de declaração de atributos;
   
   
   public void receberDadosCidadao (String nomePessoa, String nomePaiPessoa, String nomeMaePessoa, int diaNascimento, int mesNascimento, int anoNascimento)
   { 
      nome = nomePessoa;
      
      nomePai = nomePaiPessoa;
      
      nomeMae = nomeMaePessoa;
      
      dia = diaNascimento;
      
      mes = mesNascimento;
      
      ano = anoNascimento;
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
      return dia;
   }//Fim do método que retorna o dia de nascimento do objeto do tipo Cidadao para a interface IRecebeDadoCidadao;
   
   @Override
   public final int retornarMesNascimento()
   {
      return mes;
   }//Fim do método que retorna o mês de nascimento do objeto do tipo Cidadao para a interface IReecebeDadosCidadao;
   
   @Override
   public final int retornarAnoNascimento()
   {
      return ano;
   }//Fim do método que retorna o ano de nascimento do objeto do tipo Cidadao para a interface IRecebeDadosCidadao;
   
   public Identidade retornarRegistroGeral()
   {
      identidade = registroGeral.retornarIdentidade();
      
      return identidade;
   }//Fim do método que retorna o objeto do tipo RG do objeto do tipo Cidadao;
   
}//Fim da classe Pessoa; 