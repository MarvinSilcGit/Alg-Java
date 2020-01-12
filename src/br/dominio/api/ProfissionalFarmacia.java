package br.dominio.api;


import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class ProfissionalFarmacia extends Funcionario
{   
   private String crf;
    
   //Fim do campo de declaração de atributos;
   
   
   public ProfissionalFarmacia()
   {
   
   }//Fim do método construtor padrão;
    
   public ProfissionalFarmacia (String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, double salario, String setor, Date dataAdmissao, Acesso conta, String crf)
   {     
      super (nome, nascimento, cpf, email, telefone, endereco, salario, setor, dataAdmissao, conta);
        
      //Fim do método super da classe mãe ou super classe Funcionario;
      
      this.crf = crf;
   }//Fim do método construtor personalizado;
    
   public final String retornarCrf()
   {   
      return crf;
   }//Fim do método que retorna o crf do objeto do tipo ProfissionalFarmacia;
    
}//Fim da classe ProfissionalFarmacia;