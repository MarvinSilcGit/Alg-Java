/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade;


import java.util.Dictionary;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Boletim
{    
    private int codigo;
 
    private double nota;
    
    private Estudante estudante;
    
    private Dictionary dicionario;
    
    //Fim do campo de declaração de atributos;
    
  
    public Boletim()
    {
            
    }//Fim do método construtor padrão;
    
    public Boletim(int codigo, double nota){
        
        this.codigo=codigo;
        
        this.nota=nota;
    }//Fim do método construtor personalizado;
    
    public int retornarCodigo()
    {    
        return this.codigo;
    }//Fim do método que retorna o codigo do objeto do tipo Boletim;
    
    public double retornarNotaBoletim()
    {
       return this.nota;
    }
    
    public void alterarNotaBoletim(double novaNota)
    {
       this.nota=novaNota;
    }
    
    public void inserirValor(Disciplina nomeDisciplina, double novaNota)
    {     
        this.dicionario.put(nomeDisciplina, novaNota);
    }
    
}//Fim da classe Boletim;