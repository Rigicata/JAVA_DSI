/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celumain;

import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class CeluMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String op[] = {"CelularDeFábrica","CelularDaLoja"};
        String escolha =(String) JOptionPane.showInputDialog(null, "Escolha uma das opções a seguir", "Baby, Alô!Oi Nego",JOptionPane.QUESTION_MESSAGE,null,op,op[0]);
        String marca = JOptionPane.showInputDialog(null,"Diga a marca do celular", "Baby, Alô!Oi Nego",0);
        String modelo = JOptionPane.showInputDialog(null,"Diga o modelo do celular", "Baby, Alô!Oi Nego",0);
        int gigas = Integer.parseInt(JOptionPane.showInputDialog(null,"Diga a quantidade de gigas do celular", "Baby, Alô!Oi Nego",0));
        if(escolha.equals("CelularDeFábrica")){
            PojetoCelular celulardefabrica = new PojetoCelular(modelo, marca, gigas);
            System.out.println("                                                               ESSE CELULAR É DE FÁBRICA                         ");
            System.out.println("Imprimindo a marca do celular: "+celulardefabrica.getMarca()+"\nImprimindo o modelo do celular: "+celulardefabrica.getModelo()+"\nImprimindo a quantidade de gigas do celular: "+celulardefabrica.getGigas()+"GB");
        }else{
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do celular","Baby,Alô!Oi Nego",0));
            PojetoCelular celulardaloja = new PojetoCelular(valor, modelo, marca, gigas);
            System.out.println("                                                               ESSE CELULAR É PÁ VENDER                           ");
            System.out.println("Imprimindo a marca do celular: "+celulardaloja.getMarca()+"\nImprimindo o modelo do celular: "+celulardaloja.getModelo()+"\nImprimindo a quantidade de gigas do celular: "+celulardaloja.getGigas()+"GB"+"\nImprimindo o valor do celular: R$"+celulardaloja.getValor());
           

        }  
           
 
    }    
}
