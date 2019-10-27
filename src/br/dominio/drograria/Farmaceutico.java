package br.dominio.drograria;


import java.util.Date;

import br.dominio.api.Endereco;

import br.dominio.api.Funcionario;

import br.dominio.api.Acesso;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public class Farmaceutico extends Funcionario
{   
   private String crf;
    
   //Fim do campo de declaração de atributos;
   
   public Farmaceutico()
   {
   
   }
    
    public Farmaceutico(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, Date dataAdmissao, Acesso conta, String crf){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, salario, setor, dataAdmissao, conta);
        
        this.crf=crf;
    }
    
    public String retornarCrf(){
      
        return this.crf;
    }
    
}//Fim da classe Farmaceutico;