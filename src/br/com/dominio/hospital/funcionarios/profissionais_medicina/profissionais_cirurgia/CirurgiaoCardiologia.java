package br.com.dominio.hospital.funcionarios.profissionais_medicina.profissionais_cirurgia;


import java.util.Date;

import br.com.dominio.api.ProfissionalMedicinaCirurgia;

import br.com.dominio.api.Endereco;

import br.com.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class CirurgiaoCardiologia extends ProfissionalMedicinaCirurgia
{  
   
   public CirurgiaoCardiologia()
   {    
   
   }//Fim do método construtor padrão;
     
   public CirurgiaoCardiologia (String nome, int cpf, String setor, Date dataAdmissao, Endereco endereco, Telefone telefone, String email, int crm, float valorConsulta, float valorCirurgia)
   {     
      super (nome, cpf, setor, dataAdmissao, email, endereco, telefone, crm, valorConsulta, valorCirurgia);  
      
      //Fim do método super da classe mãe ou super classe ProfissionalMedicina;

   }//Fim do método construtor personalizado;
    
   @Override
   public void realizarCirurgia()
   {
      
   }

}//Fim da classe CirurgiaoVascular;