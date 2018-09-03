/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicomain;

/**
 *
 * @author aluno
 */
public class Medico {

    protected String CRM;
    protected String nome;
    protected int idade;
    protected double salario;

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int Aposentadoria() {
        if (this.idade >= 55) {
            return 1;

        } else {
            return 0;
        }
    }

    public double ValorAponsentadoria() {
        if (Aposentadoria() == 1) {
            return this.salario * 0.80;

        } else {
            return this.salario;
        }

    }
}
