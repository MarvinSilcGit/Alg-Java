package br.dominio.republicafederativa.estado;


import br.dominio.republicafederativa.republica.Pais;

import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Estado extends Pais
{    
   private ArrayList listaCidades = new ArrayList();
   
   private ArrayList listaSecretarias = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   
   
   public Estado()
   {     
   
   }//Fim do método construtor padrão;
    
   public Estado(String nome, String moeda, double tesouro, double pib, double idh)
   {     
      super(nome, moeda, tesouro, pib, idh);
      
      //Fim do método construtor Super da classe mãe ou superclasse Pais;
      
   }//Fim do método construtor personalizado;
   
}//Fim da classe Estado;