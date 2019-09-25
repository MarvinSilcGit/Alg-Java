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

import java.util.Date;

import java.util.ArrayList;

import br.dominio.banco.Acesso;


public class Estudante extends Pessoa
{
    private int horasExtras, codeMatricula;
    
    private double  descontoFiesProUni;
    
    private Acesso conta;
    
    private ArrayList listaBoletins = new ArrayList();
    
    private ArrayList disciplinasCursando = new ArrayList();
    
    private ArrayList disciplinasCursadas = new ArrayList();
    
    private ArrayList listaCursos = new ArrayList(); 
    
    //Fim do campo de declaração de atributos;
    
    
    public Estudante()
    {    
    
    }//Fim do método construtor padrão;
    
    public Estudante(String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco, int horasExtras, int codeMatricula, double descontoFiesProUni, Acesso conta)
    {    
        super(nome, nascimento, cpf, email, telefone, sexo, endereco);
        
        //Fim do método Super da classe mão ou Superclasse Pessoa, inicializando um de seus construtores;
     
        this.horasExtras=horasExtras;
        
        this.codeMatricula=codeMatricula;
        
        this.descontoFiesProUni=descontoFiesProUni; 
        
        this.conta=conta;
    }//Fim do método construtor personalizado;
    
    public int retornarHorasExtras()
    {
        return this.horasExtras;
    }
    
    public void aumentarHorasExtras(int valor)
    {
        this.horasExtras+=valor;
    }
    
    public void diminuirHoasExtras(int valor)
    {
       this.horasExtras-=valor;
    }
    
    public int retornarMatrícula()
    {
        return this.codeMatricula;
    }
    
    public double retornarDescontoFiesProUni()
    {
        return this.descontoFiesProUni;
    }
    
    public Acesso acessarContaAcesso()
    {
        return this.conta;
    }
    
    public ArrayList retornarDisciplinasCursando()
    {      
        return this.disciplinasCursando;
    }
    
    public ArrayList retornarDisciplinasCursadas()
    {   
        return this.disciplinasCursadas;
    }
    
}//Fim da classe Estudante;