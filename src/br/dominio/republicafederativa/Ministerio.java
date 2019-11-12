package br.dominio.republicafederativa.republica;


import java.util.ArrayList;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;
//Criar classe Servidor;

public class Ministerio
{     
   private String nome;

   private Ministro ministro;

   private double orcamentoAnual;

   private ArrayList listaServidores = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   

   public Ministerio()
   {
      
   }//Fim do método construtor padrão;
    
   public Ministerio(String nome, Ministro ministro, double orcamentoAnual)
   {     
      this.nome=nome;

      this.ministro=ministro;

      this.orcamentoAnual=orcamentoAnual;
   }//Fim do método construtor personalizado;
    
   public String retornarNome()
   {
      return this.nome;
   }//Fim do método que retorna o nome do objeto do tipo Ministerio;

   public void alterarNome(String novoNome)
   {  
      this.nome=novoNome;
   }//Fim do método que altera o nome do objeto do tipo Ministerio;

   public Ministro retornarMinistro()
   {  
      return  this.ministro;
   }//Fim do método que retorna o objeto do tipo Ministro do objeto do tipo Ministerio;

   public void alterarMinistro(Ministro novoMinistro)
   {  
      this.ministro=novoMinistro;
   }//Fim do método que altera o objeto to tipo Ministro do objeto do tipo Ministerio;

   public double retornarOrcamentoAnual()
   {
      return this.orcamentoAnual;
   }//Fim do método que retorna o orçamento anual;

   public void alterarOrcamentoAnual(double novoOrcamento)
   {
      this.orcamentoAnual=novoOrcamento;
   }//Fim do método que altera o orçamento anual do objeto do tipo Ministerio;
   
   public ArrayList retornarListaServidores()
   {
      return this.listaServidores;
   }//Fim do método que retorna a lista servidores do objeto do tipo Ministerio;

   public void inserirServidor(Funcionario novoServidor)
   {
      this.listaServidores.add(novoServidor);
   }//Fim do método que insere o objeto do tipo Servidor na lista do objeto do tipo Ministerio;

   public void removerServidor(Funcionario removerServidor)
   {
      this.listaServidores.remove(removerServidor);
   }//Fim do método que remove o objeto do tipo Servidor da lista do objeto do tipo Ministerio;
   
}//Fim da classe Ministerio;