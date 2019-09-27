/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade;

/**
 *
 * @author belogo
 */

 
import java.util.ArrayList;


public  class Departamento
{
    private String nome;
    
    private Funcionario diretor, viceDiretor;
    
    private Universidade acessarOrcamento;
    
    private ArrayList listaFuncionarios = new ArrayList(40);
    
    
    public Departamento()
    {
        
    }
    
    public Departamento(String nome, Funcionario diretor, Funcionario viceDiretor)
    {     
        this.nome=nome;
        
        this.diretor=diretor;
        
        this.viceDiretor=viceDiretor;
    }
    
    public String retornarNomeDepartamento()
    {    
        return this.nome;
    }
    
    public void alterarNomeDepartamento(String novoNome)
    {    
        this.nome=novoNome;
    } 
    
    public Funcionario retornarDiretor()
    {
        return this.diretor;
    }
    
    public void alterarDiretor(Funcionario novoDiretor)
    {
        this.diretor=novoDiretor;
    }
    
    public Funcionario retornarViceDiretor()
    {    
        return this.viceDiretor;
    }
    
    public void alterarViceDiretor(Funcionario novoViceDiretor)
    {    
        this.viceDiretor=novoViceDiretor;
    }
    
    public Universidade acessarOrcamento()
    {    
        return this.acessarOrcamento;
    }
    
    public ArrayList retornarListaFuncionarios()
    {
        return this.listaFuncionarios;
    }
    
    public void inserirFuncionarioDepartamento(Funcionario novoFuncionario)
    { 
        if (this.listaFuncionarios.size()==40)
        {    
            System.out.println("Não é mais possível adicionar funcionário ao departamento "+this.nome);
        }
        else
        {    
            this.listaFuncionarios.add(novoFuncionario);
        }
    }
    
    public void removerFuncionarioDepartamento(Funcionario removerFuncionario)
    {     
        if (this.listaFuncionarios.size()==0)
        {    
            System.out.println("Este departamento será automaticamente excluído da Universidade");
        }
        else
        {    
            this.listaFuncionarios.remove(removerFuncionario);
        }
    }
    
}//Fim da classe Departamento;