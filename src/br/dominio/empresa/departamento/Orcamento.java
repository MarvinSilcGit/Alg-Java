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
   }
     
   public float retornarOrcamentoGeralTrimestre()
   {    
      return this.orcamentoGeralTrimestre;
   }
     
   public void alterarOrcamentoGeralTrimestre(float novoOrcamentoGeral)
   {    
      this.orcamentoGeralTrimestre=novoOrcamentoGeral;
   }
     
   public float retornarOrcamentoAdministrativoTrimestre()
   {    
      return this.orcamentoAdministrativoTrimestre;
   }
    
    
   public void alterarOrcamentoAdministrativoTrimestre(float novoOrcamentoAdministrativo)
   {     
      this.orcamentoAdministrativoTrimestre=novoOrcamentoAdministrativo;
   }
   
}//Fim da classe Orcamento;