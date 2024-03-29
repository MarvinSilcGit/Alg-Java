/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package atm;

/**
 *
 * @author belogo
 */

import br.com.dominio.api.Endereco;
import java.util.Date;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;


public abstract class Cidadao
{      
   private String nome;
   
   private Endereco endereco;
   
   private int cpf;
   
   private Date dataNascimento;
   
   //Fim do campo de declaração de atributos;
   
   
   public Cidadao ()
   {
      
   }//Fim do método construtor padrão;
   
   public Cidadao (String nome, int cpf, Date dataNascimento)
   {
      this.nome = nome;
      
      this.cpf = cpf;
      
      this.dataNascimento = dataNascimento;
   }//Fim do método construtor personalizado;
   
   public final String retornarNome()
   {
      return nome;
   }//Fim do método que retorna o nome;
   
   public final String retornarEndereco()
   {
      return endereco.retornarEnderecoCompleto();
   }//Fim do método que retorna o objetivo do tipo Endereco;
  
   public final int retornarCpf()
   {
      return cpf;
   }//Fim do método que retorna o cpf;
   
}//Fim da classe Cidadao; 