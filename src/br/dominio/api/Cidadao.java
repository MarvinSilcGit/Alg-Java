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

import java.time.LocalDateTime;

import java.util.Scanner;

import br.dominio.cadastropessoafisica.IRecebeDadosCidadao;

import br.dominio.cadastropessoafisica.Identidade;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Cidadao implements IRecebeDadosCidadao
{      
   private String nome,
           nomePai,
           nomeMae;
   
   private LocalDateTime dataNascimento;
   
   private IRecebeIdentidade rg;
   
   private Identidade identidade;
   
   private Scanner recebe;
   
   private int dia,
           mes,
           ano;
   
   //Fim do campo de declaração de atributos;
   
   
   public void receberDadosCidadao(String nomePessoa, String nomePaiPessoa, String nomeMaePessoa, int diaNascimento, int mesNascimento, int anoNascimento)
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
   public final LocalDateTime retornarDataNascimento()
   {
      return dataNascimento;
   }//Fim do método que retorna a data de nascimento do objeto do tipo Cidadao para a interface IRecebeDadoCidadao;
   
   public Identidade retornarRegistroGeral()
   {
      return rg.retornarIdentidade();
   }//Fim do método que retorna o objeto do tipo RG do objeto do tipo Cidadao;
   
}//Fim da classe Pessoa; 