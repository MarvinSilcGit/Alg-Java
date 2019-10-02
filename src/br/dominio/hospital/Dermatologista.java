/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */

package br.dominio.hospital;


import java.util.Date;

import br.dominio.cadastro.Endereco;

import br.dominio.banco.Acesso;

import br.dominio.cadastro.Telefone;


public class Dermatologista extends ProfissionalMedicina{
    
    
    
    public Dermatologista(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, String setor, String cargo, Date dataAdmissao, Acesso conta, String crm, double valorConsulta){
        
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, setor, cargo, dataAdmissao, conta, crm, valorConsulta);
    }
    
}//Fim da classe Dermatologista;