/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.republicafederativa;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import br.dominio.api.Funcionario;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public final class Gabinete 
{
   private Funcionario chefe,
           secretario,
           subSecretario;
   
   private ArrayList <Funcionario> equipe = new ArrayList(); 
   
   //Fim do campo de declaração dea atributos;
   
   
   public Gabinete()
   {
      
   }//Fim do método construtor padrão;
   
   public Gabinete (Funcionario chefe, Funcionario secretario, Funcionario subSecretario)
   {
      this.chefe = chefe;
      
      this.secretario = secretario;
      
      this.subSecretario = subSecretario;
   }//Fim do método construtor personalizado;
   
   public final Funcionario retornarChefeGabinete()
   {
      return chefe;
   }//Fim do método que retorna o objeto do tipo Funcionario do objeto do tipo Gabinete;
   
   public final Funcionario retornarSecretario()
   {
      return secretario;
   }//Fim do método que retorna o objeto do tipo Funcionario do objeto do tipo Gabinete;
   
   public final Funcionario retornarSubSecretatio()
   {
      return subSecretario;
   }//Fim do método que retorna o objeto do tipo Funcionario do objeto do tipo Gabinete;
   
}//Fim da classe Gabinete;