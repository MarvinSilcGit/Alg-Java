package br.dominio.biblioteca;


import java.util.ArrayList;


public class Pratileira{
    
   
    private String nome;
 
    private int capacidade;
    
    private ArrayList listaLivros = new ArrayList();

    
    public Pratileira(){
        
    }
    
    public Pratileira(String nome, int capacidade){
        
        this.nome=nome;
    
        this.capacidade=capacidade;
    }
    
    public String retornarNomePratileira(){
        
        return this.nome;
    }
    
    public int retornarCapacidadePratileira(){
    
        return this.capacidade;
    }
    
    public ArrayList retornarListaLivros(){
    
        return this.listaLivros;
    }
    
    public void inserirLivro(Livro inserir){
    
        if (this.listaLivros.size()>=this.capacidade){
        
            System.out.println("Pratileira Cheia");
        }
        else{
        
            if (this.listaLivros.contains(inserir)){
                
                System.out.println("O livro "+inserir.retornarTitulo()+", com o códido ISBN "+inserir.retornarIsbn()+", já está na pratileira");
            }
            else{
            
                this.listaLivros.add(inserir);
                
                if (this.listaLivros.size()==this.capacidade){
                    
                    System.out.println("A pratileira "+this.nome+" chegou a sua capacidade máxima");
                }
            }
        }
    }
    public void removerLivro(Livro remover){
        
        if (this.listaLivros.contains(remover)){
            
            this.listaLivros.remove(remover);
        }
        else{
        
            System.out.println("O livro "+remover.retornarTitulo()+", com o código ISBN "+remover.retornarIsbn()+", não está na pratileira para ser removido");
        }
    }
}