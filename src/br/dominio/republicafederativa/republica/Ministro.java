package br.dominio.republicafederativa.republica;


import java.util.Date;

import java.util.ArrayList;

import br.dominio.api.Funcionario;
import br.dominio.api.Endereco;
import br.dominio.api.Acesso;
import br.dominio.api.Telefone;


public class Ministro extends Funcionario
{
    

   private ArrayList equipe =  new ArrayList();
       
    
   public Ministro()
   {     
   
   }//Fim do método construtor padrão;
    
    public Ministro(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String condicaoCivil, double salario, String setor, Date dataAdmissao, Acesso conta){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, condicaoCivil, salario, setor, dataAdmissao, conta);
    }
    
    public ArrayList retornarListaEquipe(){
 
        return this.equipe;
    }
    
    public void inserirFuncionarioEquipe(Funcionario inserir){
    
        this.equipe.add(inserir);
    }
    
    public void removerFuncionarioEquipe(Funcionario remover){
    
        this.equipe.remove(remover);
    }
    
}//Fim da classe Ministro;