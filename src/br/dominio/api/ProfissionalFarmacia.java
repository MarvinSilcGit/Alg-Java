package br.dominio.api;


import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class ProfissionalFarmacia extends Funcionario
{   
   private int crf;
    
   //Fim do campo de declaração de atributos;
   
   
   public ProfissionalFarmacia()
   {
   
   }//Fim do método construtor padrão;
    
   public ProfissionalFarmacia (String nome, int cpf, float salario, String setor, Date dataAdmissao, String email, Endereco endereco, Telefone telefone, int crf)
   {     
      super (nome, cpf, salario, setor, dataAdmissao, email, endereco, telefone);
        
      //Fim do método super da classe mãe ou super classe Funcionario, inicializando o seu primeiro método construtor personalizado;
      
      this.crf = crf;
   }//Fim do método construtor personalizado;
    
   public final int retornarCrf()
   {   
      return crf;
   }//Fim do método que retorna o crf do objeto do tipo ProfissionalFarmacia;
    
}//Fim da classe ProfissionalFarmacia;