/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artista;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Cantor extends Artista implements Pontuacao {
  private Banda banda;
  
  
    public Banda getBanda() {
        return banda;
    }

    public void setBanda(Banda banda) {
        this.banda = banda;
    }
  
    

    @Override
    public int CalculaPontuacao(int qtdApresenta) {
        Date data = new Date();
        if(qtdApresenta >=3 && (this.ano - data.getYear()>=18)){
            return 100;
            
        }else{
            return 0;
        }
    }
    
    
}
