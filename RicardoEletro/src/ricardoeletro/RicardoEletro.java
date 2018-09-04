/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricardoeletro;

import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class RicardoEletro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Liquidificador liqui = new Liquidificador();
        Batedeira batedeira = new Batedeira();
        Ferro ferro = new Ferro();
        
        String[] voltagem ={"POTENTE","NORMAL","USB"};
        String [] comprar = {"Liquidificador","Ferro","Batedeira"};
        String [] opcao = {"Eletro de Fábrica","Eletro para vender"};
        do {
            
            
            
        }while (JOptionPane.showConfirmDialog(null,"Deseja fazer algo a mais no nosso sistema", "Compra mais bb", 0)==0);
    }
    
}
