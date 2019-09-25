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


public class Disciplina 
{      
   private String nome, tipo, ementa;
    
   private int cargaHoraria, creditos;
    
   private ArrayList listaRequisitos = new ArrayList();
   //Fim do campor de declaração de atributos;
   
    
   public Disciplina()
   {
        
   }//Fim do método construtor padrão;
    
   public Disciplina(String nome, String tipo, String ementa, int cargaHoraria, int creditos)
   {     
      this.nome=nome;
        
      this.tipo=tipo;
        
      this.ementa=ementa;
        
      this.cargaHoraria=cargaHoraria;
        
      this.creditos=creditos;
   }//Fim do método construtor personalizado;
    
   public String retornarNome()
   {  
      return this.nome;
   }
    
   public void alterarNome(String novoNome)
   {      
      this.nome=novoNome;
   }
    
    public String retornarTipo()
    {    
        return this.tipo;
    }
    
    public void alterarTipo(String alterarTipo)
    {   
        this.tipo=alterarTipo;
    }
    
    public String retornarEmenta()
    {    
        return this.ementa;
    }
    
    public void alterarEmenta(String novaEmenta)
    {    
       this.ementa=novaEmenta;
    }
    
    public int retornarCargaHoraria()
    {    
       return this.cargaHoraria;
    }
    
    public void alterarCargaHoraria(int alterarCargaHoraria)
    {    
       this.cargaHoraria=alterarCargaHoraria;
    }
    
    public int retornarCreditos()
    {   
       return this.creditos;
    }
    
    public void alterarCreditos(int novoValor)
    {
       this.creditos=novoValor;
    }
    
    public ArrayList retornarListaRequisitos()
    {    
       return this.listaRequisitos;
    }
    
    public void inserirDisciplinaRequisito(Disciplina novoRequisito)
    {    
       this.listaRequisitos.add(novoRequisito);
    }
    
    public void removerDisciplinaRequisito(Disciplina removerRequisito)
    {    
       this.listaRequisitos.remove(removerRequisito);
    }
    
}//Fim da classe Disciplina