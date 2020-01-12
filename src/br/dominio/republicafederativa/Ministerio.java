package br.dominio.republicafederativa;


import java.util.ArrayList;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;
//Criar classe Servidor;

public final class Ministerio
{     
   private String nome;

   private Ministro ministro;

   private double orcamentoAnual;

   private ArrayList listaServidores = new ArrayList();
   
   //Fim do campo de declaração de atributos;
   

   public Ministerio()
   {
      
   }//Fim do método construtor padrão;
    
   public Ministerio (String nome, Ministro ministro, double orcamentoAnual)
   {     
      this.nome = nome;

      this.ministro = ministro;

      this.orcamentoAnual = orcamentoAnual;
   }//Fim do método construtor personalizado;
    
   public final String retornarNome()
   {
      return nome;
   }//Fim do método que retorna o nome do objeto do tipo Ministerio;

   public final void alterarNome(String novoNome)
   {  
      nome = novoNome;
   }//Fim do método que altera o nome do objeto do tipo Ministerio;

   public final Ministro retornarMinistro()
   {  
      return  ministro;
   }//Fim do método que retorna o objeto do tipo Ministro do objeto do tipo Ministerio;

   public final void alterarMinistro(Ministro novoMinistro)
   {  
      ministro = novoMinistro;
   }//Fim do método que altera o objeto to tipo Ministro do objeto do tipo Ministerio;

   public final double retornarOrcamentoAnual()
   {
      return orcamentoAnual;
   }//Fim do método que retorna o orçamento anual;

   public final void alterarOrcamentoAnual(double novoOrcamento)
   {
      orcamentoAnual=novoOrcamento;
   }//Fim do método que altera o orçamento anual do objeto do tipo Ministerio;
   
   public final ArrayList retornarListaServidores()
   {
      return listaServidores;
   }//Fim do método que retorna a lista servidores do objeto do tipo Ministerio;

   public final void inserirServidor(Funcionario novoServidor)
   {
      listaServidores.add(novoServidor);
   }//Fim do método que insere o objeto do tipo Servidor na lista do objeto do tipo Ministerio;

   public final void removerServidor(Funcionario removerServidor)
   {
      listaServidores.remove(removerServidor);
   }//Fim do método que remove o objeto do tipo Servidor da lista do objeto do tipo Ministerio;
   
}//Fim da classe Ministerio;