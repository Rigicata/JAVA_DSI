/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contaarray;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ContaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta[] conta = new Conta[2];
       for (int i = 0;i<2;i++){
           String dono = JOptionPane.showInputDialog("Digite seu nome");
           int limite = Integer.parseInt(JOptionPane.showInputDialog(null,"Continha","Digite o valor do limite",i));
           int agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite  a agencia"));
           conta [i] = new Conta();
           conta[i].setAgencia(agencia);
           conta[i].setDono(dono);
           conta[i].setLimite(limite);
           
           
         
       }
       for (int i=0;i<2;i++){
           System.out.println("Agencia: "+conta[i].getAgencia()+"\nDono: "+conta[i].getDono()+"\n Limite: "+conta[i].getLimite()+"\n Saldo: "+conta[i].getSaldo()+"\n\n");
        
       }
    }
    
}
