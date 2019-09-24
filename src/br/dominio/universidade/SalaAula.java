package br.dominio.universidade;


public class SalaAula
{    
    
    private String numeroSala, cor;
    
    private int capacidade;
    
    private double area;
    
    private Professor professorResponsavel;
    
    
    public SalaAula()
    {
        
    }
    
    public SalaAula(String numeroSala, String cor, int capacidade,  double area, Professor professorResponsavel)
    {
        
        this.numeroSala=numeroSala;
        
        this.cor=cor;
        
        this.capacidade=capacidade;
        
        this.area=area;
        
        this.professorResponsavel=professorResponsavel;
    }
    
    public String retornarNumeroSala()
    {   
        return this.numeroSala;
    }
    
    public String retornarCor()
    {
        return this.cor;
    }
    
    public void alterarCor(String novaCor)
    {
        this.cor=novaCor;
    }
    
    public int retornarCapacidade()
    {    
        return this.capacidade;
    }
    
    public void alterarCapacidade(int novaCapacidade)
    {    
        this.capacidade=novaCapacidade;
    }
    
    public double retornarArea()
    {
        return this.area;
    }
    
    public void alterarAreaSala(double novaArea)
    {    
        this.area=novaArea;
    }
}