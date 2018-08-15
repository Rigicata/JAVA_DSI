/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListenToYourHeart;

import java.util.Date;

/**
 *
 * @author wesle
 */
public class HeartRates {
    private String nome;
    private String sobrenome;
    private int mes;
    private int ano;
    private int dia;
   

   public HeartRates(String nome, String sobrenome, int mes, int ano, int dia) {
        
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.mes = mes;
        this.ano = ano;
        this.dia = dia;
    }

 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    public int calculaIdade(Date comparar){
        if(comparar.getDay()<this.dia && comparar.getMonth()<this.mes){// Condição para caso a idade seja menor que a data atual e assim a idade dele vai ser diminuída
            return (2018-this.ano)-1; 
        }
           
           
        else{
            return 2018 - this.ano;
        }
         
        
    } 
    public int FrequenciaMaxima(Date comparar){
        return 220 - calculaIdade(comparar);
    }
    public int FrequenciaAlvo(Date comparar){
        
       int x = (85*FrequenciaMaxima(comparar))/100 - (50*FrequenciaMaxima(comparar))/100 ; //é a média entre os 50%~85% da frequênciaMaxima
        return x;
     }
}
