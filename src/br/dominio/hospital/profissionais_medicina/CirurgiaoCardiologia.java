package br.dominio.hospital.profissionais_medicina;


import java.util.Date;

import br.dominio.api.ProfissionalMedicina;

import br.dominio.api.Endereco;

import br.dominio.api.Acesso;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class CirurgiaoCardiologia extends ProfissionalMedicina
{  
   private double valorCirurgia;
     
   //Fim do campo de declaração de atributos;
   
   
   public CirurgiaoCardiologia()
   {    
   
   }//Fim do método construtor padrão;
     
   public CirurgiaoCardiologia (String nome, Date nascimento, String cpf, String email, Endereco endereco, String setor, Date dataAdmissao, Acesso conta, String crm, double valorConsulta, double valorCirurgia)
   {     
      super (nome, nascimento, cpf, email, endereco, setor, dataAdmissao, conta, crm, valorConsulta);  
      
      //Fim do método super da classe mãe ou super classe ProfissionalMedicina, inicilizando o seu método construtor personalizado;
         
      this.valorCirurgia = valorCirurgia;
   }//Fim do método construtor personalizado;
    
   @Override
   public final void realizarConsulta()
   {
      
   }//Terminar esse polimorfismo;
   
   public final double retornarValorCirurgia()
   {    
      return valorCirurgia; 
   }//Fim do método que retorna o valor da cirurgia do objeto do tipo CirurgiaoVascular;
     
   public final void alterarValorCirurgia (double valor)
   {    
      valorCirurgia = valor; 
   }//Fim do método que altera o valor da cirurgia do objeto do tipo CirurgiaoVascular;
    
}//Fim da classe CirurgiaoVascular;