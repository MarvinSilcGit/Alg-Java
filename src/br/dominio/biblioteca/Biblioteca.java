package br.dominio.biblioteca;


import java.util.ArrayList;

import br.dominio.empresa.Empresa;

import br.dominio.classesabstratas.Funcionario;
import br.dominio.classesabstratas.Endereco;
import br.dominio.classesabstratas.Telefone;


public class Biblioteca extends Empresa{
    

    private ArrayList listaPratileiras = new ArrayList();
    

    public Biblioteca(){
        
    }
    
    public Biblioteca(String cnpj, String razaoSocial, String nomeFantasia, Endereco endereco, Telefone telefone, Funcionario presidente, Funcionario vicePresidente){
        
        super(cnpj, razaoSocial, nomeFantasia, endereco, telefone, presidente, vicePresidente);
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
    
}//Fim da classe Biblioteca;