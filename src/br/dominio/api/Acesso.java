package br.dominio.api;


public class Acesso
{    
   private String usuario, senha;
    
   //Fim do campo de declaração de atributos;
   
   
   public Acesso()
   {     
   
   }//Fim do método construtor padrão;
 
   public Acesso(String usuario, String senha)
   {     
      this.usuario=usuario;
        
      this.senha=senha;
   }//Fim do método construtor personalizado;
    
   public String retornarUsuario()
   {      
      return this.usuario;
   }
    
   public void alterarSenha(String alterar)
   { 
      if (alterar.length()<8)
      {       
         System.out.println("Senha muito pequena");
      }
      else
      {      
         this.senha=alterar;
      }
    }
    
   public String retornarSenhaTemporaria()
   {     
      return this.senha+this.usuario;
   }
   
}//Fim da classe Acesso;