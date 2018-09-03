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
public class Gerente extends Funcionario{
   private int senha;
   private int nGerenciador;  
   
   
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getnGerenciador() {
        return nGerenciador;
    }

    public void setnGerenciador(int nGerenciador) {
        this.nGerenciador = nGerenciador;
    }

    public double getSalario() {
        return salario*0.15;
    }
 
    
    
    
}
