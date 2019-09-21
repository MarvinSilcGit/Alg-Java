package br.dominio.banco;


public class Acesso{
    

    private String usuario, senha;
    
    public Acesso(){
        
    }
 
    public Acesso(String usuario, String senha){
        
        this.usuario=usuario;
        
        this.senha=senha;
    }
    
    public String retornarUsuario(){
        
        return this.usuario;
    }
    
    public void alterarSenha(String alterar){
    
        if (alterar.length()<8){
            
            System.out.println("Senha muito pequena");
        }
        else{
            
            this.senha=alterar;
        }
    }
    
    public String retornarSenhaTemporaria(){
        
        return this.senha+this.usuario;
    }
}