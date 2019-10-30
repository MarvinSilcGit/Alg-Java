package br.dominio.empresa.departamento;


public class Orcamento
{ 
   private float orcamentoGeralTrimestre,
           
            orcamentoAdministrativoTrimestre;
     
   //Fim do campo de declaração de atributos;
    
   
   public Orcamento()
   {
        
   }//Fim do método construtor padrão;
    
   public Orcamento(float orcamentoGeralTrimestre, float orcamentoAdministrativoTrimestre)
   {         
      this.orcamentoGeralTrimestre=orcamentoGeralTrimestre;
        
      this.orcamentoAdministrativoTrimestre=orcamentoAdministrativoTrimestre;
   }//Fim do método construtor padrão;
     
   public float retornarOrcamentoGeralTrimestre()
   {    
      return this.orcamentoGeralTrimestre;
   }//Fim do método que retorna orçamento geral do objeto do tipo Departamento;
     
   public void alterarOrcamentoGeralTrimestre(float novoOrcamentoGeral)
   {    
      this.orcamentoGeralTrimestre=novoOrcamentoGeral;
   }//Fim do método que altera o orcamento do objeto do tipo Departamento;
     
   public float retornarOrcamentoAdministrativoTrimestre()
   {    
      return this.orcamentoAdministrativoTrimestre;
   }//Fim do método que retorna orçamento administrativo do objeto do tipo Departamento;
    
   public void alterarOrcamentoAdministrativoTrimestre(float novoOrcamentoAdministrativo)
   {     
      this.orcamentoAdministrativoTrimestre=novoOrcamentoAdministrativo;
   }//Fim do método que altera orçament administrativo do objeto do tipo Departamento;
   
}//Fim da classe Orcamento;