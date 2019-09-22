package br.dominio.supermercado;


import java.util.ArrayList;


public class Estoque{
    

    private int numeroCategorias;

    private ArrayList listaProdutos = new ArrayList();
    

    public Estoque(){
        
    }
    
    public Estoque(int numeroCategorias){
        
        this.numeroCategorias=numeroCategorias;
    }
    
    public int retornarNumeroCategorias(){

        return this.numeroCategorias;
    }

    public ArrayList retornarListaProdutos(){

        return this.listaProdutos;
    }

    public void inserirProdutoListaEstoque(Produto novoCodigo){

        this.listaProdutos.add(novoCodigo);
    }

    public void removerProdutoListaEstoque(Produto removerCodigo){

        this.listaProdutos.remove(removerCodigo);
    }
}