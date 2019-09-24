/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade;

/**
 *
 * @author belogo
 */

import br.dominio.banco.Acesso;

public class MainUniversidade{
    
    public static void main(String[] args){
                
        Endereco endereco1 = new Endereco("","48400-000","alameda dos anjos","alameda","QG","","");
                
        Endereco endereco3 = new Endereco("","48400-000","alameda dos anjos","alameda","QG","","");
        
        Acesso ac1 = new Acesso("ss","as");
        
        Acesso ac2 = new Acesso();
        
        Estudante e1 = new Estudante("aas",null,"12345","@gmail.com",12,'m',endereco1,10,0,0,8,0,0,"diurno","medicina",20,ac2);
        System.out.println(e1.retornarDescontoAplicado()); 
        
        System.out.println(e1.retornarMensalidade());
    }
}