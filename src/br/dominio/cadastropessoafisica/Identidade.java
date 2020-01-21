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

import java.util.Scanner;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Identidade
{  
   private int cpf,
           rg;
   
   private IRecebeDadosCidadao dadosCidadao;
   
   private Scanner scanner;
   
   private int mes,
           dia,
           ano;
   
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
   
   public final void asdasd()
   {
      dia = scanner.nextInt(dadosCidadao.retornarDiaNascimento());
      
      mes = scanner.nextInt(dadosCidadao.retornarMesNascimento());
      
      ano = scanner.nextInt(dadosCidadao.retornarAnoNascimento());
   }//Fim do método que retorna a data de nascimento do objeto do tipo Cidadao do objeto do tipo RG;
   
   public int retornarCpf()
   {
      return cpf;
   }
   
   public int retornarRg()
   {
      return rg;
   }
   
}//Fim da classe RG; 