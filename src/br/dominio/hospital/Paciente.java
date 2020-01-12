package br.dominio.hospital;


import br.dominio.api.ProfissionalMedicina;

import br.dominio.api.ProfissionalEnfermagem;

import java.util.Date;

import java.util.ArrayList;

import br.dominio.api.Endereco;

import br.dominio.api.Pessoa;

import br.dominio.drograria.Remedio;

import br.dominio.api.Telefone;

//Fim dos imports de biblioteca de classes ou APIs (Application Programming Interfaces) Java;

//Alterar o tipo de enfermeiro e medico para o paciente: tem que descobrir antes qual a especialidade necessária;
public final class Paciente extends Pessoa
{ 
   private Date dataEntrada,
            dataAlta;
   
   private ArrayList <Remedio> listaRemedios = new ArrayList();
    
   private ArrayList <ProfissionalMedicina> listaMedicos = new ArrayList(3);
    
   private ArrayList <ProfissionalEnfermagem>listasEnfermeiras = new ArrayList(3);

   //Fim do campo de declaração de atributos;
 
   
   public Paciente()
   {
        
   }//Fim do método construtor padrão;
    
   public Paciente (String nome, Date nascimento, String cpf, String email, Telefone telefone, Endereco endereco, Date dataEntrada, Date dataAlta)
   {   
      super (nome, nascimento, cpf, email, telefone, endereco);
       
      //Fim do método super da classe mãe ou superclasse Pessoa, inicializando o método construtor personalizado;
       
      this.dataEntrada = dataEntrada;
        
      this.dataAlta = dataAlta;
   }//Fim do método construtor personalizado;
    
   public final Date retornarDataEntrada()
   {     
      return dataEntrada;
   }//Fim do método que retorna a data de entrada do objeto do tipo Paciente;
    
   public final Date retornarDataAlta()
   {
      return dataAlta;
   }//Fim do método que retorna a data de alta do objeto do tipo Paciente;
    
   public final ArrayList retornarListaRemedios()
   { 
      return listaRemedios;
   }//Fim do método que retorna a lista de remédios do objeto do tipo Paciente;
    
   public final void inserirRemedioListaPaciente (Remedio novoRemedio)
   { 
      listaRemedios.add (novoRemedio);
   }//Fim do método que insere na lista de remédios o objeto do tipo Remedio do objeto do tipo Paciente;
    
   public final void removerRemedioListaPaciente (Remedio removerRemedio)
   { 
       listaRemedios.remove (removerRemedio);
   }//Fim do método que remove da lista de remédios objeto do tipo Remedio do objeto do tipo Paciente;
    
   public final ArrayList retornarListaMedicos()
   {
      return listaMedicos;
   }//Fim do método que retorna a lista de objetos do tipo ProfissionalMedicina do objeto do tipo Paciente;
     
   public final void alterarListaMedicos (ProfissionalMedicina novoMedico, ProfissionalMedicina novoMedico2, ProfissionalMedicina novoMedico3)
   { 
      listaMedicos.add (novoMedico);    
      
      listaMedicos.add (novoMedico2);
        
      listaMedicos.add (novoMedico3);
   }//Fim do método que altera a lista de objetos do tipo ProfisionalMedicina do objeto do tipo Paciente;
  
   public final ArrayList retornarListaEnfermeiras()
   {       
      return listasEnfermeiras;
   }//Fim do método que retorna a lista de objetos do tipo ProfissionalEnfermagem do objeto do tipo Paciente;
    
   public final void alterarListaEnfermeiras (ProfissionalEnfermagem novoProfissionalEnfermagem, ProfissionalEnfermagem novoProfissionalEnfermagem2, ProfissionalEnfermagem novoProfissionalEnfermagem3)
   {  
      listasEnfermeiras.add (novoProfissionalEnfermagem);
        
      listasEnfermeiras.add (novoProfissionalEnfermagem2);
        
      listasEnfermeiras.add (novoProfissionalEnfermagem3);
   }//Fim do método que altera a lista de objetos do tipo ProfissionalEnfermagem do objeto do tipo Paciente;
    
}//Fim da classe Paciente;