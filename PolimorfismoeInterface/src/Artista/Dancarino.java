/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artista;

/**
 *
 * @author aluno
 */
public class Dancarino extends Artista implements Pontuacao{

    @Override
    public int CalculaPontuacao(int qtdApresenta) {
       if (qtdApresenta>=5){
           return 100;
       }else{
           return 0;
       }

    }
 
    
    
    
    
    
    
}
