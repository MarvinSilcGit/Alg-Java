/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.republicafederativa.republica;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.dominio.api.Funcionario;

public class Gabinete 
{
   private Funcionario chefe,
           secretario,
           subSecretario;
   
   private ArrayList <Funcionario> equipe = new ArrayList(); 
   
   //Fim do campo de declaração dea atributos;
   
   
   public Gabinete()
   {
      
   }//Fim do método construtor padrão;
   
   public Gabinete(Funcionario chefe, Funcionario secretario, Funcionario subSecretario)
   {
      this.chefe=chefe;
      
      this.secretario=secretario;
      
      this.subSecretario=subSecretario;
   }//Fim do método construtor personalizado;
   
}//Fim da classe Gabinete;