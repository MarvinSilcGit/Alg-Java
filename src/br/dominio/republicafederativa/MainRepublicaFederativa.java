package br.dominio.republicafederativa;


import br.dominio.universidade.Endereco;


public class MainRepublicaFederativa
{

    public static void main(String[] args)
    {
        Endereco e1 = new Endereco("","","","333","","","");
        
        Pais pais = new Pais("Brasil","Real",1990000.0,0,0,0);
        
        System.out.println(pais.retornarListaPessoas());
        
        Estado estado1 = new Estado("Bahia","",0,0,0,0);
        
        pais.inserirEstados(estado1.retornarNome());
        
        System.out.println(pais.retornarListaEstados());
    }
}