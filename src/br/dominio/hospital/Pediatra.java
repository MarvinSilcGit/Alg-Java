package br.dominio.hospital;


import java.util.Date;

import br.dominio.universidade.Endereco;

import br.dominio.banco.Acesso;


public class Pediatra  extends ProfissionalMedicina
{

    public Pediatra(String nome, Date nascimento, String cpf, String email, int telefone, char sexo, Endereco endereco, String setor, String cargo, Date dataAdmissao, Acesso conta, String crm, double valorConsulta)
    {     
        super(nome, nascimento, cpf, email, telefone, sexo, endereco, setor, cargo, dataAdmissao, conta, crm, valorConsulta);   
    }
}