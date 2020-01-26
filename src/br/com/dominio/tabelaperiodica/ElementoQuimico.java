/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.com.dominio.tabelaperiodica;

/**
 *
 * @author belogo
 */

public final class ElementoQuimico 
{
   private int numeroAtomico,
           configuracaoEletronica;
   
   private double massaAtomica;
   
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
      H,
      LI,
      NA,
      K,
      RB,
      CS,
      FR,
      BE,
      MG,
      CA,
      SR,
      BA,
      RA,
      SC,
      Y,
      TI,
      ZR,
      HF,
      RF,
      V,
      NB,
      TA,
      DB,
      CR,
      MO,
      W,
      SG,
      MN,
      TC,
      RE,
      BH,
      FE,
      RU,
      OS,
      HS,
      CO,
      RH,
      IR,
      MT,
      NI,
      PD,
      PT,
      DS,
      CU,
      AG,
      AU,
      RG,
      ZN,
      CD,
      HG,
      CN,
      B,
      AL,
      GA,
      IN,
      TL,
      NH,
      C,
      SI,
      GE,
      SN,
      PB,
      FL,
      N,
      P,
      AS,
      SB,
      BI,
      MC,
      O,
      S,
      SE,
      TE,
      PO,
      LV,
      F,
      CL,
      BR,
      I,
      AT,
      TS,
      HE,
      NE,
      AR,
      KR,
      XE,
      RN,
      OG,
      LA,
      AC,
      CE,
      TH,
      PR,
      PA,
      ND,
      U,
      PM,
      NP,
      SM,
      PU,
      EU,
      AM,
      GD,
      CM,
      TB,
      BK,
      DY,
      CF,
      HO,
      ES,
      ER,
      FM,
      TM,
      MD,
      YB,
      NO,
      LU,
      LR;
   }//Fim do enum Simbolo;
   
   public enum Periodo
   {
      UM,
      DOIS,
      TRES,
      QUARTO,
      QUINTO,
      SEXTO,
      SETIMO,
      OITAVO;
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