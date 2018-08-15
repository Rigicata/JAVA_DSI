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
     Date comparaano = new Date();
     comparaano.setYear(2018);
     //comparaano.setDate(31);
     //comparaano.setMonth(0);
     String nome = JOptionPane.showInputDialog(null,"Digite seu nome","Cadastrando Pessoas",1);
     String sobrenome = JOptionPane.showInputDialog(null,"Digite seu sobrenome ","Cadastrando Pessoas",1);
     int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu ano","Cadastrando Pessoas",1));
     int mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu mês","Cadastrando Pessoas",1));
     int dia= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite  seu dia","Cadastrando Pessoas",1));
     HeartRates pessoa = new HeartRates(nome, sobrenome, mes, ano, dia); // Passando os parâmetros do objeto para o construtor
     if (comparaano.getYear()<ano){
         System.out.println("Infelizmente não foi possível fazer o cálculo da sua idade. Ano incorreto");
   // }else if(comparaano.getMonth()>mes ||mes<=0){//Não tratei do mês de fevereiro ou dos meses bissextos
       //  System.out.println("Infelizmente não foi possível fazer o cálculo da sua idade. Mês incorreto");
    //} else if(dia>comparaano.getDate()|| dia<=0) {
     //    System.out.println("Infelizmente não foi possível fazer o cálculo da sua idade. Dia incorreto");
    }else{
         System.out.println("                                                                                  FICHA DA PESSOA               ");
         System.out.println("Imprimindo o nome: "+pessoa.getNome()+" "+pessoa.getSobrenome()+"\nImprimindo data de nascimento: "+pessoa.getDia()+"/"+pessoa.getMes()+"/"+pessoa.getAno()); //Imprimindo as informações do usuário
         System.out.println("Imprimindo idade: "+pessoa.calculaIdade()+"\nImprimindo a frequencia Máxima: "+pessoa.FrequenciaMaxima()+ "\nImprimindo frequência alvo é: "+pessoa.FrequenciaAlvo()+"\n");//Imprimindo as funções
    }
    }
        
    }
    

