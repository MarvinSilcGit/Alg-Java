package br.dominio.biblioteca;


public class MainBiblioteca
{ 
   
   public static void main(String[] args)
   {     
      Pratileira romance = new Pratileira("romance",2);
        
      System.out.println(romance.retornarListaLivros());
        
      Biblioteca b1 = new Biblioteca();   
   }//Fim do método main;
    
}//Fim da classe MainBiblioteca