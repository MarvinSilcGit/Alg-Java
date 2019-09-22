package br.dominio.universidade;
    

import java.util.Date;

import java.util.ArrayList;

import br.dominio.banco.Acesso;


public class Estudante extends Pessoa{
    

    private int quantidadeDisciplinasSemestre, cargaHoraria, horasExtras, codeMatricula, semestresTotais, semestreAtual;
    
    private String periodoAula, curso;
    
    private double  descontoFiesProUni;
    
    private Acesso conta;
    
    private ArrayList listaBoletins = new ArrayList();
    
    private ArrayList disciplinasCursando = new ArrayList();
    
    private ArrayList disciplinasCursadas = new ArrayList();
    
    
    public Estudante(){
        
    }
    
    public Estudante(String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco, int quantidadeDisciplinasSemestre, int cargaHoraria, int horasExtras, int codeMatricula, int semestresTotais, int semestreAtual, String periodoAula, String curso, double descontoFiesProUni, Acesso conta){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco);
     
        this.quantidadeDisciplinasSemestre=quantidadeDisciplinasSemestre;
        
        this.cargaHoraria=cargaHoraria;
        
        this.horasExtras=horasExtras;
        
        this.codeMatricula=codeMatricula;
        
        this.semestresTotais=semestresTotais;
        
        this.semestreAtual=semestreAtual;
        
        this.periodoAula=periodoAula;
        
        this.curso=curso;
        
        this.descontoFiesProUni=descontoFiesProUni; 
        
        this.conta=conta;
    }
    
    public int retornarQuantidadeDisciplinasSemestre(){
        
        return this.quantidadeDisciplinasSemestre;
    }
    
    public void alterarQuantidadeDisciplinasSemestre(int alterarQuantidadeDisciplinasSemestre){
    
        this.quantidadeDisciplinasSemestre=alterarQuantidadeDisciplinasSemestre;
    }
    
    public int retornarCargaHorária(){
    
        return this.cargaHoraria*this.quantidadeDisciplinasSemestre;
    }
    
    public int retornarHorasExtras(){
    
        return this.horasExtras;
    }
    
    public void aumentarHorasExtras(int alterar){
    
        this.horasExtras=alterar;
    }
    
    public int retornarMatrícula(){
    
        return this.codeMatricula;
    }
    
    public int retornarSemestresTotais(){
    
        return this.semestresTotais;
    }
    
    public int retornarSemestreAtual(){
    
        return this.semestreAtual;
    }
    
    public int retornarSemestresFaltantes(){
    
        return this.semestresTotais-this.semestreAtual;
    }
    
    public String retornarPeriodoAula(){
    
        return this.periodoAula;
    }
    
    public void alterarPeriodoAula(String alterarPeriodoAula){
    
        this.periodoAula=alterarPeriodoAula;
    }
    
    public String retornarCurso(){
    
        return this.curso;
    }
    
    public void alterarCurso(String alterar){
    
        this.curso=alterar;
    }
    
    public double retornarDescontoFiesProUni(){
    
        return this.descontoFiesProUni;
    }
    
    public Acesso acessarContaAcesso(){
    
        return this.conta;
    }
    
    public double retornarDescontoAplicado(){
    
        return (this.retornarMensalidade()/1000)*this.retornarDescontoFiesProUni();
    }
    
    public double retornarMensalidade(){
    
        if (this.retornarCurso().equals("letras")){
        
            return (1200/10)*(this.retornarQuantidadeDisciplinasSemestre()*2);
        }
        else switch (this.retornarCurso()){
           
            case "medicina":
            
                return (7000/10)*(this.retornarQuantidadeDisciplinasSemestre()*2);
            
            case "farmácia":
                
                return (1800/10)*(this.retornarQuantidadeDisciplinasSemestre()*2);
            
            case "odontologia":
            
                return (2700/10)*(this.retornarQuantidadeDisciplinasSemestre()*2);
            
            case "pedagogia":
            
                return (1400/10)*(this.retornarQuantidadeDisciplinasSemestre()*2);
            
            case "psicologia":
            
                return (1900/10)*(this.retornarQuantidadeDisciplinasSemestre()*2);
            
            case "nutrição":
            
                return (1700/10)*(this.retornarQuantidadeDisciplinasSemestre()*2);
            
            case "direito":
                
                return (2200/10)*(this.retornarQuantidadeDisciplinasSemestre()*2);
                
            case "enfermagem":
                
                return (1400/10)*(this.retornarQuantidadeDisciplinasSemestre()*2);
            
            case "medicina veterinária":
                
                return (2700/10)*(this.retornarQuantidadeDisciplinasSemestre()*2);
                
            case "matemática":
                
                return (1300/10)*(this.retornarQuantidadeDisciplinasSemestre()*2);
                
            case "história":
                
                return (1200/10)*(this.retornarQuantidadeDisciplinasSemestre()*2);
                
            default:
            
                return 0;
        }
    }
    
    public ArrayList retornarDisciplinasCursando(){
        
        return this.disciplinasCursando;
    }
    
    public void inserirDisciplinaAluno(Disciplina novaDisciplina){
        
        if (this.retornarDisciplinasCursando().size() == this.retornarQuantidadeDisciplinasSemestre()){
            
            System.out.println("Não é mais possível adcionar disciplinas");
        }
        else{
            
            this.disciplinasCursando.add(novaDisciplina);
        }
    }
    
    public void removerDisciplinaAluno(Disciplina removerDisciplina){
        
        this.disciplinasCursando.remove(removerDisciplina);
    }
    
    public ArrayList retornarDisciplinasCursadas(){
        
        return this.disciplinasCursadas;
    }
}