package br.dominio.republicafederativa.republica;


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
    
   
   public Pais()
   {     
   
   }//Fim do método construtor padrão;
    
   public Pais(String nome, Moeda moeda, double tesouro, double pib, double idh, Presidente presidente, VicePresidente vicePresidente)
   {   
      this.nome=nome;
        
      this.moeda=moeda;
        
      this.tesouro=tesouro;
        
      this.pib=pib;
        
      this.idh=idh;
      
      this.presidente=presidente;
      
      this.vicePresidente=vicePresidente;
   }//Fim do primeiro método construtor personalizado;
    
   public Pais(String nome, Moeda moeda, double tesouro, double pib, double idh)
   {
      this.nome=nome;
      
      this.moeda=moeda;
      
      this.tesouro=tesouro;
      
      this.pib=pib;
      
      this.idh=idh;
   }//Fim do segundo método construtor personalizado;
   
   public String retornarNome()
   {     
      return this.nome;
   }//Fim do método que retorna o nome do objeto do tipo Pais;
    
   public Moeda retornarMoedaOficial()
   { 
      return this.moeda;
   }//Fim do método que retorna o objeto do tipo Moeda do objeto do tipo Pais;
    
   public void alterarMoedaOficial(Moeda alterarMoedaOficial)
   { 
      this.moeda=alterarMoedaOficial;
   }//Fim do método que altera o objeto do tipo Moeda do objeto do tipo Pais;
    
   public double retornarTesouro()
   { 
      return this.tesouro;
   }//Fim do método que retorna o tesouro do objeto do tipo Pais;
    
   public void aumentarTesouro(double aumentarValor)
   { 
      this.tesouro=+aumentarValor; 
   }//Fim do método que aumenta o tesouro do objeto do tipo Pais;
   
   public void diminuirTesouro(double diminuirValor)
   {
      this.tesouro-=diminuirValor;
   }//Fim do método que diminui o tesouro do objeto do tipo Pais;
    
   public double retornarPib()
   { 
      return this.pib;
   }//Fim do método que retorna o pib do objeto do tipo Pais;
    
   public double retornarIdh()
   { 
      return this.idh;
   }//Fim do método que retorna o idh do objeto do tipo Pais;
    
   public ArrayList retornarListaEstados()
   { 
      return this.listaEstados;
   }//Fim do método que retorna a lista do objeto do tipo Pais;
    
   public void inserirEstado(Estado novoEstado)
   { 
      this.listaEstados.add(novoEstado);
   }//Fim do método que insere o objeto do tipo Estado na lista do objeto do tipo Pais
    
   public void removerEstado(Estado removerEstado)
   {     
      this.listaEstados.add(removerEstado);
   }//Fim do método que remove o objeto do tipo Estado da lista do objeto do tipo Pais;
   
}//Fim da classe Pais;