package br.dominio.api;


public final class Acesso
{    
   private String usuario,
           senha;
    
   //Fim do campo de declaração de atributos;
   
   
   public Acesso()
   {     
   
   }//Fim do método construtor padrão;
 
   public Acesso (String usuario, String senha)
   {     
      this.usuario=usuario;
        
      this.senha=senha;
   }//Fim do método construtor personalizado;
    
   public final String retornarUsuario()
   {      
      return this.usuario;
   }//Fim do método que retorna o usuário do objeto do tipo Acesso;
    
   public final String retornarSenhaTemporaria()
   {     
      return this.senha+this.usuario;
   }//Fim do método que retorna a senha temporário do objeto do tipo Usuário;
   
}//Fim da classe Acesso;