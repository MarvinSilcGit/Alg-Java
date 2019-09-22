package br.dominio.biblioteca;


import java.util.ArrayList;

import br.dominio.empresa.Empresa;

import br.dominio.universidade.Funcionario;

import br.dominio.universidade.Endereco;


public class Biblioteca extends Empresa{
    

    private ArrayList listaPratileiras = new ArrayList();
    

    public Biblioteca(){
        
    }
    
    public Biblioteca(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Funcionario presidente, Funcionario vicePresidente){
        
        super(cnpj, razaoSocial, nomeFantasia, endereco, presidente, vicePresidente);
    }
    
    public ArrayList retornarPratileiras(){

        return this.listaPratileiras;
    }

    public void adicionarPratileira(Pratileira add){

        this.listaPratileiras.add(add);
    }

    public void removerPratileira(Pratileira remover){

        this.listaPratileiras.remove(remover);
    }
}