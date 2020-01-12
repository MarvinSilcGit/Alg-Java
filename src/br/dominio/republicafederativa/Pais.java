package br.dominio.republicafederativa;


import java.util.ArrayList;

import br.dominio.republicafederativa.estado.Estado;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Pais
{   
   private String nome;
                 
   private Moeda moeda;
 
   private double tesouro,
            pib,
            idh;
   
   private Presidente presidente;
   
   private VicePresidente vicePresidente;
    
   private ArrayList <Estado> listaEstados = new ArrayList();
  
   //Fim do campo de declaração de atributos;
    
   //Colocar interfaces para aumentar ou diminuir o tesouro;
   public Pais()
   {     
   
   }//Fim do método construtor padrão;
    
   public Pais (String nome, Moeda moeda, double tesouro, double pib, double idh, Presidente presidente, VicePresidente vicePresidente)
   {   
      this.nome = nome;
        
      this.moeda = moeda;
        
      this.tesouro = tesouro;
        
      this.pib = pib;
        
      this.idh = idh;
      
      this.presidente = presidente;
      
      this.vicePresidente = vicePresidente;
   }//Fim do primeiro método construtor personalizado;
    
   public Pais (String nome, Moeda moeda, double tesouro, double pib, double idh)
   {
      this.nome = nome;
      
      this.moeda = moeda;
      
      this.tesouro = tesouro;
      
      this.pib = pib;
      
      this.idh = idh;
   }//Fim do segundo método construtor personalizado;
   
   public final String retornarNome()
   {     
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Pais;
   
   public final void alterarNome(String novoNome)
   {
      nome = novoNome;
   }//Fim do método que altera o nome do objeto do tipo Pais;
    
   public final Moeda retornarMoedaOficial()
   { 
      return moeda;
   }//Fim do método que retorna o objeto do tipo Moeda do objeto do tipo Pais;
    
   public final void alterarMoedaOficial(Moeda alterarMoedaOficial)
   { 
      moeda = alterarMoedaOficial;
   }//Fim do método que altera o objeto do tipo Moeda do objeto do tipo Pais;
    
   public final double retornarTesouro()
   { 
      return tesouro;
   }//Fim do método que retorna o tesouro do objeto do tipo Pais;
    
   public final void aumentarTesouro(double aumentarValor)
   { 
      tesouro += aumentarValor; 
   }//Fim do método que aumenta o tesouro do objeto do tipo Pais;
   
   public final void diminuirTesouro(double diminuirValor)
   {
      tesouro -= diminuirValor;
   }//Fim do método que diminui o tesouro do objeto do tipo Pais;
    
   public final double retornarPib()
   { 
      return pib;
   }//Fim do método que retorna o pib do objeto do tipo Pais;
    
   public final double retornarIdh()
   { 
      return idh;
   }//Fim do método que retorna o idh do objeto do tipo Pais;
    
   public final ArrayList retornarListaEstados()
   { 
      return listaEstados;
   }//Fim do método que retorna a lista de objetos do tipo Estado do objeto do tipo Pais;
    
   public final void inserirEstado(Estado novoEstado)
   { 
      listaEstados.add(novoEstado);
   }//Fim do método que insere o objeto do tipo Estado na lista do objeto do tipo Pais
    
   public final void removerEstado(Estado removerEstado)
   {     
      listaEstados.add(removerEstado);
   }//Fim do método que remove o objeto do tipo Estado da lista do objeto do tipo Pais;
   
   public final Presidente retornarPresidente()
   {
      return presidente;
   }//Fim do método que retorna o objeto do tipo Presidente do objeto do tipo Pais;
   
   public final VicePresidente retornarVicePresidente()
   {
      return vicePresidente;
   }//Fim do método que retorna o objeto do tipo VicePresidente do objeto do tipo Pais;
   
}//Fim da classe Pais;