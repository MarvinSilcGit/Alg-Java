package br.dominio.api;

import br.dominio.empresa.Empresa;


public abstract class Conta
{  
   private long numeroContrato;
   
   private Empresa empresaPrestadora;

   //Fim do campo de declaração de atributos;

   
   public Conta()  
   {        
  
   }//Fim do método construtor padrão;
   
   public Conta(long numeroContrato, Empresa empresaPrestadora)
   {
      this.numeroContrato=numeroContrato;
      
      this.empresaPrestadora=empresaPrestadora;
   }//Fim do método construtor personalizado;

   public long retornarNumeroContrato()
   {
      return this.numeroContrato;
   }//Fim do método que retorna o número do contrato do objeto do tipo Conta;
   
   public Empresa retornarEmpresaPrestadora()
   {
      return this.empresaPrestadora;
   }//Fim do método que retorna a empresa prestadora do objeto do tipo Conta;
   
}//Fim da classe Conta;