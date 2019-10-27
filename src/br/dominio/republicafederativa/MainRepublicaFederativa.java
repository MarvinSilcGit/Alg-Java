package br.dominio.republicafederativa;


import br.dominio.classesabstratas.Endereco;


public class MainRepublicaFederativa
{
   public static void main(String[] args)
   {   
      Pais pais = new Pais("Brasil","Real",1990000.0,0,0,0);
        
      
      System.out.println(pais.retornarListaPessoas());
        
      
      Estado estado1 = new Estado("Bahia","",0,0,0,0);
        
      
      pais.inserirEstados(estado1.retornarNome());
        
      System.out.println(pais.retornarListaEstados());
    }//Fim do método main;
   
}//Fim da classe MainRepublicaFederativa;