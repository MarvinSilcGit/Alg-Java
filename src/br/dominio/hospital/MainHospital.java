package br.dominio.hospital;


import br.dominio.universidade.Endereco;


public class MainHospital{

    public static void main(String[] args){
        
        Endereco e1 = new Endereco("","","","333","","","");
        
        Paciente p1 = new Paciente("marcos",null,"12131","",null,'s',e1,null,null);
    }   
    
}//Fim da classe MainHospital;