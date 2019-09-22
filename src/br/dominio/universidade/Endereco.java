package br.dominio.universidade;


public class Endereco {
    
    
    private String numero, bairro, cep, complemento, rua, cidade, estado;
    
    
    public Endereco(){     
    
    }
    
    public Endereco(String numero, String bairro, String cep, String complemento, String rua, String cidade, String estado){
        
        this.numero=numero;
       
        this.bairro=bairro;
        
        this.cep=cep;
        
        this.complemento=complemento;
        
        this.rua=rua;
        
        this.cidade=cidade;
        
        this.estado=estado;
    }
    
    public String retornarEnderecoCompleto(){

            return "Rua " + this.rua + ", Número " + this.numero +", Bairro " + this.bairro + ", Complemento " + this.complemento + ", CEP " +this.cep + ", Cidade " +this.cidade + ", Estado" + this.estado;
    }
    
    public void alterarEndereco(String novoNumero, String novoBairro, String novoCEP, String novoComplemento, String novaRua, String novaCidade, String novoEstado){
        
        this.numero=novoNumero;
        
        this.bairro=novoBairro;
        
        this.cep=novoCEP;
        
        this.complemento=novoComplemento;
        
        this.rua=novaRua;
        
        this.cidade=novaCidade;
        
        this.estado=novoEstado;
    }
    
    public String retornarNumero(){
    
        return this.numero;
    }
    
    public String retornarBairro(){
    
        return this.bairro;
    }
    
    public String retornarCep(){
    
        return this.cep;
    }
    
    public String retornarComplemento(){
    
        return this.complemento;
    }
    
    public String retornarRua(){
    
        return this.rua;
    }
    
    public String retornarCidade(){
    
        return this.cidade;
    }
    
    public String retornarEstado(){
    
        return this.estado;
    }
}