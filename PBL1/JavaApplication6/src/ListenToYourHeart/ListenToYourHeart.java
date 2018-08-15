/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListenToYourHeart;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class ListenToYourHeart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String nome = JOptionPane.showInputDialog(null,"Digite seu nome","Cadastrando Pessoas",0);
     String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome ");
     int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano"));
     int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite seu mês"));
     int dia= Integer.parseInt(JOptionPane.showInputDialog("Digite  seu dia "));
     Date comparar = new Date(); //Instância da função date
     HeartRates pessoa = new HeartRates(nome, sobrenome, mes, ano, dia); // Passando os parâmetros do objeto para o construtor
        System.out.println("                                                                              FICHA DA PESSOA               ");
     System.out.println("Imprimindo o nome: "+pessoa.getNome()+" "+pessoa.getSobrenome()+"\nImprimindo data de nascimento: "+pessoa.getDia()+"/"+pessoa.getMes()+"/"+pessoa.getAno()); //Imprimindo as informações do usuário
     System.out.println("Imprimindo idade: "+pessoa.calculaIdade(comparar)+"\nImprimindo a frequencia Máxima: "+pessoa.FrequenciaMaxima(comparar)+ "\nImprimindo frequência alvo é: "+pessoa.FrequenciaAlvo(comparar)+"\n");//Imprimindo as funções
     
     
        
    }
    
}
