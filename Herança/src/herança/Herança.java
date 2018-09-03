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
public class Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Funcionario funcionario = new Funcionario();
       Gerente gerente = new Gerente();
       
       gerente.setCpf("07740427535");
       gerente.setnGerenciador(154158);
    }
    
}
