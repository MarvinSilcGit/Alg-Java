/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.universidade;


import java.util.Dictionary;

import java.util.ArrayList;


public class Boletim {

    
    private int codigo;
    
    private ArrayList listaDisciplinas = new ArrayList();
    
    private Dictionary dicionario;
    
  
    public Boletim(){
            
    }
    
    public Boletim(int codigo){
        
        this.codigo=codigo;
    }
    
    public int retornarCodigo(){
        
        return this.codigo;
    }
    
    public void inserirValor(int novo, String novo1){
        
        this.dicionario.put(novo, novo1);
    }
}