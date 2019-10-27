package br.dominio.api;


public class Acesso
{    
   private String usuario,
           senha;
    
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
   }//Fim do método que retorna o usuário do objeto do tipo Acesso;
    
   public String retornarSenhaTemporaria()
   {     
      return this.senha+this.usuario;
   }//Fim do método que retorna a senha temporário do objeto do tipo Usuário;
   
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
    }//Fim do método que altera a senha do objeto do tipo Acesso;
   
}//Fim da classe Acesso;