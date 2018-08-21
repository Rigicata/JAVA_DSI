/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadeira;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class MainCadeira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* PojetoCadeira cadeira = new PojetoCadeira();
        String cor = JOptionPane.showInputDialog("Digite a cor da cadeira");
        String material = JOptionPane.showInputDialog("Digite o material");
        cadeira.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));
        int verificabraco = JOptionPane.showConfirmDialog(null, "Aqui tem braço?");//No showinputconfirm diaolog quando você clica em sim é igual a 1 e não é 1
        boolean braco = false;
        if(verificabraco==1){
            braco = false;
        }else{
            braco = true;
        }
        cadeira.Personalizar(cor, material, braco, altura);
        cadeira.atribuirValor(altura);
        
        System.out.println("O valor da cadeira: "+cadeira.valor);
        System.out.println("A cor da cadeira: "+cadeira.cor);
        System.out.println("A cadeira: "+cadeira.braco+"Para o braço");
        System.out.println("A altura da cadeira: "+cadeira.altura);
    }*/

        PojetoCadeira[] cadeiras = new PojetoCadeira[5];
        for (int i = 0; i < 5; i++) {
            PojetoCadeira cadeira = new PojetoCadeira();
            float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));
            cadeira.setAltura(altura);
            int verificabraco = JOptionPane.showConfirmDialog(null, "Aqui tem braço?");
            if (verificabraco == 1) {
                cadeira.setBraco(false);
            } else {
                cadeira.setBraco(true);
            }
            cadeira.setCor(JOptionPane.showInputDialog("Digite a cor da cadeira"));
            cadeira.setMaterial(JOptionPane.showInputDialog("Digite o material"));
            cadeira.atribuirValor();
            cadeiras[i] = cadeira;

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Altura: "+cadeiras[i].getAltura()+"\nMaterial: "+cadeiras[i].getMaterial()+"\nValor"+cadeiras[i].getValor()+"\\n");
        }

    }

}
