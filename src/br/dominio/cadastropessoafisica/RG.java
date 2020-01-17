/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.cadastropessoafisica;

/**
 *
 * @author belogo
 */

import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class RG
{
   private String nome,
           nomePai,
           nomeMae,
           cpf;
   
   private Date dataEmissao,
           dataNascimento;
   
   private IRecebeDadosCidadao dadosCidadao;
   
   //Fim do campo de declaraçãoa de atributos;  
  
   
   public RG()
   {
      
   }//Fim do método contrutor padrão;
  
   public RG(String cpf, Date dataEmissao)
   {
      this.nome = dadosCidadao.retornarNome();
      
      this.nomePai = dadosCidadao.retornarNomePai();
      
      this.nomeMae = dadosCidadao.retornarNomeMae();
      
      this.cpf = cpf;
      
      this.dataEmissao = dataEmissao;
      
      this.dataNascimento = dadosCidadao.retornarDataNascimento();
   }//Fim do método construtor personalizado;
   
}//Fim da classe RG; 