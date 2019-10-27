package br.dominio.republicafederativa.republica;


import br.dominio.republicafederativa.estado.Estado;

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Pais
{   
   private String nome,
            moeda;
 
   private double tesouro,
            pib,
            idh;
   
   private Presidente presidente;
   
   private VicePresidente vicePresidente;
    
   private ArrayList listaEstados = new ArrayList();
   
   //Fim do campo de declaração de atributos;
    
   
   public Pais()
   {     
   
   }//Fim do método construtor padrão;
    
   public Pais(String nome, String moeda, double tesouro, double pib, double idh, Presidente presidente, VicePresidente vicePresidente)
   {   
      this.nome=nome;
        
      this.moeda=moeda;
        
      this.tesouro=tesouro;
        
      this.pib=pib;
        
      this.idh=idh;
      
      this.presidente=presidente;
      
      this.vicePresidente=vicePresidente;
   }//Fim do primeiro método construtor personalizado;
    
   public Pais(String nome, String moeda, double tesouro, double pib, double idh)
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
   }
    
   public String retornarMoedaOficial()
   { 
      return this.moeda;
   }
    
   public void alterarMoedaOficial(String alterarMoedaOficial)
   { 
      this.moeda=alterarMoedaOficial;
   }
    
   public double retornarTesouro()
   { 
      return this.tesouro;
   }
    
   public void aumentarTesouro(double aumentarValor)
   { 
      this.tesouro=+aumentarValor; 
   }
   
   public void diminuirTesouro(double diminuirValor)
   {
      this.tesouro-=diminuirValor;
   }
    
   public double retornarPib()
   { 
      return this.pib;
   }
    
   public double retornarIdh()
   { 
      return this.idh;
   }
    
   public ArrayList retornarListaEstados()
   { 
      return this.listaEstados;
   }
    
   public void inserirEstados(String novoEstado)
   { 
      this.listaEstados.add(novoEstado);
   }
    
   public void removerEstados(Estado removerEstado)
   {     
      this.listaEstados.add(removerEstado);
   }
   
}//Fim da classe Pais;