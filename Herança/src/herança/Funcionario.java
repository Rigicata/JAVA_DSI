/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

/**
 *
 * @author aluno
 */
public class Funcionario {
      protected String nome;
    protected String cpf;
    protected double salario;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario*0.10;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
  
}
