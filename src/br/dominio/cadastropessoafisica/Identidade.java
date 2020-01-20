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

import java.time.LocalDateTime;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Identidade
{  
   private LocalDateTime dataEmissao;
   
   private int cpf,
           rg;
   
   private IRecebeDadosCidadao dadosCidadao;
   
   //Fim do campo de declaraçãoa de atributos;  
 
   
   public String retornarNome()
   {
      return dadosCidadao.retornarNome();
   }//Fim do método que retorna o nome do objeto do tipo Cidadao do objeto do tipo RG;
   
   public final String retornarNomePai()
   {
      return dadosCidadao.retornarNomePai();
   }//Fim do método que retorna o nome do pai do objeto do tipo Cidadao do objeto do tipo RG;
   
   public final String retornarNomeMae()
   {
      return dadosCidadao.retornarNomeMae();
   }//Fim do método que retorna o nome da mãe do objeto do tipo Cidadao do objeto do tipo RG;
   
   public final LocalDateTime retornarDataNascimento()
   {
      return dadosCidadao.retornarDataNascimento();
   }//Fim do método que retorna a data de nascimento do objeto do tipo Cidadao do objeto do tipo RG;
   
   public final LocalDateTime retornarDataEmissao()
   {
      return dataEmissao;
   }
   
   public int retornarCpf()
   {
      return cpf;
   }
   
   public int retornarRg()
   {
      return rg;
   }
   
}//Fim da classe RG; 