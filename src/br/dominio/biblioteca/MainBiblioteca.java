package br.dominio.biblioteca;


public class MainBiblioteca{
    
   
    public static void main(String[] args){
        
        Livro l1 = new Livro("O capital","","","","","",3,844,0,null);
        
        Livro l2 = new Livro("o captial","","","","","",2,844,0,null);
        
        Pratileira romance = new Pratileira("romance",2);
        
        romance.inserirLivro(l1);
        
        romance.inserirLivro(l1);
        
        System.out.println(romance.retornarListaLivros());
        
        Biblioteca b1 = new Biblioteca();   
    }    
}