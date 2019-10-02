/*
 *  Classe que faz parte do projeto Classes
 * 
 *  Autor: MVSC 
 */
package br.dominio.empresa;

/**
 *
 * @author belogo
 */

import java.util.ArrayList;

import java.util.Date;

import br.dominio.banco.Acesso;
import br.dominio.cadastro.Endereco;
import br.dominio.cadastro.Telefone;
        
        
public class Diretor extends Funcionario
{
   private ArrayList equipe = new ArrayList();
   
   
   public Diretor()
   {
      
   }
   
   public Diretor(String nome, Date nascimento, String cpf, String email, Telefone telefone, char sexo, Endereco endereco, double salario, String setor, String cargo, Date dataAdmissao, Acesso conta)
   {
      super(nome, nascimento, cpf, email, telefone, sexo, endereco, salario, setor, cargo, dataAdmissao, conta);
   }
        
}