package br.dominio.universidade;


import java.util.ArrayList;


public class Disciplina 
{      
   private String nome, tipo, ementa;
    
   private SalaAula numeroSala;
    
   private int cargaHoraria, creditos;
    
   private ArrayList listaRequisitos = new ArrayList();
    
    
   public Disciplina()
   {
        
   }
    
   public Disciplina(String nome, String tipo, String ementa, int cargaHoraria, int creditos)
   {     
      this.nome=nome;
        
      this.tipo=tipo;
        
      this.ementa=ementa;
        
      this.cargaHoraria=cargaHoraria;
        
      this.creditos=creditos;
   }
    
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
    
    public String retornarNumeroSala()
    {    
       return this.numeroSala.retornarNumeroSala();
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
    
}//Fimd da classe Disciplina