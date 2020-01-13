/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.tabelaperiodica;

/**
 *
 * @author belogo
 */

public final class ElementoQuimico 
{
   private int numeroAtomico,
           configuracaoEletronica;
   
   private double massaAtomica;

   private String periodo,
           simbolo;
   
   //Fim do campo de declaração de atributos;
   
   
   public enum Tipo
   {
      NAO_METAIS,
      METAIS_ALCALINOS,
      SEMI_METAIS,
      OUTROS_METAIS,
      LANTANIDEOS,
      GASES_NOBREAS,
      METAIS_ALCALINO_TERROSOS,
      HALOGENIOS,
      METAIS_DE_TRANSICAO,
      ACTNIDIOS;  
   }//Fim do Tipo;
   
   public enum Grupo
   {
      UM,
      DOIS,
      TRES,
      QUATRO,
      CINCO,
      SEIS,
      SETE,
      OITO,
      NOVE,
      DEZ,
      ONZE,
      DOZE,
      TREZE,
      QUATORZE,
      QUINZE,
      DEZESSEIS,
      DEZESSETE,
      DEZOITO;
   }//Fim do enum Grupo;
   
   public enum Simbolo
   {
      
   }//Fim do enum Simbolo;
   
   public enum Periodo
   {
      
   }//Fim do enum Periodo;
   
      
   public ElementoQuimico()
   {
      
   }//Fim do método construtor padrão;
   
   public ElementoQuimico(int numeroAtomico, int configuracaoEletronica, double massaAtomica)
   {
      this.numeroAtomico = numeroAtomico;
      
      this.configuracaoEletronica = configuracaoEletronica;
   }//Fim do método construtor personalizado;
   
   public final int retornarNumeroAtomico()
   {
      return numeroAtomico;
   }//Fim do método que retorna o número atômico do objeto do tipo ElementoQuimico;
   
   public final int retornarConfiguracaoEletronica()
   {
      return configuracaoEletronica;
   }//Fim do método que retorna a configuração eletrônica do objeto do tipo ElementoQuimico;
   
   public final double massaAtomica()
   {
      return massaAtomica;
   }//Fim do método que retorna a massa atômica do objeto do tipo ElementoQuimico;
   
}//Fim da classe ElementoQuimico;