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

public final class Endereco 
{
   private String bairro,
           rua,
           cidade,
           estado;
   
   private int numero,
           cep;
   
   //Fim do campo de declaração de atributos;
   
   
   public enum Complemento
   {
      CASA,
      APARTAMENTO,
      CHACARA,
      KITNET,
      CasaDeCondominio,
      FLAT,
      TERRENO,
      LoteResidencial,
      Sobrado,
      Cobertura,
      EdificioResidencial,
      Consultorio,
      PredioComercial,
      SalaComercial,
      FAZENDA,
      Galpao,
      Deposito,
      Armazem,
      ImovelComercial,
      LOJA,
      LoteComercial,
      PontoComercial;
  
   }//Fim do enum Complemento;
    
   public enum Estado
   {
      ACRE("Acre"),
      ALAGOAS("Alagoas"),
      AMAPA("Amapa"),
      AMAZONAS("Amazonas"),
      BAHIA("Bahia"),
      CEARA("Ceará"),
      DISTRITO_FEDERAL("Distrito Federal"),
      ESPIRITO_SANTO("Espírito Santo"),
      GOIAS("Goias"),
      MARANHAO("Maranhão"),
      MATO_GROSSO("Mato Grosso"),
      MATO_GROSSO_DO_SUL("Mato Grosso do sul"),
      MINAS_GERAIS("Minas Gerais"),
      PARA("Para"),
      PARAIBA("Paraiba"),
      PARANA("Parana"),
      PERNAMBUCO("Pernambuco"),
      PIAUI("Piaui"),
      RIO_DE_JANEIRO("Rio de Janeiro"),
      RIO_GRANDE_DO_NORTE("Rio Grande do Norte"),
      RIO_GRANDE_DO_SUL("Rio Grande do Sul"),
      RONDONIA("Rondônia"),
      RORAIMA("Roraima"),
      SANTA_CATARINA("Santa Catarina"),
      SAO_PAULO("São Paulo"),
      SERGIPE("Sergipe"),
      TOCANTINS("Tocantins");
      
   
      Estado (String estado)
      {
         this.estado = estado;
      }//Fim do método construtor personalizado;
     
      
      private final String estado;
      
      //Fim do campo de declaração de atributos;
      
      
      public String retornarEstado()
      {
         return estado;
      }//Fim do método que retorna o estado do enum Estado do objeto Endereco;
      
   }//Fim do enum Estado;
   
   
   public Endereco()
   {     
    
   }//Fim do método construtor padrão;
    
   public Endereco (int numero, String bairro, int cep, String rua, String cidade, String estado)
   {    
      this.numero = numero;
       
      this.bairro = bairro;
        
      this.cep = cep;
        
      this.rua = rua;
      
      this.cidade = cidade;
      
      this.estado = estado;
   }//Fim do método construtor personalizado;
    
   public final String retornarEnderecoCompleto()
   {
      return "Rua: " + rua + ", Número: " + numero + ", Bairro: " + bairro + ", CEP: " + cep + ", Rua: " + ", Cidade: " + cidade + ", Estado: " + "" + ", Pais: Brasil";
   }//Fim do método que retorna todos os atributos do objeto do tipo Endereco;
    
   public final int retornarNumero()
   {
      return numero;
   }//Fim do método que retorna o número do objeto do tipo Endereco;
   
   public final String retornarBairro()
   { 
      return bairro;
   }//Fim do método que retorna o bairro do objeto do tipo Endereco;
    
   public final int retornarCep()
   { 
      return cep;
   }//Fim do método que retorna o cep do objeto do tipo Endereco;
    
   public final String retornarRua()
   { 
      return rua;
   }//Fim do método que retorna a rua do objeto do tipo Endereco;
    
   public final String retornarCidade()
   { 
      return cidade;
   }//Fim do método que retorna a cidade do objeto do tipo Endereco;
   
}//Fim da classe Endereco