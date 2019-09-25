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
    
    
    public Estudante()
    {    
    
    }
    
    public Estudante(String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco, int quantidadeDisciplinasSemestre, int cargaHoraria, int horasExtras, int codeMatricula, String periodoAula, String curso, double descontoFiesProUni, Acesso conta)
    {    
        super(nome, nascimento, cpf, email, telefone, sexo, endereco);
     
        this.horasExtras=horasExtras;
        
        this.codeMatricula=codeMatricula;
        
        this.descontoFiesProUni=descontoFiesProUni; 
        
        this.conta=conta;
    }
    
    public int retornarHorasExtras()
    {
        return this.horasExtras;
    }
    
    public void aumentarHorasExtras(int alterar)
    {
        this.horasExtras=alterar;
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