/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.empresa;

/**
 *
 * @author belogo
 */
 
import br.dominio.universidade.Universidade;
import java.util.ArrayList;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public  class Departamento
{
    private String nome;
    
    private Funcionario diretor, viceDiretor;
    
    private Universidade acessarOrcamento;
    
    private ArrayList listaFuncionarios = new ArrayList(40);
    
    
    public Departamento()
    {
        
    }//Fim do método construtor padrão;
    
    public Departamento(String nome, Funcionario diretor, Funcionario viceDiretor)
    {     
        this.nome=nome;
        
        this.diretor=diretor;
        
        this.viceDiretor=viceDiretor;
    }//Fim do método construtor personalizado;
    
    public String retornarNomeDepartamento()
    {    
        return this.nome;
    }//Fim do método que retorna o nome do objeto do tipo Departamento;
    
    public void alterarNomeDepartamento(String novoNome)
    {    
        this.nome=novoNome;
    }//Fim do método que altera o nome do objeto do tipo Departamento;
    
    public Funcionario retornarDiretor()
    {
        return this.diretor;
    }//Fim do método que retorna o diretor
    
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